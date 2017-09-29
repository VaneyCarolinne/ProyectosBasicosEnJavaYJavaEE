
public class Senador extends Legislador{

	
	public Senador(String provincia, String name, String lastname, String ci, String x){
		super(provincia,name,lastname,ci,x);
	}

	@Override
	public String getCamaraEnQueTrabaja() {
		return camara;
	}

}
