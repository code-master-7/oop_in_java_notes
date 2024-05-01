
class Hierarchy1 {

        int a = 10;
        int increment(){
                return ++a;
        }

}

class Hierarchy2 extends Hierarchy1 {
        int b=400;
        int increment(){
                return ++b;
        }

        void display(){
                System.out.println(super.increment());
                System.out.println(increment());
        }
}


public class HierarchyInheritance extends Hierarchy1 {

        int b=100;
        int increment(){
                return ++b;
        }

        void display(){
                System.out.println(super.increment());
                System.out.println(increment());
        }

        public static void main(String[] args) {
                HierarchyInheritance h1 = new HierarchyInheritance();
                h1.display();

                Hierarchy2 h2 = new Hierarchy2();
                h2.display();
        }

}