import java.util.Scanner;
import java.util.StringTokenizer;
 
public class StringTokenizerDemo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
 
    	// StringTokenizer splits the sentence into tokens (words) by whitespace
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        int wordCount = 0;
 
        System.out.println("Words:");
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            System.out.println(word);
            wordCount++;
    	}
 
        System.out.println("Total word count: " + wordCount);
 
        sc.close();
	}
}
