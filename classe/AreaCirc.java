package classe;

public class AreaCirc {

	double raio;
	static double pi = 3.14;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return Math.pow(raio, 2) * pi;
	}
}
