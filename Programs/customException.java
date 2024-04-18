public class customException extends Exception{

    customException(String m){
        super(m);
    }

    public static void main(String[] args) {
        try {
            throw new customException("My exception");
        } catch (customException e) {
//            throw new RuntimeException(e);
            System.out.println(e);
        }
    }
}
