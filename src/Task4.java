import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task4 {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
//    String[] letter = word.split(word.indexOf(0),2);
    public void letters(){

        Set<Character> diff = new HashSet<>();
        for(char l : word.toCharArray()){
            diff.add(l);
        }
        System.out.println(diff);
    }


}
