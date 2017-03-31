// Daniel Hall
//ITSE
// 3/30/17
//A program that counts and prints out number of vowels and consonants

import java.util.Scanner;

public class vowels {
    public static void main (String strArgs[]) {

        Scanner objScanner = new Scanner(System.in); 

        char vowels;

        int inta = 0; //default values 
        int inte = 0;
        int inti = 0;
        int into = 0;
        int intu = 0;
        int intother = 0;
       

        String input;

        System.out.println("Enter a sentence, if you want: ");
        userString = scan.NextLine();

        for (int count = 0; count < userStringlength(); count++) { //initial condition
            vowels = userString.charat(count);
            switch (vowels){
                case "inta": //each possible imput result
                    inta++;
                    break;
                case "inte":
                    inte++;
                    break;
                case "inti":
                    inti++;
                    break;
                case "into":
                    into++;
                    break;
                case "intu":
                    intu++;
                    break;
                case "intother":
                    intother++;
                    break;

            }
        }

        System.out.println("a: " + inta);
        System.out.println("e: " + inte);
        System.out.println("i: " + inti);
        System.out.println("o: " + into);
        System.out.println("u: " + intu);
        System.out.println("other: " + intother);
    }
}