package bitebank;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	@Override
	public boolean saca(double valor) {
		return super.saca(valor + (valor*.0002));
	}
	
	

}
