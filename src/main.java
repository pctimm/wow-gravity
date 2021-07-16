import java.io.IOException;
import java.util.Scanner;
public class main {

	public static void main(String[] args) throws InterruptedException, IOException {
		Scanner input = new Scanner(System.in);
		
		// Thread.sleep(ms); para dar o tempo correto.
		System.out.println("Onde você está nesse momento?");
		System.out.println("[1] Terra  (g = 9,807 m/s²)\n"
						+  "[2] Sol  (g = 274 m/s²)\n"
						+ "[3] Mercúrio  (g = 3,7 m/s²)\n"
						+ "[4] Vênus  (g = 8,87 m/s²)\n"
						+ "[5] Marte  (g = 3,721 m/s²)\n"
						+ "[6] Júpiter  (g = 24,79 m/s²)\n"
						+ "[7] Saturno  (g = 10,44 m/s²)\n"
						+ "[8] Urano  (g = 8,87 m/s²)\n"
						+ "[9] Netuno  (g = 1,15 m/s²)");
		int planet;
		do {
			System.out.print(">>> ");
			planet = input.nextInt();
			if (planet >= 1 && planet <= 9) { // correto
				System.out.println("Ok!");
				if (planet != 1) {
					System.out.print("Eu acho que acredito... ");
					Thread.sleep(1200);
					String euAcho = "eu acho...";
					int len = euAcho.length();
					int timeWillBe = 1000 / len;
					for (int i = 0; i < len; i ++) {
						System.out.print(euAcho.charAt(i));
						Thread.sleep(timeWillBe);
					}
					System.out.println();
				}
				break;
			}
			else {  // incorreto
				System.out.println("Por favor, eu só conheço os planetas desse sistema solar.\n"
						+ "Digite novamente.\n");
			}
		} while (true);
		
		double gravity = 0;
		switch (planet) {
			case 1:
				gravity = 9.807;
				break;
			case 2:
				gravity = 274.0;
				break;
			case 3:
				gravity = 3.7;
				break;
			case 4:
				gravity = 8.87;
				break;
			case 5:
				gravity = 3.721;
				break;
			case 6:
				gravity = 24.79;
				break;
			case 7:
				gravity = 10.44;
				break;
			case 8:
				gravity = 8.87;
				break;
			case 9:
				gravity = 11.15;
				break;
			default:
				break;
		}
		System.out.println("Você está no topo de um prédio. Qual a altura (em metros)?");
		Thread.sleep(1000);
		for (int i = 0;
				i < "Porque aqui nós trabalhamos com padrões internacionais :D wow".length();
				i ++) {
			System.out.print("Porque aqui nós trabalhamos com padrões internacionais :D wow".charAt(i));
			Thread.sleep(20);
		}
		System.out.printf("\n>>> ");
		double height = input.nextDouble();
		System.out.println("Pressione ENTER para largar esse objeto! (mas isso não é perigoso?)");
		System.in.read();
		double timeFall = Math.sqrt((height * 2.0) / gravity);
		double timeFallMilli = timeFall * 1000;
		
		double timeToEnd = timeFallMilli;
		int counter = 0;
		/* while (timeToEnd > 0) {
		*	if (counter > 30) {
		*		System.out.println();
		*		counter = 0;
		*	}
		*	System.out.print(".");
		*	counter ++;
		*	if (timeToEnd >= 100) {
		*		Thread.sleep(100);
		*		timeToEnd -= 100;
		*	}
		*	else {
		*		Thread.sleep((int) timeToEnd);
		*		timeToEnd = 0;
		*	}
		*}
		*/
		Thread.sleep((int) timeFallMilli);
		System.out.println("eita caiu!");
		System.out.printf("Tempo: %.5f s\n", timeFall);
		input.close();
	}

}
