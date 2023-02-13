package bitebank;

public class Cliente implements Autenticable {
    private String nombre;
    private String numeroIdentidad;
    private String profesion;
    private int clave;

   
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumeroIdentidad () {
        return numeroIdentidad;
    }
    public void setNumeroIdentidad (String numeroIdentidad) {
        this. numeroIdentidad = numeroIdentidad;
    }
    public String getProfesion () {
        return profesion;
    }
    public void setProfissao(String profesion) {
        this. profesion = profesion;
    }
   
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
    
   

}
