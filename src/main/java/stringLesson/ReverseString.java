package stringLesson;

public class ReverseString {

    // dog --> god
    // get the last letter  (length-1) add it as first letter of teh new word

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString("dog");
    }

    public void reverseString(String textToReverse) {
        if (textToReverse == null || textToReverse.isEmpty() || textToReverse.isBlank()) {
            System.out.println("The text String is null or empty");
        } else {

            System.out.println(String.format("The input string is %s", textToReverse));

            String result = "";
            int lastLetter = textToReverse.length() - 1;
            for (int i = lastLetter; i >= 0; i--) {
                result = result + textToReverse.charAt(i);
            }
            System.out.println(result);
        }
    }
}
