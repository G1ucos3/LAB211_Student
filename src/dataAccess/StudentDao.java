package dataAccess;

import common.Sorting;
import common.Validate;
import java.util.Collections;
import java.util.List;
import model.Student;

/**
 *
 * @author ASUS
 */
public class StudentDao {

    private static StudentDao instance = null;
    protected Validate validate = new Validate();

    public static StudentDao Instance() {
        if (instance == null) {
            synchronized (StudentDao.class) {
                if (instance == null) {
                    instance = new StudentDao();
                }
            }
        }
        return instance;
    }

    public List<Student> sortStudent(List<Student> ls) {
        do {
            String name = validate.checkString("Name");
            String classes = validate.checkString("Classes");
            float mark = validate.checkMark("Mark");
            Student student = new Student(name, mark, classes);
            ls.add(student);
        } while (validate.inputYN("Do you want to enter more student information?(Y/N)"));
        Collections.sort(ls, new Sorting());
        return ls;
    }

    public void view(List<Student> ls) {
        int i = 1;
        for (Student student : ls) {
            System.out.println("-------------Student " + i + " -------------");
            System.out.println(student.toString());
            i++;
        }
    }
}
