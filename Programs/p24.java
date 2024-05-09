// you are given one abstract class shape in which there is one abstract method calculate area
// and another non-abstract methode is display area.
// extends 2 other classes circle and rectangle from shape class.
// use calculate area method to find out the area of circle and rectangle, use display area method to print the area.
// to calculate area values are given using constructor only.

abstract class shape{
    abstract void calculateArea();
    void displayArea(float area){ System.out.println(area); }
}

class Circle1 extends shape{
    float r;
    Circle1(float ra){ r = ra; }
    void calculateArea() { displayArea(3.14f * r * r); }
}

class Rectangle extends shape{
    int l,h;
    Rectangle(int le,int hi){ l=le; h = hi; }
    void calculateArea() { displayArea(l*h); }
}

class p24 {
    public static void main(String[] args) {
        shape p = new Rectangle(2,5);
        p.calculateArea();
        p = new Circle1(2.1f);
        p.calculateArea();
    }
}