package classe;

public class PrimeiroTrauma {
	
	int a = 3;
	static int b = 2;
	
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma(); //Para acessar int deve criar Instancia ou coloca static antes do int
		System.out.println(p.a);
		System.out.println(b);
	}
}
