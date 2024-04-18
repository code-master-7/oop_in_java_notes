public class QB_15 {
    int length, width;

    QB_15() {
        length = 0;
        width = 0;
    }

    int getArea(int h, int w) {
        return h * w;
    }

    public static void main(String[] args) {
        QB_15 obj = new QB_15();
        System.out.println("Area = " + obj.getArea(1, 5));
    }
}