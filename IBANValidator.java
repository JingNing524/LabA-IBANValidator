import java.util.Scanner;
import java.math.BigInteger;

public class IBANValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the IBAN");
        String ibanInput = scanner.nextLine().replaceAll("\\s", "");

        public static void checkusingdigit(ibanInput){
            boolean isValid = true;
            int startindex= 0;

            for (int i =startindex; i<ibanInput.length(); i++){
                if (!Character.digit(ibanInput.charAt(i))){
                    isValid = false;
                    System.out.println('Invalid IBAN');
                }
            }

        }

        


        scanner.close();
    }

}
