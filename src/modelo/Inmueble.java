package modelo;

public class Inmueble {
	private String Ubicacion;
	private String Tamaño;
	private String Localidad;
	public String getUbicacion() {
		return Ubicacion;
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
		return "Inmueble [Ubicacion=" + Ubicacion + ", Tamaño=" + Tamaño + ", Localidad=" + Localidad + "]";
	}
	public Inmueble(String ubicacion, String tamaño, String localidad) {
		super();
		Ubicacion = ubicacion;
		Tamaño = tamaño;
		Localidad = localidad;
	}
	
	}
