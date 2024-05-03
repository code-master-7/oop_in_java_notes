class Animal_1 {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog_1 extends Animal_1 {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class polyTest extends Dog_1 {
    public static void main(String[] args) {
        polyTest p  = new polyTest();
        p.makeSound();
    }
}
