import java.util.ArrayList;
import java.util.List;

public class Task3 {
    ArrayList<Integer> numbers = new ArrayList<>();
    public void odd(){
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(6);
        numbers.add(1);
        List<Double> oddNum = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> Math.pow(n,2))
                .toList();
        System.out.println(oddNum);
    }

}
