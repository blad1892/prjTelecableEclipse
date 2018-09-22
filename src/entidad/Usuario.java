package entidad;

public class Usuario {
	Integer codigo;
	String nombre;
	String contracena;
	
	public void setCodigo(Integer codigo) {
		this.codigo=codigo;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setContrasena(String contracena) {
		this.contracena=contracena;
	}
	public String getContracena() {
		return contracena;
	}

    public Usuario(Integer codigo, String nombre, String contracena) {
    this.codigo=codigo;
    this.nombre=nombre;
    this.contracena=contracena;
    }
     

}
