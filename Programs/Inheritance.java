public class Inheritance {

        public static void main(String[] args)
        {
            Type t = new Type();
            t.eat();
            t.display();
            t.name();
        }

}


class Animal {
    public void eat() {
        System.out.println("This Is Animal Class");
    }
}

class Dog extends Animal {
    public void display() {
        System.out.println("This Is Dog Class");
    }
}

class Type extends Dog{
    public void name(){
        System.out.println("This Is Doberman .");
    }
}