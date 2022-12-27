package Seminar1;

public class reverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder(words.length);
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() != 0) {
                if (result.length() != 0) {
                    result.append(" ");
                }
                result.append(words[i]);
            }
        }
        System.out.println(result.toString());
    }
}