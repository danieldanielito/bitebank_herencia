package bitebank;

public class Administrador extends Funcionario implements Autenticable {
    private ClaseUtil util;
    
    
    
 	public Administrador() {
		this.util = new ClaseUtil();
	}

	@Override
 	public void setClave(int clave) {
 		this.util.setClave(clave);
 		
 	}

 	@Override
 	public boolean iniciarSesion(int claveSeteada) {
 	return util.iniciarSesion(claveSeteada);
 	}

	@Override
	public double bonificacion() {
		
		return 200;
	}


}
