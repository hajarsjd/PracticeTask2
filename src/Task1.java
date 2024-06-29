import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1 {
    Scanner scanner = new Scanner(System.in);
    String sentence = scanner.nextLine();
    String[] words = sentence.split(" ");

    public void differing(){
        Set<String> differWord = new HashSet<>();
        for (String word : words){
            differWord.add(word);
        }
        System.out.println(differWord.size());
    }


}
