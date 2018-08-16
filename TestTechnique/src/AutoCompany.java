
public class AutoCompany extends Company implements TaxeRateS {

	public AutoCompany(String SIRET, String name) {
		super(SIRET, name);

	}

	@Override
	public double computeTaxe(double CA) {
		return AUTO_COMPANY_RATE * CA;
	}

}
