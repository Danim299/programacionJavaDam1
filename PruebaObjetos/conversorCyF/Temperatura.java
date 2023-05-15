package conversorCyF;
import static conversorCyF.otraClaseTemp.FarenheitTocelsius;
import static conversorCyF.otraClaseTemp.celsiusToFarenheit;
import java.util.Scanner;

public class Temperatura {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Farenheit to celsius");
        int f = in.nextInt();
        System.out.println("Celsius to farenheit");
        int c = in.nextInt();
        System.out.println("Farenheit: "+celsiusToFarenheit(f));
        System.out.println("Celsius: "+FarenheitTocelsius(c));
    }
    
}
