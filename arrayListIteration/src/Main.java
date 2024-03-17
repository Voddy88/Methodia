import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> exampleArrayList= new ArrayList<>();

        //Generate List of Integers with random numbers
        fillArrayListWithNumbers(exampleArrayList);

        System.out.println("Loop through the arrayList with for loop:");
        //Iterate through the list with for loop
        for (Integer number: exampleArrayList){
            System.out.println(number);
        }
        //Iterate through the list with while loop
        System.out.println("Approach with while loop:");
        Iterator<Integer> iterator = exampleArrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Another approach to loop through the array with while
        System.out.println("Another approach with while loop:");
        int index = 0;
        while (index < exampleArrayList.size()){
            System.out.println(exampleArrayList.get(index));
            index++;
        }


    }
    private static void fillArrayListWithNumbers(List<Integer> exampleArrayList) {
        Random random = new Random();
        //Generate list of size 10 for simplicity
        for (int i = 0; i < 10; i++) {
            exampleArrayList.add(random.nextInt(100));
        }
    }
}