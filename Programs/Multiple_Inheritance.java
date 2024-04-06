public class Multiple_Inheritance {
    public static void main(String[] args) {
        Animal1 a = new Animal1();
        a.eat();
        a.display();
    }
}
     interface Dog1 {
        public void display();
    }
    interface Body{
    void eat();
    }
    class Animal1 implements Dog1,Body{
    public void eat() {
        System.out.println("This Is Animal Class");
    }

        @Override
        public void display() {
            System.out.println("This Is Display Method ");
        }
    }

