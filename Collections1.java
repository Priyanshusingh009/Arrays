import java.util.*;

public class Collections1{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 3, 9));
        List<Integer> numbers2 = new ArrayList<>();

        // 1️⃣ sort
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers); // [2, 3, 5, 8, 9]

        // 2️⃣ reverse
        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers); // [9, 8, 5, 3, 2]

        // 3️⃣ shuffle (random order)
        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);

        // 4️⃣ max and min
        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));

        // 5️⃣ frequency (count occurrences)
        numbers.add(8);
        System.out.println("Frequency of 8: " + Collections.frequency(numbers, 8));

        // 6️⃣ swap elements
        Collections.swap(numbers, 0, 2);
        System.out.println("After swap: " + numbers);
        ArrayList<String> newc1 = (ArrayList<String>)numbers.clone();//only for ArrayList<Integer/String>
                                                                     //not for List<Integer>
          System.out.println("Cloned array list: " + newc1);
        //7.copy
        Collections.copy(numbers, numbers2);//overwrites but if the list is 
                                           //empty in which we have to copy we get error.
        System.out.println(numbers2);
    }
}

