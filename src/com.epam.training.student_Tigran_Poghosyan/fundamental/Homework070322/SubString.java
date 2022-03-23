package Homework070322;

public class SubString {

    public String newString(String example, int startPoint) {
        char[] exampleToChars = example.toCharArray();
        if (startPoint <= exampleToChars.length) {
            char[] newString = new char[(example.length() - startPoint)];
            int newStringIndex = 0;
            for (int i = startPoint; i < example.length(); i++) {
                newString[newStringIndex++] = exampleToChars[i];
            }
            String result = new String(newString);
            return result;
        }
        return "";
    }

    public String newString(String example, int startPoint, int endPoint) {
        char[] exampleChars = example.toCharArray();
        if (endPoint <= exampleChars.length && endPoint >= startPoint) {
            char[] newString = new char[(endPoint - startPoint) + 1];
            int newStringIndex = 0;
            for (int i = startPoint; i <= endPoint; i++) {
                newString[newStringIndex++] = exampleChars[i];
            }
            String result = new String(newString);
            return result;
        }
        return "error";
    }
}

class checkSubstring {
    public static void main(String[] args) {
        String testString = new String("0123456789");
        SubString subString = new SubString();

        String one = subString.newString(testString, 3);
        String two = subString.newString(testString, 3, 4);
        System.out.println(one);
        System.out.println(two);
    }
}
// result will be    " 3456789
//                   " 34