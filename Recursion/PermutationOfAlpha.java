public class PermutationOfAlpha {
    public static void main(String[] args) {
        Operation(2, "abc", "");
    }

    static void Operation(int strLength, String str, String result) {
        if (strLength == 0) {
            System.out.print(result + ", ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            Operation(strLength - 1, str, result + currentChar);
        }
    }
}
