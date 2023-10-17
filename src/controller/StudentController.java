package controller;

import model.Student;
import repository.StudentRepository;
import view.Menu;

/**
 *
 * @author ASUS
 */
public class StudentController extends Menu{

    static String[] mc = {"Add and sort student", "Display student information",
                                "Exit"};
    Student student;
    StudentRepository sr;
    
    public StudentController(){
        super("Manage Student", mc);
        student = new Student();
        sr = new StudentRepository();
    }
    

    @Override
    public void execute(int choice) {
        switch(choice){
            case 1:
                System.out.println("====== Collection Sort Program ======");
                sr.sortStudent(student.getLs());
                break;
            case 2:
                System.out.println("===== Student Information =====");
                sr.view(student.getLs());
                break;
            case 3:
                System.out.println("Close..");
                System.exit(0);
            default:
                System.out.println("Choose again.");
                break;
        }
    }
}

