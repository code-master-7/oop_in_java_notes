class p18_2 {
    private String name;
    p18_2(String name){ this.name = name; this.getName(); }
    void getName(){System.out.println(name);}
}
public class p18{
    public static void main(String[] args) {
        p18_2 obj = new p18_2("Nimesh");
    }
}