import java.util.Scanner;

/**This program converts farentheit in celcius
 *
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a scanner for input
    Scanner input = new Scanner(System.in);
    //asks for temperature in celcius
    System.out.println("Please enter a temperature you would like to convert in degrees Celsius.");
    int C = input.nextInt();
    //calcules temperature
    int F = (C*9)/5 +32;
    //tells user their calculation
   System.out.println(C + "C " + "is the same as " + F + "F");
   

    

  }
}
