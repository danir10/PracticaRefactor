package practica6;

public class Coche {
	

	//creamos la constante
	private static final String EL_COCHE_CON_MATRICULA = "El coche con matricula";
	
	 String matricula;
	 String combustible;
	 String modelo;
	 String fabricante;
	 

	public Coche() {
		matricula="";
		combustible="";
		modelo="";
		fabricante ="";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula=m;
		combustible=c;
		modelo=mo;
		fabricante=f;
	}
	


	private String MatriculaCoche() {
		return EL_COCHE_CON_MATRICULA + matricula + " ";
	}
	
	
	

	
	public String GasolinaCoche /* este seria el metodo a */ (String modelo, String fabricante)
	{
	
		String resultado =" es un "+ fabricante + modelo + "y gasta 1,337 euros por litro.";
		return resultado;
	}
	


	
	public String DieselCoche /* este seria el metodo b */(String modelo, String fabricante)
	{
		String resultado =" es un "+ fabricante + modelo + "y gasta 1,052 euros por litro.";
		return resultado;
	}
	

	
	public String HibridoCoche /* este seria el metodo c */(String modelo, String fabricante)
	{
		String resultado =" es un "+ fabricante + modelo + "y no necesita combustible.";
		return resultado;
	}
	

	
	public String tipoDeCombustible() {
		String resultado = "";
		switch(combustible) {
		case "Gasolina":
			resultado += MatriculaCoche() + GasolinaCoche(modelo, fabricante);
			break;
		case "Diésel":
			resultado += MatriculaCoche() + DieselCoche(modelo, fabricante);
			break;
		case "Híbrido":
			resultado += MatriculaCoche() + HibridoCoche(modelo, fabricante);
			break;
		default:
			resultado += MatriculaCoche() + "no dispone de información";
		}
		return resultado;

	}

	
}