class Student {
    String name;
    int age;
    char gender;
    int doy;

    public Student(String name, int age, char gender, int doy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.doy = doy;
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Student[] students = new Student[6];

        students[0] = new Student("Pavan", 24, 'M', 2001);
        students[0] = new Student("Pavan", 24, 'M', 2001);
        students[0] = new Student("Pavan", 24, 'M', 2001);
        for (Student s : students) {
            System.out.println(s.name + " - " + s.age);
        }
    }
}