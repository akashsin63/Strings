public class Equalteams{
    public static void main(String[] args) {
        String A="011100";
        System.out.println(solve(A));
    }
    static int count =0;
    static int solve(String A) {
        int ans=0;
        for(int i =0; i<A.length(); i++){
                  if (A.charAt(i)=='0'){
                       count++;
                  }else {
                    count --;
                  }
                  if (count == 0){
                           ans++;
                  }
                  
        }
          return ans;
      }
}