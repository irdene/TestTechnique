
public class SAS extends Company implements TaxeRateS {

	private String headquarter;

	public SAS(String SIRET, String name, String headquarter) {
		super(SIRET, name);
		this.headquarter = headquarter;
	}

	public String getHeadquarter() {
		return headquarter;
	}

	public void setHeadquarter(String headquarter) {
		this.headquarter = headquarter;
	}

	@Override
	public double computeTaxe(double CA) {
		return SAS_RATE * CA;
	}

}
