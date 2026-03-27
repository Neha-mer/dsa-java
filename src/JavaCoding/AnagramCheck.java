package JavaCoding;

public class AnagramCheck {

    public static void main(String[] args) {
        String s = "sillent";
        String s2 = "tnesill";

        s = s.toLowerCase();
        s2 = s2.toLowerCase();

        if (s.length() != s2.length()) {
            System.out.println("Not anagram");
            return;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {

            count[s.charAt(i) - 'a']++;
            System.out.println("kkk" + count[s.charAt(i) - 'a']);
        }

        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                System.out.println("Not anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}
