
public abstract class Company {

	protected String SIRET;
	protected String name;

	public Company(String SIRET, String name) {
		this.SIRET = SIRET;
		this.name = name;

	}

	public String getSIRET() {
		return SIRET;
	}

	public void setSIRET(String SIRET) {
		this.SIRET = SIRET;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract double computeTaxe(double CA);

}
