class objectArr{
    int id;
    void setId(int id) {this.id = id;}

    void printId(){System.out.println(id);}
}
public class Ass_2_arrObj {
    public static void main(String[] args) {
        objectArr [] arrObj = new objectArr[5];
        for(int i=0;i<5;i++){
            arrObj[i] = new objectArr();
            arrObj[i].setId(i);
        }
        for(objectArr o : arrObj) o.printId();
    }
}
