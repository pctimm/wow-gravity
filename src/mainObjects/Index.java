package mainObjects;

public class Index {
	
	public static void main(String[] args) {
//				+  "[2] Sol  (g = 274 m/s�)\n"
//				+ "[3] Merc�rio  (g = 3,7 m/s�)\n"
//				+ "[4] V�nus  (g = 8,87 m/s�)\n"
//				+ "[5] Marte  (g = 3,721 m/s�)\n"
//				+ "[6] J�piter  (g = 24,79 m/s�)\n"
//				+ "[7] Saturno  (g = 10,44 m/s�)\n"
//				+ "[8] Urano  (g = 8,87 m/s�)\n"
//				+ "[9] Netuno  (g = 1,15 m/s�)"
		
		
		Planeta.pushPlaneta("Terra", 9.807);
		Planeta.pushPlaneta("Merc�rio", 3.7);
		Planeta.pushPlaneta("V�nus", 8.87);
		Planeta.pushPlaneta("Marte", 3.721);
		Planeta.pushPlaneta("J�piter", 24.79);
		Planeta.pushPlaneta("Saturno", 10.44);
		Planeta.pushPlaneta("Urano", 8.87);
		Planeta.pushPlaneta("Netuno", 8.87);
		new MenuPrincipal();
	}

}
