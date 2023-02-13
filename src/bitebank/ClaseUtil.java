package bitebank;

public class ClaseUtil {
 private int clave;



public void setClave(int clave) {
	this.clave = clave;
}

public boolean iniciarSesion(int claveSeteada) {
return this.clave == claveSeteada;
}
  
}
