package bitebank;

public class Gerente extends Funcionario implements Autenticable{
    private ClaseUtil util;
    
   
	public Gerente() {
		this.util = new ClaseUtil();
	}

	@Override
	public boolean iniciarSesion(int claveSeteada) {
	return util.iniciarSesion(claveSeteada);
	}

	 @Override
	 public double bonificacion() {
		  return getSalario();
	 }

	@Override
	public void setClave(int clave) {
		this.util.setClave(clave);
		
	}



}
