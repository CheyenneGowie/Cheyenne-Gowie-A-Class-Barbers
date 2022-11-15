import java.util.scanner;
public class Mileage{
    /**Testing 1,2,3 */
    public static void main (string [] args)
    {
        int miles;
        double gallons, mpg;
        // mpg = miles / gallons;
        scanner s = new scanner(system.in);

        system.out.println("Enter miles and gallons:");
        miles = s.nextInt();
        gallons = s.nextDouble();
        mpg = miles / gallons;

        // output
        system.out.println("Miles" + " Per" + " Gallon:" + mpg);
    }
}