package contructor;

public class Student {

    int id;
    String name;
    Student() {
        System.out.println("default......");
    }

    public Student(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    void displayInformation() {
        System.out.println(id + " " + name);
    }
}
