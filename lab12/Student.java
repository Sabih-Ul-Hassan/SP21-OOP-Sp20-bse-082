package lab12;

import java.util.Objects;
import java.util.Scanner;

public class Student extends Person implements Association {
    private int rollNo, semester;

    public Student() {
    }
    public void associate(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the roll no");
        rollNo = Integer.parseInt(input.nextLine());
        System.out.println("Enter the semester");
        semester =  Integer.parseInt(input.nextLine());;
    }

    public Student(String name, String id) {
        super(name, id);
        associate();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name) &&
                id.equals(student.id) &&
                rollNo == student.rollNo &&
                semester == student.semester;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", semester=" + semester +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
