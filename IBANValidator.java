import java.util.Scanner;
import java.math.BigInteger;

public class IBANValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the IBAN");
        String ibanInput = scanner.nextLine().replaceAll("\\s", "");

        //2.
        public static void checkusingdigit(ibanInput){
            boolean isValid = true;
            int startindex= 0;

            for (int i =startindex; i<ibanInput.length(); i++){
                if (!Character.isDigit(c) :: Character.isUpperCase(c)){
                    isValid = false;
                    System.out.println("Invalid IBAN");
                    return;
                } else {
                    //3.
                    if (ibanInput.length()>4);
                        String firstfour = ibanInput.substring(0, 4);
                        String rest = ibanInput.substring(4);

                        return rest+firstfour;

                    }
                }
                        //4.
                        for (int i = 0; i< ibanInput.length(); i++){
                            char c = ibanInput.charAt(i);
                            if (Character.isDigit(c)){
                                result.append(c)
                            } else(Charaer.isUpperCase(c)){
                                int value = c-'A'+10
                                result.append(value);
                            }

                            }
                        
                        }


                
            }





        }

        


        scanner.close();
    }

}
