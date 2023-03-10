package bitebank;

public class Cliente implements Autenticable {
    private String nombre;
    private String numeroIdentidad;
    private String profesion;
    private ClaseUtil util;
    
    
    
   
    public Cliente() {
    	this.util = new ClaseUtil(); 
	}
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
		this.util.setClave(clave);
		
	}

	@Override
	public boolean iniciarSesion(int claveSeteada) {
	return util.iniciarSesion(claveSeteada);
	}
    
   

}
