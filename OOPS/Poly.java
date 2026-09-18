class Animal {
    public void sound() {
        System.out.println("Animal Sounds");
    }

    public void walk() {
        System.out.println("Animal Walks");
    }
}

class Dog extends Animal {
    @Override
    public void walk() {
        System.out.println("Walk with 4 legs");
    }

    @Override
    public void sound() {
        System.out.println("Barking1");
    }

}

public class Poly {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.walk();
        d.sound();
    }
}
