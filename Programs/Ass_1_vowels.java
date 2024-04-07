import java.util.Scanner;
public class Ass_1_vowels {
    static int isVowel(char c){
        char [] vowels = {'a','e','i','o','u'};
        for(char s:vowels) if(s == Character.toLowerCase(c)) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(isVowel(c)==1) System.out.println(c + " is vowel");
        else System.out.println(c + " is consonant");
    }
}