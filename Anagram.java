import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if(str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] freq = new int[26];

        for(int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        int count = 0;

        for(int i = 0; i < 26; i++) {
            if(freq[i] != 0) {
                count++;
            }
        }

        if(count == 0) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
