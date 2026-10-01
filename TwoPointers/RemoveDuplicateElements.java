public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        int j = 0;
        for(int i = 1;i < arr.length;i++){
            if(arr[j] != arr[i]){
                j++;
                arr[j] = arr[i];
            }
        }
        System.out.println(j + 1);
    }
}
