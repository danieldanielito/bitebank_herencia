package bitebank;

public class Gerente extends Funcionario implements Autenticable{
    private int clave;
	@Override
	public void setClave(int clave) {
		this.clave = clave;
		
	}

	@Override
	public boolean iniciarSesion(int claveSeteada) {
	if (this.clave == claveSeteada) {
            return true;
        } else {
            return false;
        }
	}

	 @Override
	 public double bonificacion() {
		  return getSalario();
	 }



}
