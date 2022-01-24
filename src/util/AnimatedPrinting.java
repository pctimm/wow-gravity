package util;

public class AnimatedPrinting {
	public static void writeText(String text, double time) throws InterruptedException {
		int tamanho = text.length();
		final int secondsToMs = 1000;
		time = time * secondsToMs;  // milliseconds
		double interval = time / tamanho;
		for (int i = 0; i < tamanho; i ++) {
			System.out.print(text.charAt(i));
			Thread.sleep((int) interval);
		}
		System.out.println();
	}
}
