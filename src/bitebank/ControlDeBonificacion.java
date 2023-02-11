package bitebank;

public class ControlDeBonificacion {

    private double suma;

    public void registrar(Funcionario e) {
        this.suma += e.bonificacion();
    }

    public double getSuma() {
        return suma;
    }
}
