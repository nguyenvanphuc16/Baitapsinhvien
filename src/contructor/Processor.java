package contructor;

public class Processor {

    public static void main(String[] args) {
        Student s1 = new Student(111, " Karan");
        Student s2 = new Student(321, " Aryan");
        s1.displayInformation();
        s2.displayInformation();
    }
}
