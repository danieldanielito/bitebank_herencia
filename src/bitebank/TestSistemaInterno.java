package bitebank;

public class TestSistemaInterno {

	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente ger = new Gerente();
		ger.setClave(123);
		Administrador ad = new Administrador();
		ad.setClave(22);
		Cliente cli = new Cliente();
		cli.setClave(123);
		sistema.autentica(cli);
		sistema.autentica(ad);
		sistema.autentica(ger);
		

	}

}
