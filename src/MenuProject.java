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
        			if (num1 < 0) {
        				System.out.println("Wrong.");
        				break;
        			}
            		while (num1 != 0) {
            			res1 = num1 % 10;
            			num1 = num1 / 10;
            			if(res1 % 2 == 0) {
            				even1++;
            			}
            		}
            		System.out.print("This number has " + even1 + " even number(s)");
            		System.out.println(" ");
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue1 = sc.nextInt();
            		if (continue1 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 2:
            		System.out.println("Enter a positive number");
        			int num2 = sc.nextInt();
        			if (num2 < 0) {
        				System.out.println("Wrong.");
        				break;
        			}
        			System.out.println("Enter a digit:");		
        			String d2 = sc.next(); 			
        			String num20 = Integer.toString(num2);					
        			char num21[] = num20.toCharArray();	
        			int cont2 = 0;	
        			for(int x2 = 0; num20.length() > x2; x2++ ) {
        				if (num21[x2]== d2.charAt(0)){			
        					cont2++;
        				}		
        			}
        			if (cont2 <= 0) {		
        					System.out.println("No results");        					
        				}       				
        				else {
        					System.out.println("The digit appear " + cont2 + " time(s)");
        				}
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue2 = sc.nextInt();
            		if (continue2 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 3:
            		System.out.println("Enter a number:");
            		int num3, inverted = 0, res3;
            		num3 = sc.nextInt();
        			if (num3 < 0) {
        				System.out.println("Wrong.");
        				break;
        			}
            		while (num3 > 0) {
            			res3 = num3 % 10;
            			inverted = inverted * 10 + res3;
            			num3 /= 10;
            		}
            		System.out.println("Inverted number: " + inverted);
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue3 = sc.nextInt();
            		if (continue3 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 4:
            		System.out.println("Enter a binary number:");
            		int n4 = sc.nextInt();
            		String n40 = Integer.toString(n4);
            		n40 = n40.trim();
            		for (int x4 = n40.length()-1; x4 >= 0;) {
            			if (n40.charAt(x4) != '0' && n40.charAt(x4) != '1') {
            				System.out.println("Try Again.");
            			}
        				break;
            		}
            		/*do {
            			c4 = n4 % 10;
            			res4 = res4 + c4*(int)Math.pow(2, exp4);
            			exp4++;
            			n4=n4/10;
            		} while (n4 > 0);
            		System.out.println("The decimal number is " + res4);*/
            		String numeroBinario = sc.next();
            		int num = Integer.parseInt(numeroBinario,2);
            		System.out.println("Binario = " + numeroBinario + " Decimal = " + num);
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue4 = sc.nextInt();
            		if (continue4 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 5:
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue5 = sc.nextInt();
            		if (continue5 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 6:
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
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
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
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