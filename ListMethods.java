import java.util.*;

public class ListMethods{
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // 1️⃣ add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add(1, "Orange"); // add at index
        System.out.println("Fruits: " + fruits); // [Apple, Orange, Banana, Mango]

        // 2️⃣ get element by index
        System.out.println("Fruit at index 2: " + fruits.get(2)); // Banana

        // 3️⃣ set (replace element at index)
        fruits.set(2, "Grapes");
        System.out.println("After set: " + fruits); // [Apple, Orange, Grapes, Mango]

        // 4️⃣ remove by index / value
        fruits.remove(1); // remove index 1 → Orange
        fruits.remove("Mango"); // remove by value
        System.out.println("After remove: " + fruits); // [Apple, Grapes]

        // 5️⃣ contains (check if present)
        System.out.println(fruits.contains("Apple")); // true
        System.out.println(fruits.contains("Banana")); // false

        // 6️⃣ size (length of list)
        System.out.println("Size: " + fruits.size()); // 2

        // 7️⃣ isEmpty
        System.out.println("Empty? " + fruits.isEmpty()); // false

        // 8️⃣ indexOf / lastIndexOf
        fruits.add("Apple");
        System.out.println("Index of Apple: " + fruits.indexOf("Apple")); // 0
        System.out.println("Last index of Apple: " + fruits.lastIndexOf("Apple")); // 2

        // 9️⃣ subList (get part of list)
        List<String> sub = fruits.subList(0, 2); // from index 0 to 1
        System.out.println("Sublist: " + sub); // [Apple, Grapes]

        // 🔟 clear (remove all elements)
        fruits.clear();
        System.out.println("After clear: " + fruits); // []
    }
}

