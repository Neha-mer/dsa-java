package GenzCodingQuesns;

public class Pallindrom {

    static void main() {

        String str = "madam";


        if (str.equals(new StringBuilder(str).reverse().toString())) {
            System.out.println("palindrome from first if");
            return;
        }

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("not palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("palindrome");
    }
}
