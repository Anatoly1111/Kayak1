import java.io.*;
import java.util.*;
//// 869 Байдарочный поход
public class KayakTripWithList {
    public static void main(String[] args) throws IOException {
        
        Scanner scanner =  new Scanner (new FileReader("number.txt"));
        String[] firstLine = scanner.nextLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);  
        int D = Integer.parseInt(firstLine[1]);  

        
        List<Integer> weights = new ArrayList<>();

       
        String[] masses = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            weights.add(Integer.parseInt(masses[i]));
        }

       
        Collections.sort(weights);

        int left = 0;               
        int right = weights.size() - 1;  
        int boats = 0;              
        
        while (left <= right) {
            
            if (weights.get(left) + weights.get(right) <= D) {
                left++; 
            }
            right--; 
            boats++;  
        }


        System.out.println(boats);
    }
}