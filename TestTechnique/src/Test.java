
public class Test {

	public static void main(String[] args) {
		AutoCompany C1 = new AutoCompany("12345678912345", "Irdene");
		System.out.println(C1.name + " paiera " + C1.computeTaxe(15124.24) + " d'impots");

		SAS C2 = new SAS("78945612378945", "Wako", "174 rue de paris, 75018 Paris");
		System.out.println(C2.name + " paiera " + C2.computeTaxe(15124.24) + " d'impots");
	}

}
