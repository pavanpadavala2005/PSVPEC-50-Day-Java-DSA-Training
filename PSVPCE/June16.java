class Mobile {
    static String brand = "Iphone";
    String userId;
    String password;

    Mobile(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public static void displayBrand() {
        System.out.println("Band : " + brand);
    }

    public void displayDetails() {
        System.out.println("UserId : " + this.userId);
        System.out.println("Password : " + this.password);
    }
}

public class June16 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("12345", "hello@123");
        Mobile m2 = new Mobile("45678", "hi@123");
    }
}