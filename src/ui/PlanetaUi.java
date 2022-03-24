package ui;
import java.util.*;
import mainObjects.Planeta;
import util.*;

public class PlanetaUi {
	Scanner teclado = new Scanner(System.in);
	
	public static void uiCriarPlaneta() {
		System.out.println("-=-=- CRIANDO NOVO PLANETA -=-=-");
		String nome = PromptInput.readInput("NOME"); // bem livre
		
		double gravidade;
		try {
			 gravidade = Double.parseDouble(PromptInput.readInput("GRAVIDADE"));
			 Planeta.pushPlaneta(nome, gravidade);
		}
		catch (NumberFormatException naoEhNumero) {
			System.out.println("[!] Este não é um número válido");
		}
		
	}
	
	public static void mostrarPlanetas() {
		ArrayList<Planeta> lista = Planeta.getListaPlanetas();
		
		if (lista.size() == 0) System.out.println("[!] Não existem planetas!");
		else {
			for (int i = 0; i < lista.size(); i ++) {
				Planeta p = (Planeta) lista.get(i);
				System.out.printf("%d -  %s | g = %.2f m/s²\n", i + 1, p.getNome(), p.getGravity());
			}
		}
		System.out.println();
	}
	
	public static Planeta selecionarPlaneta() {
		int opcao = Integer.parseInt(PromptInput.readInput(
				String.format("Selecione um planeta [1~%d]", Planeta.getQuantidadePlanetas())));
		return Planeta.getPlaneta(opcao - 1);
	}
}
