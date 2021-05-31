package lab12;

import java.util.Objects;
import java.util.Scanner;

public class Teacher extends Person implements Association {
    private String designation,department;

    public Teacher(String name, String id ) {
        super(name, id);
        associate();
    }
    public void associate(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the designation");
        designation = input.nextLine();
        System.out.println("Enter the department");
        department = input.nextLine();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return name.equals(teacher.name) &&
                id.equals(teacher.id) &&
                designation.equals(teacher.designation) &&
                department.equals(teacher.department);
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "designation='" + designation + '\'' +
                ", department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public Teacher() {
    }
}
