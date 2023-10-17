package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Student {

    private String name;
    private float mark;
    private String classes;

    private List<Student> ls = new ArrayList<>();

    public Student() {
    }

    public Student(String name, float mark, String classes) {
        this.name = name;
        this.mark = mark;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public List<Student> getLs() {
        return ls;
    }

    public void setLs(List<Student> ls) {
        this.ls = ls;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName()
                + "\nClasses: " + this.getClasses()
                + "\nMark: " + this.getMark();
    }
}
