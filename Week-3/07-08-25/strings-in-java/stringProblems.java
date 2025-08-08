public class stringProblems {
    static void countVowels() {
        String name = "Sohail";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ('a') || name.charAt(i) == ('e') || name.charAt(i) == ('i')
                    || name.charAt(i) == ('o') || name.charAt(i) == ('u')) {
                count++;
            }
        }
        System.out.println(count);
    }

    static void duplicateCharacters() {
        // String name = "Sohail";

        // String newName = "";
        // for (int i = 0; i < name.length(); i++) {
        // if (name.charAt(i).contains(newName.getChars(0, 4))) {
        // newName = newName + newName.charAt(i);
        // }
        // }
        // System.out.println(newName);

        String input = "programming";
        String result = ""; // Empty string to collect unique characters

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }
        System.out.println(result);
    }

    static void longestWord() {
        String sentence = "The browddsssn fox lost it's job.";
        String[] words = sentence.split(" ");
        int res = 0;
        for (String word : words) {
            if (word.length() > res) {
                res = word.length();
            }
        }
        System.out.println(res);
    }

    static void replaceWords() {
        String sentence = "The brown fox lost it's job.";
        String[] words = sentence.split(" ");
        String res = "";
        for (String word : words) {
            if (word.equals("fox")) {
                word = "sam";
                res = res + word + " ";
            } else {
                res = res + word + " ";
            }
        }
        System.out.println(res);
    }

    static void reverseWord() {
        String sentence = "The brown fox lost it's job.";
        String[] words = sentence.split(" ");
        String res = "";
        for (int i = words.length - 1; i <= 0;i--) {
            res = res + String i; 
        }
    }

    public static void main(String[] args) {
        // countVowels();
        // duplicateCharacters();
        // longestWord();
        // replaceWords();
        reverseWord();
    }
}
