package Seminar1;

    public class mergeStringsAlternately {
        public static void main(String[] args) {
            String word1 = "abc", word2 = "pqr";
            int i = 0, j = 0;
            StringBuilder sb = new StringBuilder();

            while (i < word1.length() && j < word2.length()) {
                sb.append(word1.charAt(i++));
                sb.append(word2.charAt(j++));
            }

            while (i < word1.length()) {
                sb.append(word1.charAt(i++));
            }
            while (j < word2.length()) {
                sb.append(word2.charAt(j++));
            }
            System.out.println(sb.toString());
        }
    }
