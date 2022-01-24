package mainObjects;

public class Index {
	
	public static void main(String[] args) {
//				+  "[2] Sol  (g = 274 m/s²)\n"
//				+ "[3] Mercúrio  (g = 3,7 m/s²)\n"
//				+ "[4] Vênus  (g = 8,87 m/s²)\n"
//				+ "[5] Marte  (g = 3,721 m/s²)\n"
//				+ "[6] Júpiter  (g = 24,79 m/s²)\n"
//				+ "[7] Saturno  (g = 10,44 m/s²)\n"
//				+ "[8] Urano  (g = 8,87 m/s²)\n"
//				+ "[9] Netuno  (g = 1,15 m/s²)"
		
		
		Planeta.pushPlaneta("Terra", 9.807);
		Planeta.pushPlaneta("Mercúrio", 3.7);
		Planeta.pushPlaneta("Vênus", 8.87);
		Planeta.pushPlaneta("Marte", 3.721);
		Planeta.pushPlaneta("Júpiter", 24.79);
		Planeta.pushPlaneta("Saturno", 10.44);
		Planeta.pushPlaneta("Urano", 8.87);
		Planeta.pushPlaneta("Netuno", 8.87);
		new MenuPrincipal();
	}

}
