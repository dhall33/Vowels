import java.util.Scanner;

	 
class bettervowels {

public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

    char letter, letterA, letterE, letterI, letterO, letterU, letterother;
    String line;
    int a = 0, e = 0, i = 0, o = 0, u = 0, other = 0; //default values

	letterA = 'a';
	letterE = 'e';
	letterI = 'i';
	letterO = 'o';
	letterU = 'u';


	System.out.println("Enter a String so I can count the vowels: ");
        line = scan.nextLine();

	 
        switch (charAt(letter)) { //the switch for each case

	      case letterA:
	        a = a++;
	        break;

	      case letterE:
	        e = e++;
	        break;

	      case letterI:
	        i = i++;
	        break;

	      case letterO:
	        o = o++;
	        break;

	      case letterU:
	        u = u++;
	        break;

	      case letterother:
	        other = other++;
	        break;

	      default:
            System.out.println("Error: Please only use characters.");

	    }

        System.out.println("a: " + letterA);
        System.out.println("e: " + letterE);
        System.out.println("i: " + letterI);
        System.out.println("o: " + letterO);
        System.out.println("u: " + letterU);
        System.out.println("other: " + letterother);

	 

	  }

	}
