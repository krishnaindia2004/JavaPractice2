public class WordIndex {
    public static void main(String[] args) {
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        char x = 'a';

        System.out.print("Indices of words containing '" + x + "': ");
        boolean found = false;

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                if (found) {
                    System.out.print(", ");
                }
                System.out.print(i);
                found = true;
            }
        }

        if (!found) {
            System.out.print("No words found containing '" + x + "'");
        }
    }
}
