package ui;
import java.util.*;
import mainObjects.Planeta;
import util.*;

public class PlanetaUi {
	Scanner teclado = new Scanner(System.in);
	
	public static void uiCriarPlaneta() {
		System.out.println("-=-=- CRIANDO NOVO PLANETA -=-=-");
		String nome = PromptInput.readInput("NOME");
		double gravidade = Double.parseDouble(PromptInput.readInput("GRAVIDADE"));
		
		Planeta.pushPlaneta(nome, gravidade);
	}
	
	public static void mostrarPlanetas() {
		ArrayList<Planeta> lista = Planeta.getListaPlanetas();
		
		if (lista.size() == 0) System.out.println("[!] N�o existem planetas!");
		else {
			for (int i = 0; i < lista.size(); i ++) {
				Planeta p = (Planeta) lista.get(i);
				System.out.printf("%d -  %s | g = %.2f\n", i, p.getNome(), p.getGravity());
			}
		}
		System.out.println();
	}
}
