package mainObjects;
import java.util.ArrayList;

public class Planeta {
	private String nome;
	private double gravity;
	public static int quantidadePlanetas = 0;
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
	
	public static ArrayList<Planeta> getListaPlanetas() {
		return listaPlanetas;
	}
	
	public static void pushPlaneta(Planeta planetaAdicionado) {
		listaPlanetas.add(planetaAdicionado);
		quantidadePlanetas ++;
	}
	
	public static void pushPlaneta(String nome, double gravity) {
		Planeta planetaAdicionado = new Planeta(nome, gravity);
		listaPlanetas.add(planetaAdicionado);
		quantidadePlanetas ++;
	}
}
