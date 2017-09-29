
public class Diputado extends Legislador{

 
	public Diputado(String provincia, String name, String lastname, String ci, String x){
		super(provincia,name,lastname,ci,x);
	}

	/**
	 * implementacion del getCamaraEnQueTrabaja... 
	 */	
	public String getCamaraEnQueTrabaja() {
		
		return camara;
	}

}
