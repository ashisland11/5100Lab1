import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any word: ");
        String word = scanner.nextLine().trim();

        long startTime = System.currentTimeMillis();

        if(word.isEmpty()){
            System.out.println("You did not enter any word");
        } else {
            int wordLength = word.length();
            String wordClass;

            if (wordLength <= 5) {
                wordClass = "short";
            } else if (wordLength <= 10) {
                wordClass = "medium";
            } else {
                wordClass = "long";
            }

            long endTime = System.currentTimeMillis();
            long reactionTime = endTime - startTime;

            System.out.println("Your word is " + word);
            System.out.println(" It is a " + wordClass + "word");
            System.out.println("The length of the word is " + wordLength);
            System.out.println(" Your reaction time is" + (reactionTime / 1000.0) + "seconds");
        }
        scanner.close();
    }
}
