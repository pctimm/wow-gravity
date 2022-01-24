package mainObjects;
import java.io.IOException;
public class teste {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("TESTE");
		escreverTexto("eu amo batata", 3);
		
	}
	static void escreverTexto(String text, int time) throws InterruptedException {
		int tamanho = text.length();
		time = time * 1000;
		int interval = time / tamanho;
		System.out.println(interval);
		for (int i = 0; i < tamanho; i ++) {
			System.out.print(text.charAt(i));
			Thread.sleep(interval);
		}
		System.out.println();
	}
}
