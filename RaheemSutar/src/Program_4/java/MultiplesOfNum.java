package Program_4.java;
import java.util.HashMap;
import java.util.Map;
public class MultiplesOfNum {
	public static void main(String[] args) {
	        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
	        Map<Integer, Integer> countMap = countMultiples(input);//count multiples
     for (int i = 1; i <= 9; i++) {
	            System.out.println(i + ": " + countMap.get(i));
	        }
	    }// Print results
	public static Map<Integer, Integer> countMultiples(int[] input) {
	        Map<Integer, Integer> countMap = new HashMap<>();
	        for (int i = 1; i <= 9; i++) {
	            int count = 0;
	            for (int num : input) {
	                if (num % i == 0) {
	                    count++;
	                }
	            }
	            countMap.put(i, count);
	        }
	        return countMap;
	    }
	}
