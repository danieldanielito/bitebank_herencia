package bitebank;

public class Gerente extends Funcionario{
	
	private int clave;

	public void setClave(int clave) {
		this.clave = clave;
	}
	 
	 public boolean iniciarSesion(int clave) {
		 if (this.clave == clave) {
	            return true;
	        } else {
	            return false;
	        }
	 }

}
