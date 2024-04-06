public class copyConstructor {

    int num ;

    copyConstructor(){}

    copyConstructor( int a){
        num = a;
    }





    public static void main(String[] args) {
        copyConstructor cc = new copyConstructor(10);
        copyConstructor c2 = cc;
    }
}
