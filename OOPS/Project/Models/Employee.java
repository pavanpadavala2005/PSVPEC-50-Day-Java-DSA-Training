package Models;

public class Employee {
    int salary;
    int numLeaves;

    public Employee(int salary, int numLeaves) {
        this.salary = salary;
        this.numLeaves = numLeaves;
    }

    public void teaching() {
        System.out.println("Employee teaching");
    }
}
