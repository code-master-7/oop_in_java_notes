public class p15 {
    int rn;
    String name;
    float cgpa;

    p15(int r, String n, float c) {
        rn = r;
        name = n;
        cgpa = c;
    }

    static void getResult(p15[] objArr) {
        for (p15 o : objArr) if (o.cgpa < 5) System.out.println(o.name + " is fail");
    }

    public static void main(String[] args) {
        p15[] objArr = new p15[10];
        for (int i = 0; i < 10; i++) objArr[i] = new p15(i, String.valueOf(i), i);
        getResult(objArr);
    }
}