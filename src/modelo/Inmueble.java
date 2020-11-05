package modelo;

public class Inmueble {
	private long id;
	private String Ubicacion;
	private String Tamaño;
	private String Localidad;
	public String getUbicacion() {
		return Ubicacion;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}
	public String getTamaño() {
		return Tamaño;
	}
	public void setTamaño(String tamaño) {
		Tamaño = tamaño;
	}
	public String getLocalidad() {
		return Localidad;
	}
	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}
	@Override
	public String toString() {
		return "Inmueble [id=" + id + ", Ubicacion=" + Ubicacion + ", Tamaño=" + Tamaño + ", Localidad=" + Localidad
				+ "]";
	}
	public Inmueble(long id, String ubicacion, String tamaño, String localidad) {
		super();
		this.id = id;
		Ubicacion = ubicacion;
		Tamaño = tamaño;
		Localidad = localidad;
	}
	
	
	}
