package bitebank;

public class TestCuenta {

	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(1,1);
		CajaDeAhorro ca = new CajaDeAhorro(2,2);
		cc.deposita(2000);
		cc.transfiere(1000, ca);
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}

}
