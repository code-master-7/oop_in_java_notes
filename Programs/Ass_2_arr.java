public class Ass_2_arr {
    static int findMax(int [] arr){
        int max = arr[0];
        for(int i : arr) if(i>max) max = i;
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,9,6,7,8,5};
        System.out.println("Max = "+ findMax(arr));
    }
}