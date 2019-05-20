package practica6;

public class Coche {
	String matricula;
	String atrib;
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		atrib = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		atrib = c;
		modelo = mo;
		fabricante = f;
	}
	


	
	public String GasolinaCoche /* este seria el metodo a */(String modelo, String fabricante)
	{
	
		String resultado =" es un "+ fabricante + modelo + "y gasta 1,337 euros por litro.";
		return resultado;
	}
	


	
	public String DieselCoche /* este seria el metodo b */(String modelo, String fabricante)
	{
		String resultado =" es un "+ fabricante + modelo + "y gasta 1,052 euros por litro.";
		return resultado;
	}
	

	
	
	public String HibridoCoche /* este seria el metodo c */ (String modelo, String fabricante)
	{
		String resultado =" es un "+ fabricante + modelo + "y no necesita combustible.";
		return resultado;
	}
	
	
	
	

	public String metodo1() {
		String resultado = "";
		if (atrib == "Gasolina") {
			resultado += "El coche con matricula " + GasolinaCoche(modelo, fabricante);
			
		} else if (atrib == "Diesel") {
			resultado += "El coche con matricula " + DieselCoche(modelo, fabricante);
		
		} else if (atrib == "Híbrido") { 
			resultado += "El coche con matricula " + HibridoCoche(modelo, fabricante);
		
		} else {
			resultado += "El coche con matricula " + "no dispone de información";
		}
		return resultado;
	}
}
