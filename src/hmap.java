import java.util.*;

public class hmap {
    public static void main(String[] args) {
        HashMap<String, Integer> Subject = new HashMap<>();
        Subject.put("Math", 100);
        Subject.put("English", 99);
        Subject.put("CS", 98);
        Subject.put("Chemistry", 100);
        Subject.put("Military History", 100);
        System.out.println("Grades");
        int max = 0;
        int sum = 0;
        String key = "";
        for(Map.Entry<String, Integer> e: Subject.entrySet()) {
            String val = e.getKey();
            int val2 = e.getValue();
            if(val2 >= max){
                max = val2;
                key = val;
            }
            sum = sum + val2;
            System.out.printf("\n%-20s %5d", val, val2);
        }

        System.out.println("\nHighest Grade: " + key + " " + max);
        System.out.println("Average: " + sum / Subject.size());


    }
}
