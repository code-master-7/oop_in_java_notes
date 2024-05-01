public class multiLevelInheritance {
    int a = 100;
    void display(){
        System.out.println("value of a first : " + a);
    }
}

class multiLevel1 extends multiLevelInheritance{

    int a = 1000;

    void display(){
        System.out.println("Value of a second :" + a );
        super.display();
        super.a = 150;
        super.display();
    }

}

class multiLevel2 extends multiLevel1{
    int a = 10;

    void display(){
        System.out.println("Value of a third :" + a );
        super.display();
    }
    public static void main(String[] args) {
        multiLevel2 m2 = new multiLevel2();
        m2.display();
    }
}