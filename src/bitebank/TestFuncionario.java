package bitebank;

public class TestFuncionario {

	public static void main(String[] args) {
		
		System.out.println("parte de funcionario");
		
		Funcionario daniel= new Funcionario();
		daniel.setNombre("daniel");
		daniel.setDocumento("22565");
		daniel.setSalario(2000);
		
		System.out.println(daniel.getDocumento());
		System.out.println(daniel.bonificacion());
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.println("parte de gerente");
		
        Gerente g1 = new Gerente();
        g1.setNombre("Marco");
        g1.setDocumento("235568413");
        g1.setSalario(5000.0);

        System.out.println(g1.getNombre());
        System.out.println(g1.getDocumento());
        System.out.println(g1.getSalario());

        g1.setClave(222);
        boolean autentico = g1.iniciarSesion(222);

        System.out.println(autentico);
        System.out.println(g1.bonificacion());

	}

}
