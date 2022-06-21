package classe;

public class AreaCirc {
	double raio;
	static double pi = 3.14;
	
	public AreaCirc(double raioInicial) {
		// TODO Auto-generated constructor stub
		raio = raioInicial;
	
		
		
	}
	double area() {
		return pi * Math.pow(raio, 2);
	}
}
