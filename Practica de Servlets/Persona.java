package Vaney;

public class Persona {

	public String name;
	public String lastname;
	public String ci;
	public String cf;
	public String ch;
	public int cg;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getCh() {
		return ch;
	}

	public void setCh(String ch) {
		this.ch = ch;
	}

	public int getCg() {
		return cg;
	}

	public void setCg(int cg) {
		this.cg = cg;
	}

	public String getCj() {
		return cj;
	}

	public void setCj(String cj) {
		this.cj = cj;
	}

	public String getIi() {
		return ii;
	}

	public void setIi(String ii) {
		this.ii = ii;
	}

	public String getIu() {
		return iu;
	}

	public void setIu(String iu) {
		this.iu = iu;
	}

	public String cj;
	public String ii;
	public String iu;
	
	
	public Persona(String a, String b, String c, String d, String e, int f, String g, String h, String i) {
		name = a;
		lastname = b;
		ci = c;
		cf = d;
		ch = e;
		cg = f;
		cj = g;
		ii = h; 
		iu = i;
		
	}
	
	public String imprimirDatos() {
		return name +" "+ lastname+" "+ci+" "+cf+" "+ch+" "+cg+" "+cj+" "+ii+" "+iu;
	}
	
}
