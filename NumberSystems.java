import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class NumberSystems extends Arithmetic{
	
	public static void main(String[] args){
		hexToBinary();


	}

	public static void hexToBinary(){

		Scanner scanner = new Scanner(System.in); 
		char[] valid_characters = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
		boolean valid = false;
		boolean valid_secondInput = false;
		char[] arrayed_input;


		//Checking validity of user input
		while(!valid){
			System.out.println("Please enter a number to convert from Hexadecimal to Binary: ");
			String userInput = scanner.nextLine();
			if(!userInput.equals("")){
				int inputLength = userInput.length();
				int compareToInputLength = 0;
				char[] input_in_array = userInput.toCharArray();
				String binaryValue = "";

				for(int i = 0; i < inputLength; i++){
					for(int y = 0; y < 16; y++){
						if( input_in_array[i] == valid_characters[y] ){
							compareToInputLength++;
						}

					}
				}

				if(compareToInputLength != inputLength){
					System.out.println("Invalid Input.");
			
				}
				else{
					valid = true;

					Map<Character, String> valueDictionary = new HashMap<Character, String>();
					valueDictionary.put('0', "0000 ");
					valueDictionary.put('1', "0001 ");
					valueDictionary.put('2', "0010 ");
					valueDictionary.put('3', "0011 ");
					valueDictionary.put('4', "0100 ");
					valueDictionary.put('5', "0101 ");
					valueDictionary.put('6', "0110 ");
					valueDictionary.put('7', "0111 ");
					valueDictionary.put('8', "1000 ");
					valueDictionary.put('9', "1001 ");
					valueDictionary.put('a', "1010 ");
					valueDictionary.put('b', "1011 ");
					valueDictionary.put('c', "1100 ");
					valueDictionary.put('d', "1101 ");
					valueDictionary.put('e', "1110 ");
					valueDictionary.put('f', "1111 ");

					
					for(int i = 0; i < inputLength; i++){
						String value = valueDictionary.get(input_in_array[i]);
						if( value != null){
							binaryValue += value;
						}
					}
				
					System.out.println(binaryValue + "\n");
					while(!valid_secondInput){
						System.out.println("Please select one of the following options..." + "\n" + "1: Convert another number" + "\n" +
							"2: Return to main menu" + "\n" + "3: Quit");
						String second_userInput = scanner.nextLine();
						if(second_userInput != null && second_userInput.equals("1")){
							hexToBinary();
						}
						if(second_userInput != null && second_userInput.equals("2")){
							System.out.println("return to main menu");

						}
					}
				}
			}
		}	
	}
}