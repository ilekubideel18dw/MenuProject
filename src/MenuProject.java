import java.util.Scanner;
public class MenuProject {
	public static void main(String args[]) {
		
		// I define a int, to close the loop I'm going to create.
		int loopnum = 0;
		
		// Scanner to ask numbers in this program.
		Scanner sc = new Scanner(System.in);
		
		// I'm going to use while, to create a loop to use more than one option when we use the program.
		while (loopnum != 1) {
			System.out.println("Choose an option:");
			
			// Here I use Scanner to use one number between 1 & 7.
			int enternum = sc.nextInt();
			
			// With Switch, I can ask for any option between 1 & 7.
			switch (enternum) {
            	case 1:
            		System.out.print("Enter a number:");
            		int num1, res1, even1 = 0;
            		num1 = Integer.parseInt(sc.next());
            		while (num1 != 0) {
            			res1 = num1 % 10;
            			num1 = num1 / 10;
            			if(res1 % 2 == 0) {
            				even1++;
            			}
            		}
            		System.out.print("This number has " + even1 + " even number(s)");
            		System.out.println(" ");
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue");
            		int continue1 = sc.nextInt();
            		if (continue1 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 2:
            		
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue");
            		int continue2 = sc.nextInt();
            		if (continue2 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 3:
            		System.out.println("Enter a number:");
            		int num3, inverted = 0, res3;
            		num3 = sc.nextInt();
            		while (num3 > 0) {
            			res3 = num3 % 10;
            			inverted = inverted * 10 + res3;
            			num3 /= 10;
            		}
            		System.out.println("Inverted number: " + inverted);
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue");
            		int continue3 = sc.nextInt();
            		if (continue3 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 4:
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue");
            		int continue4 = sc.nextInt();
            		if (continue4 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 5:
            		
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue");
            		int continue5 = sc.nextInt();
            		if (continue5 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 6:
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue");
            		int continue6 = sc.nextInt();
            		if (continue6 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 7:
            		System.out.println("Enter a word:");
            		String st7 = sc.next();
            		int inc = 0;
            		int des = st7.length()-1;
            		boolean bool7 = false;
            		while ((inc < des) && (!bool7)){
            			if (st7.charAt(inc) == st7.charAt(des)){				
            				inc++;
            				des--;
            			} else {
            				bool7 = true;
            			}
            		}
            		if (!bool7)
            			System.out.println(st7 + " is a palindrome");
            		else
            			System.out.println(st7 + " is not a palindrome");
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue");
            		int continue7 = sc.nextInt();
            		if (continue7 < 1) {
            			loopnum = 1;
            		}
            		break;
            	default:
            		System.out.println("Incorrect option, try again.");
            		break;
			}		
        }
    }
}