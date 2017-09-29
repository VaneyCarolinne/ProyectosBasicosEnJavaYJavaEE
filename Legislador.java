
public abstract class Legislador extends Persona {

	/**
	 * @param provinciaQueRepresenta: es el parametro de la provincia que
	 * representa el legislador. Es un String.
	 */
	public String provinciaQueRepresenta;
	protected String camara;
	
	public Legislador(String prov, String n, String a, String c, String x){
		super(n,a,c);
		provinciaQueRepresenta=prov;
		camara=x;
	}
	public String getProvincia(){return(provinciaQueRepresenta);}
	public abstract String getCamaraEnQueTrabaja();

}
