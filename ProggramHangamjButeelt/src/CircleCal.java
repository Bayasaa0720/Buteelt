import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CircleCal {

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    
    public static double listAverage(int[] array) {
    	double average = 0;
    	for(int i = 0; i < array.length; i++) {
    		average += array[i];
    	}
    	average = average / array.length;
    	
    	return average;
    }
    
    public static int ListMax(int[] array) {
    	int max = 0;
    	for(int i = 0; i < array.length; i++) {
    		if(array[i] > max) {
    			max = array[i];
    		}
    	}
    	
    	return max;
    }
    
    public static int ListMin(int[] array) {
    	int min = 100;
    	for(int i = 0; i < array.length; i++) {
    		if(array[i] < min) {
    			min = array[i];
    		}
    	}
    	return min;
    }
    
    public static void ListReverse(int[] array) {
    	int a = array.length;
    	for(int i = 0; i < array.length / 2; i++) {
    			int b = array[i];
    			array[i] = array[a -1 - i];
    			array[a - 1 - i] = b;
    	}
    	
    }
    
	    public static int[] ListFix(int[] array) {
	    	List<Integer> Listfix = new ArrayList<>();
	    	for(int i = 0; i < array.length; i++) {
	    		if(array[i] % 2 == 0) {
	    			Listfix.add(array[i]);
	    		}
	    	}
	    	int[] NewArray = new int[Listfix.size()];
	    	for(int i = 0; i < Listfix.size(); i++) {
	    		NewArray[i] = Listfix.get(i);
	    	}
	    	return NewArray;
	    }

	//4:03

	//4:44 test

	//5:00 test

    public static void main(String[] args) {
        int[] list1 = {3, 6, 2, 5, 7};
        int sum = calculateSum(list1);
        double average = listAverage(list1);
        int max = ListMax(list1);
        int min = ListMin(list1);
        ListReverse(list1);
        ListFix(list1);
        
        int[] lastV = ListFix(list1);
        
        //3:13 test
        
        //4:56 test
        

        System.out.println("Sum of elements in the list: " + sum);
        System.out.println("Average of elements in the list: " + average);
        System.out.println("Max of elements in the List: " + max);
        System.out.println("Min of elements in the List: " + min);
        System.out.println("Reversed List: " + Arrays.toString(list1));
        System.out.println("Fixed List: " + Arrays.toString(lastV));
    }
}
