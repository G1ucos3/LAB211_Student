package repository;

import dataAccess.StudentDao;
import java.util.List;
import model.Student;

/**
 *
 * @author ASUS
 */
public class StudentRepository implements IStudent {

    @Override
    public void sortStudent(List<Student> ls) {
        StudentDao.Instance().sortStudent(ls);
    }

    @Override
    public void view(List<Student> ls) {
        if (ls.isEmpty()) {
            System.out.println("List empty.");
        }
        StudentDao.Instance().view(ls);
    }
}
