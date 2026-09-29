public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int l = 0;
        int r = height.length - 1;
        int width = 0;
        int area = 0;
        while(l < r){
            int min = Math.min(height[l],height[r]);
            width = r - l;
            area = Math.max(min * width,area);
           if (height[l] < height[r]) { 
               l++;
            }else {   
                 r--;
            }
        }
        System.out.println(area);
    }
}
