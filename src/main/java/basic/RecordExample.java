package basic;

/**
 * @author PhatNguyen
 * @created 21/09/2025 - 22:42
 * @project learn-java-w3school
 */
record People(String name, int age) {

}

public class RecordExample {

  public static void main(String[] args) {
    System.out.println("Using Java record for data structure immutable.");
    People p = new People("Fast Nguyen", 30);
    System.out.println(p);
  }
}
