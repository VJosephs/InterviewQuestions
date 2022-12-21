import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        CompanySize companySize = new CompanySize();
        System.out.println("Enter the amount of Management levels for the Company");
        int x = keyboard.nextInt();
        System.out.println("Max amount of employess is: "+companySize.companySize(x));
        String[] words = {"sat", "state", "road", "cat", "catch", "building", "catcher", "chase",
                "dog", "when", "mouse", "dogcatcher"};
        LongestWord longestWord = new LongestWord();
        System.out.println("Longest combined word is: "+ longestWord.LongestWord(words));
        int[] defaultPINs = {123, 213, 321};
        PinCodes pinCode = new PinCodes();
        System.out.println("Max amount of pincodes is: "+ pinCode.uniquePINCodes(defaultPINs));
    }

}