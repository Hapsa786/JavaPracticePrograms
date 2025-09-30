public class MinLengthWord {
//Minimum length Program
    public static void main(String[] args) {
        String[] words = {"coffee", "water", "chai", "dietcoke"};

        int minIndex = 0;

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < words[minIndex].length()) {
                minIndex = i;
            }
        }

        // Print the result in required format
        System.out.println("value " + words[minIndex] + " & index - " + minIndex);
    }
}


