package bitebank;

public class SistemaInterno {
	private int clave=123;

	public boolean autentica(Autenticable gerente_administrador_cliente) {
		boolean puedeIniciarSesion = gerente_administrador_cliente.iniciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("login exitoso");
			return true;
		}else {
			System.out.println("login error");
			return false;
		}	
		
	}
}
