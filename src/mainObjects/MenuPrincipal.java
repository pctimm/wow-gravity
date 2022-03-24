package mainObjects;

import ui.PlanetaUi;
import util.PromptInput;

public class MenuPrincipal {
	
	private Planeta selecionado;
	
	MenuPrincipal() {
		// Inicializando input pelo console

		selecionado = Planeta.modelo;
		
		while (true) {
			
			System.out.println("-=-=- MENU PRINCIPAL -=-=-");
			System.out.println("PLANETAS: " + Planeta.getQuantidadePlanetas());
			System.out.println("SELECIONADO: " + selecionado.getNome());
			System.out.println("[1] Adicionar planeta");
			System.out.println("[2] Ver planetas");
			System.out.println("[3] Selecionar planeta");
			System.out.println("[4] Executar gravidade");
			System.out.println("[5] Ajuda");
			System.out.println("[6] Sair");
			
			try {
				int opcaoSelecionada = Integer.parseInt(PromptInput.readInput());
				switch (opcaoSelecionada) {
					case 1:
						PlanetaUi.uiCriarPlaneta();
						break;
					case 2:
						PlanetaUi.mostrarPlanetas();
						break;
					case 3:
						selecionado = PlanetaUi.selecionarPlaneta();
						break;
					case 4:
						System.out.println("aqui deve executar script gravidade");
						break;
					case 5:
						System.out.println("Ajuda: isso aqui serve para tal e tal");
						break;
					case 6:
						System.out.println("-=- Volte sempre! :) -=-");
						break;
					default:
						System.out.println("Opção inválida.");
						break;
				}
			} catch (NumberFormatException naoEhNumero) {
				System.out.println("[!] Por favor, digite um número válido.");
			}
		}
	}
}
