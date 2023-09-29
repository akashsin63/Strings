public class ReverseVowelsString{
    public static void main(String[] args) {
        String s = "HEllo";
        System.out.println(reverseVowels(s));
    }
     public static String reverseVowels(String s) {
          int i = 0, j = s.length() - 1;
    char[] chars = s.toCharArray();

    while (i <= j) {
        char charAti = chars[i];
        char charAtj = chars[j];
        if (vowels(charAti) && vowels(charAtj)) {
            swap(chars, i, j);
            i++;
            j--;
        } else if (vowels(charAti) && !vowels(charAtj)) {
            j--;
        } else if (!vowels(charAti) && vowels(charAtj)) {
            i++;
        } else {
            i++;
            j--;
        }
    }

    return new String(chars);
}

public static boolean vowels(char a) {
    return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U';
}

public static void swap(char[] chars, int first, int second) {
    char temp = chars[first];
    chars[first] = chars[second];
    chars[second] = temp;
}

}