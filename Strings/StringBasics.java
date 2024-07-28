// import java.util.*;

public class StringBasics {
    public static void main(String[] args) {
        // ! String are immutable in java means unchangeable.
        // String str = "xyz";
        // char arr[] = {'a','b','c','d'};
        // String str1 = new String("xyz");

        // System.out.println(str == str1); // false

        // ! Input and Output in Strings
        // Scanner sc = new Scanner(System.in);
        // String name;
        // // name = sc.next();
        // // System.out.println(name);

        // String name1 = sc.nextLine();
        // System.out.println(name1);

        // ! String Length
        // Scanner sc = new Scanner(System.in);
        // String fullName = "Missile Man";
        // System.out.println(fullName.length());

        // ! String Concatenation
        // String fname = "Missile";
        // String lname = "Man";
        // String fullName = fname + " " + lname;
        // System.out.println(fullName);

        // ! String charAt Method
        // ? To find the specific character of String with the help of [(.charAt()
        // method].
        // System.out.print(fullName.charAt(5));

        // ? To print the all characters, lets make a function of it
        // for(int i=0; i<fullName.length(); i++){
        // System.out.print(fullName.charAt(i) + " ");
        // }

        // ! Check if a String is Palindrome or Not
        // String str = "oyojdjdo";
        // int isPalindrome = 1;
        // for(int i=0; i<str.length(); i++){
        // if(str.charAt(i) != str.charAt(str.length()-1-i)){
        // isPalindrome = 0;
        // }
        // }

        // if(isPalindrome == 1){
        // System.out.println("Palindrome.");
        // }
        // else{
        // System.out.println("Not a palindrome.");
        // }

        // ! Shortest Path
        // String path = "WNEENESENNN";
        // int x = 0;
        // int y = 0;

        // for(int i=0; i<path.length(); i++){
        // char dir = path.charAt(i);

        // if(dir == 'W'){
        // x--;
        // }
        // else if(dir == 'E'){
        // x++;
        // }
        // else if(dir == 'N'){
        // y++;
        // }
        // else if(dir == 'S'){
        // y--;
        // }
        // }

        // int xSq = x*x;
        // int ySq = y*y;

        // System.out.println(Math.sqrt(xSq + ySq));

        // ! String functions - Compare
        // String s1 = "abc";
        // String s2 = new String("abc");
        // System.out.println(s1 == s2 ); // check the strings . so it will return false
        // due to interning.
        // System.out.println(s1.equals(s2)); // check only values , so it will return
        // true.

        // ! String functions - substring
        // String str = "Hello_World";
        // int si = 0;
        // int ei = 8;
        // String subStr = "";

        // for(int i=si; i<ei; i++){
        // subStr += str.charAt(i);
        // }

        // System.out.println(subStr);

        // ! Print the largest String
        // String str[] = {"aaac","daab","aaad"};
        // String largest = str[0];

        // for(int i=1; i<str.length; i++){
        // if(largest.compareTo(str[i]) < 0){
        // largest = str[i];
        // }
        // }
        // System.out.println(largest);

        // ! Why strings are immutable
        // String s1 = "VK";
        // String s2 = "VK";
        // String s3 = new String("VK");

        // System.out.println(s1.equals(s3));
        // System.out.println(s1 == s3);
        // ? Strings in Java are specified as immutable, as seen above because strings
        // ? with the same content share storage in a single pool to minimize creating a
        // ? copy of the same value. That is to say, once a String is generated, its
        // ? content cannot be changed and hence changing content will lead to the
        // ? creation of a new String.


        // ! String Builder 
        // StringBuilder sb = new StringBuilder("Hello World");
        // System.out.println(sb);
        // sb.toString();
        // System.out.println(sb);

        // ! Append in StringBuilder
        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a'; ch<='z'; ch++){
        //     sb.append(ch + " ");
        // }
        // System.out.println(sb.length());

        // ! Convert Letter to Uppercase 
        // String str = "hello world";
        // String uppercase = str.toUpperCase();
        // System.out.println(uppercase);
        // ! in StringBuilder 
        // StringBuilder sb = new StringBuilder("hello world");
        // String str = sb.toString().toUpperCase();
        // StringBuilder upcase = new StringBuilder(str);
        // System.out.println(upcase);
    }

}
