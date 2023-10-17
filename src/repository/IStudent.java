package repository;

import java.util.List;
import model.Student;

/**
 *
 * @author ASUS
 */
public interface IStudent {

    void sortStudent(List<Student> ls);

    void view(List<Student> ls);
    
}
