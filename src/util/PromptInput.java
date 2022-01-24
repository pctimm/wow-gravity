package util;
import java.util.Scanner;

public class PromptInput {
	static Scanner teclado = new Scanner(System.in);
	
	public static String readInput() {
		System.out.print(">>> ");
		String input = teclado.nextLine();
		return input;
	}
	
	public static String readInput(String msg) {
		System.out.print(msg + " >>> ");
		String input = teclado.nextLine();
		return input;
	}
}
