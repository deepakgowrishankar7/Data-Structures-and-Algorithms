public class ReverseString {
    public static void main(String[] args) {
        String str = "DEEPAK";
        char[] charArray = str.toCharArray();
        int l = 0;
        int r = charArray.length - 1;
        while(l < r){
            char temp = charArray[l];
            charArray[l] = charArray[r];
            charArray[r] = temp;
            l++;
            r--;
        }
        String reversedStr = new String(charArray);
        System.out.println(reversedStr);
    }
}