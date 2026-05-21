package CodingQuesnthirty;

public class ReversingAString {
    static void main() {
        String string = "Java is powerful";

        String[] stringsArr = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = stringsArr.length - 1; i >= 0; i--) {
            stringBuilder.append(stringsArr[i]);
            stringBuilder.append(" ");
        }

        System.out.println(stringBuilder.toString());
    }


}
