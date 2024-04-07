public class Ass_2_this {
    String name; float c;
    Ass_2_this(String name, float c) {this(c); this.name = name; this.getName(); }
    Ass_2_this(float c) { this.c = c; }
    void getName() { System.out.println(name + " " + c); }
    public static void main(String[] args) {
        Ass_2_this obj = new Ass_2_this("Nimesh", 9.9f);
    }
}
