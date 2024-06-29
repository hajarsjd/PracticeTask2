import java.util.*;

public class Task2 {
    private String name;
    private int age;
    Scanner sc = new Scanner(System.in);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void groupAge(){
        Map<String,Integer> mapList = new HashMap<String,Integer>();
        while (true){
            System.out.println("Name");
            name = sc.nextLine();

            if(name.equalsIgnoreCase("stop")){
                break;
            }
            System.out.println("Age");
            age = sc.nextInt();
            sc.nextLine();
            mapList.put(name,age);
        }
        Map<String,List<String>> groupedAge = new HashMap<>();

        mapList.forEach((name,age) -> {
            groupedAge.computeIfAbsent(String.valueOf(age), k -> new ArrayList<>()).add(name);
        });

        groupedAge.forEach((age,names) -> {
            System.out.println("Age" + age + " : " + names);
        });
        sc.close();
    }
}
