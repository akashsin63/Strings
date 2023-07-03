public class ToggleCase {
   public static void main(String[] args) {
        String s = "aAHEllO"; 
        // output = AaheLLo
        System.out.println(s);

    }
    static String toggleCase(String s){
        char[] input = s.toCharArray();
        for( int i =0; i<input.length; i++){
            if( input[i]>='A' && input[i]<='Z'){
               input[i] = (char)(input[i]+32);
            }else{
                input[i] = (char)(input[i]-32);
            }
        }
        return String.valueOf(s);
    }
}
