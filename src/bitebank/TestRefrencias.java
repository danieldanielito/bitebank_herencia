package bitebank;

public class TestRefrencias {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNombre("Marcos");
        g1.setSalario(5000.0);

        Administrador ev = new Administrador();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControlDeBonificacion controle = new ControlDeBonificacion();
        controle.registrar(g1);
        controle.registrar(ev);
        controle.registrar(d);

        System.out.println(controle.getSuma());

    }

}
