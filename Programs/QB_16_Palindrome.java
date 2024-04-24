public class QB_16_Palindrome {
    static boolean isPalindrome(int num){
        StringBuffer sb = new StringBuffer( String.valueOf(num));
        return String.valueOf(num).equals(String.valueOf(sb.reverse()));
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(120));
    }
}