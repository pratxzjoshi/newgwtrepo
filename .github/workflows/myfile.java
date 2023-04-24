import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<String>();

    // Add some elements to the ArrayList
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Pineapple");

    // Retrieve an element from the ArrayList using get() method
    String fruit = fruits.get(2); // Retrieves the 3rd element from the ArrayList

    // Print the retrieved element
    System.out.println("The retrieved element is: " + fruit);
  }
}
