class Animal_1 {
    int a = 20;
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}
class Dog_1 extends Animal_1 {
    int a = 10;
    public void makeSound() {
        System.out.println("Woof!");
    }
}
public class polyTest extends Dog_1 {
    public static void main(String[] args) {
        Animal_1 p;

        p = new Dog_1();
        p.makeSound();
        System.out.println(p.a); // prove that variable cant be overridden

        p = new Animal_1();
        p.makeSound();
        System.out.println(p.a); // prove that variable cant be overridden
    }
}