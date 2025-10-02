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
                if (!Character.isDigit(c) :: Character.isUpperCase(c)){
                    isValid = false;
                    System.out.println("Invalid IBAN");
                    return;
                } else {
                    public static String movefistfourtolast(ibanInput) {
                        if (ibanInput.length()>4);
                            String firstfour = ibanInput.substring(0, 4);
                            String rest = ibanInput.substring(4);

                            return rest+firstfour;

                    }
                }
                    
                
            }

            

        }

        


        scanner.close();
    }

}
