package mainObjects;
import java.util.ArrayList;

public class Planeta {
	public static final Planeta modelo = new Planeta("Nenhum", 0);
	private String nome;
	private double gravity;
	private static int quantidadePlanetas = 0;
	private static ArrayList<Planeta> listaPlanetas = new ArrayList<>();
	
	public Planeta(String nome, double gravity) {
		this.nome = nome;
		this.gravity = gravity;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getGravity() {
		return this.gravity;
	}
	
	public static int getQuantidadePlanetas() {
		return Planeta.quantidadePlanetas;
	}
	
	public static ArrayList<Planeta> getListaPlanetas() {
		return listaPlanetas;
	}
	
	/*
	 * Envia para a lista um objeto Planeta j? instanciado
	 */
	public static void pushPlaneta(Planeta planetaAdicionado) {
		listaPlanetas.add(planetaAdicionado);
		quantidadePlanetas ++;
	}
	
	/*
	 * Instancia automaticamente um novo planeta
	 */
	public static void pushPlaneta(String nome, double gravity) {
		Planeta planetaAdicionado = new Planeta(nome, gravity);
		listaPlanetas.add(planetaAdicionado);
		quantidadePlanetas ++;
	}
	
	/*
	 * Recebe index (come?ando por 0), tratar anteriormente
	 */
	public static Planeta getPlaneta(int index) {
		return listaPlanetas.get(index);
	}
	
}
