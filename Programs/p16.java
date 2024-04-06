public class p16 {
    String name; float c;
    p16(String name, float c){ this(c); this.name = name; this.getName(); }
    p16(float c){ this.c = c; }
    void getName(){ System.out.println(name + " " + c); }

    public static void main(String[] args) { p16 obj = new p16("Nimesh",9.9f); }
}