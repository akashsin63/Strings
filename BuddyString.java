import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BuddyString {
    public static void main(String[] args) {
        String s = "abdctw";
        String goal = "abdcawt";
        if(s.length() != goal.length()){
            System.out.println(false);
        }else{
        System.out.println(goalCheck(s,goal));
        }
    }
    public static boolean goalCheck(String s, String goal){
          if (s.length() != goal.length()) {
        return false;
    }
    
    if (s.equals(goal)) {
        // Check if there are duplicate characters in s
        // If there are, swapping the duplicates will result in s == goal
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                return true;
            }
            seen.add(c);
        }
        return false;
    }
    
    List<Integer> indices = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != goal.charAt(i)) {
            indices.add(i);
        }
    }
    
    if (indices.size() != 2) {
        return false;
    }
    
    char[] arr = s.toCharArray();
    int idx1 = indices.get(0);
    int idx2 = indices.get(1);
    char temp = arr[idx1];
    arr[idx1] = arr[idx2];
    arr[idx2] = temp;
    
    String swapped = new String(arr);
    return swapped.equals(goal);

    }
}
