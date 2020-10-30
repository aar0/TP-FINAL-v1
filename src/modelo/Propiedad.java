package modelo;

public class Propiedad extends Inmueble{
	private int cantidadHabitaciones;
	private int cantidadBaños;
	private boolean cochera;
	public int getCantidadHabitaciones() {
		return cantidadHabitaciones;
	}
	public void setCantidadHabitaciones(int cantidadHabitaciones) {
		this.cantidadHabitaciones = cantidadHabitaciones;
	}
	public int getCantidadBaños() {
		return cantidadBaños;
	}
	public void setCantidadBaños(int cantidadBaños) {
		this.cantidadBaños = cantidadBaños;
	}
	public boolean isCochera() {
		return cochera;
	}
	public void setCochera(boolean cochera) {
		this.cochera = cochera;
	}
	@Override
	public String toString() {
		return "Propiedad [cantidadHabitaciones=" + cantidadHabitaciones + ", cantidadBaños=" + cantidadBaños
				+ ", cochera=" + cochera + "]";
	}
	public Propiedad(String ubicacion, String tamaño, String localidad, int cantidadHabitaciones, int cantidadBaños,
			boolean cochera) {
		super(ubicacion, tamaño, localidad);
		this.cantidadHabitaciones = cantidadHabitaciones;
		this.cantidadBaños = cantidadBaños;
		this.cochera = cochera;
	}
	
}
