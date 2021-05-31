package lab12;

public class lab12_Runner {

    public static void main(String[] args) {
        HumanResource hr= new HumanResource();
        hr.add(new Teacher("teacher1","2"));
        hr.add(new Student("student1","1"));
        System.out.println(hr);
        hr.delete(new Student("student1","1"));
        System.out.println(hr);




    }
}
