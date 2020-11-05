package modelo;

public class Inmueble {
	private long id;
	private String Ubicacion;
	private String Tama�o;
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
	public String getTama�o() {
		return Tama�o;
	}
	public void setTama�o(String tama�o) {
		Tama�o = tama�o;
	}
	public String getLocalidad() {
		return Localidad;
	}
	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}
	@Override
	public String toString() {
		return "Inmueble [id=" + id + ", Ubicacion=" + Ubicacion + ", Tama�o=" + Tama�o + ", Localidad=" + Localidad
				+ "]";
	}
	public Inmueble(long id, String ubicacion, String tama�o, String localidad) {
		super();
		this.id = id;
		Ubicacion = ubicacion;
		Tama�o = tama�o;
		Localidad = localidad;
	}
	
	
	}
