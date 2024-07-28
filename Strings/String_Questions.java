// import java.util.Scanner;
// ! String Compression (** IMPORTANT **)
// public class String_Questions {
// public static void main(String[] args) {
// String str = "aaabbcccd";
// System.out.println(compress(str));
// }
// public static String compress(String str){
// String newStr = "";
// for(int i=0; i<str.length(); i++){
// Integer count = 1;
// while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
// count++;
// i++;
// }
// newStr += str.charAt(i);
// if(count > 1){
// newStr += count.toString();
// }
// }
// return newStr;
// }
// }

// ! Count how many times lowercase vowels occurred in a String entered by the
// user.
// public class String_Questions {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int count = 0;
// String str = sc.nextLine();
// String vowels = "aeiou";

// for(int i=0; i<str.length(); i++){
// char ch = str.charAt(i);
// if(vowels.indexOf(ch) >= 0){
// System.out.print(ch+ " ");
// count++;
// }
// }
// System.out.println(count);
// }
// }

// ! Determine if 2 Strings are anagrams of each other
// ? What is Anagrams ? => If two strings contain the same characters but in a
// ? different order, they can be said to be anagrams. Consider race and care. In
// ? this case, race's characters can be formed into a study, or care's characters
// ? can be formed into race. Below is a java program to check if two strings are
// ? anagrams or not.
// ! Code :

public class String_Questions {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "cure";
        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String str1, String str2) {
        if ((str1.length()) != (str2.length())) {
            return false;
        }

        int freq[] = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        for(int i=0; i < freq.length; i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}
