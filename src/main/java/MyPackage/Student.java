package MyPackage;

import java.util.StringJoiner;

public class Student {
    int id;
    String firstName;
    String lastName;
    String city;
    String nativeLanguage;
    int grade;

    Student(int id, String firstName, String lastName, String city, String nativeLanguage, int grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.nativeLanguage = nativeLanguage;
        this.grade = grade;
    }
    @Override
    public String toString() {

        StringJoiner joiner = new StringJoiner(",");

        joiner.add(Integer.toString(id)).add(firstName).add(lastName).add(city).add(nativeLanguage).add(Integer.toString(grade));
        return joiner.toString();
    }

    public static void main(String args[]) {
        Student student = new Student(1, "Cristina", "Nagy", "Cluj-Napoca", "Romana", 1);
        System.out.println(student);

    }
}
