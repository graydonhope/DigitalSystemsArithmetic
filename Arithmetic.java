import java.util.Scanner;
public class Arithmetic {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		boolean valid = false;
		System.out.println("Arithmetic Program: 10+-a" + "\n" + "Please select one of the following arithmetic operations...");

		while(!valid){
			System.out.println("1: Addition/Subtraction" + "\n" + "2: Converting Tool");
			String userInput = scanner.nextLine();
			if (userInput != null && userInput.equals("1")){
				valid = true;
				add_subtract();				
			}
			if (userInput != null && userInput.equals("2")){
				valid = true;
				hexConvert();				
			}
			else if(!valid){
				System.out.println("Bad input. try again");
			}
		}
	}

	public static void hexConvert(){
		System.out.println("Welcome to the binary to hexadecimal converter");
		NumberSystems numObj = new NumberSystems(); // Making new NumberSystem Object to access hex converter
		numObj.hexToBinary();

	}

	public static void add_subtract(){
		System.out.println("in addition/subtraction.. Coming soon!");
	}
}