package Utils;

public class Account {
    int id;
    String name;
    int age;
    String phoneNumber;
    String registerNumber;

    public Account(int id, String name, int age, String phoneNumber, String registerNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.registerNumber = registerNumber;
    }

    public void takeAttendence() {
        System.out.println("Attendence at Account");
    }
}
