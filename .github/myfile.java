import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<String>();

    
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Pineapple");

    
    String fruit = fruits.get(2); 

    
    System.out.println("The retrieved element is: " + fruit);
  }
}
