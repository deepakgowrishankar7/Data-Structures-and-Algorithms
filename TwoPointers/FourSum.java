import java.util.Arrays;
public class FourSum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,8,54,12,21,34,32};
        int target = 73;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 3; i++){
            for(int j = i + 1; j < arr.length - 2; j++){
                int left = j + 1;
                int right = arr.length - 1;
                while(left < right){
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if(sum == target){
                        System.out.println("4 Sum : [" + arr[i] + ", " + arr[j] + ", " + arr[left] + ", " + arr[right] + "]");
                        return;
                    } else if(sum < target){
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        System.out.println("There is no 4 sum");
    }
}