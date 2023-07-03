public class reverseString {
    public static void name() {
        String s = "HelloWorld";
        System.out.print(solve(s));

    }
    static String solve(String A) {
        char[] reverse = A.toCharArray();

        int left =0 ; int right = reverse.length-1;
        while(left <= right){
            char temp = reverse[left];
            reverse[left]= reverse[right];
            reverse[right] = temp ;
           
           left++ ; right--;
        }
        
        return String.valueOf(reverse);
    }
}
