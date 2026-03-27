package GenzCodingQuesns;

public class ReverseAString {

    static void main() {
        String str = "Hello";
        for (int i = str.length() - 1; i >= 0; i--) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.charAt(i));

        }

        System.out.println("sb");
    }

}
