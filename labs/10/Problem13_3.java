import java.util.ArrayList;
import java.util.Random;

public class Problem13_3 {
	
	public static void main(String[] args) {
		//create the random array
		ArrayList<Number> list = createRandomArray(8);
		System.out.println("List before sorting");
        System.out.println(list);
        
        sort(list);
        
        //print out the sorted array
        System.out.println("List after sorting");
        System.out.println(list);
        
    }
	
	//creates an array of random integers at a set size
	
	public static ArrayList<Number> createRandomArray(int size) {
        ArrayList<Number> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(size));
        }
        return list;
	}
	//apply the bubble sort methodology
	public static void sort(ArrayList<Number> list) {
        boolean swapped =  true;
        Number temp;
        while(swapped) {
            swapped = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).doubleValue() > list.get(i + 1).doubleValue()) {
                    temp = list.remove(i);
                    list.add(i + 1, temp);
                    swapped = true;
                }
            }
        }
	}
}