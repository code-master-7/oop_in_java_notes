public class capacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World !"); // now sb = "Hello World"

        sb.reverse(); // now sb = "dlroW olleH"

        sb.length(); // return = 11

        sb.insert(1,"java"); // return = "djavalroW olleH" //insert before the index (Won't delete)

        sb.replace(1,5,""); // return = "dlroW olleH" // insert at the index (delete it)

        sb.delete(0,5);// return = " olleH"

// when we creaet a string buffer object it allocate some capacity = 16
        sb.capacity(); // return = 21 + length ==
    }
}
