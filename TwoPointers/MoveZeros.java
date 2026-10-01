import java.util.Arrays;
public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,4,2,0,2,0};
        int l = 0;
        for(int r = 0; r < arr.length; r++){
            if(arr[r] != 0){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}