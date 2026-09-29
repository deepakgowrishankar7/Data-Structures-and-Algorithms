import java.util.Arrays;
public class ReverseCharArray {
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        int l = 0;
        int r = arr.length - 1;
        while(l < r){
            char a = arr[l];
            arr[l] = arr[r];
            arr[r] = a;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
