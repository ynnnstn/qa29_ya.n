package lesson5;

public class Student {
    public String firstname;
    public String lastname;
    public int age;
    public int lecture;

    public Student(String firstname, String lastname, int age, int lecture) {
        this.firstname= firstname;
        this.lastname= lastname;
        this.age= age;
        this.lecture=lecture;
    }

    public String toString() {
        return "Student{" +
                "firstName='" + firstname + '\'' + ", lastName='" + lastname + '\'' + ", age=" + age + ", lectureCount=" + lecture + '}';

    }
}
