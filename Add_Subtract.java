import java.util.Scanner;
public class Add_Subtract extends Arithmetic{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to add or subtract?" + "\n" + "Please type '1' for ADDITION, or '2' for SUBTRACTION");
		String userInput = scanner.nextLine();
		boolean validInput = true;
		while(validInput){
			if(userInput != null && userInput.equals("1")){
				validInput = false;
				addition();
			}
			else if (userInput != null && userInput.equals("2")){
				validInput = false;
				subtraction();
			}
			else{
				System.out.println("invalid input");			
			}
		}
	}

	public static int addition(){
		boolean valid = true;
		System.out.println("please select what base of number you would like to add with");
		
		while(valid){
			Scanner scannerInput = new Scanner(System.in);
			Scanner input2 = new Scanner(System.in);
			String numberBase = scannerInput.next();
			int baseOfNumber = 0;
			int complements = 0;
			try{
				baseOfNumber = Integer.parseInt(numberBase);
			}
			catch (NumberFormatException e){
				System.out.println("You must enter a digit between 1-9");
			}
			System.out.println("Please select which complement you would like to use (*MAX* R-1)");
			String complementChoice = input2.next();
			try{
				complements = Integer.parseInt(complementChoice);
			}
			catch (NumberFormatException e){
				System.out.println("You must enter a digit between 1-9");
			}

			if (baseOfNumber == 0 || complements > baseOfNumber || (baseOfNumber - complements) > 1 || (baseOfNumber - complements) < 0){
				System.out.println("Invalid pair of number base and complement");
				break;
			}
		}
		return 0;	
	}

	public static int subtraction(){
		return 1;
	}
}