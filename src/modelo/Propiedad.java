package modelo;

public class Propiedad extends Inmueble{
	private int cantidadHabitaciones;
	private int cantidadBa�os;
	private boolean cochera;
	public int getCantidadHabitaciones() {
		return cantidadHabitaciones;
	}
	public void setCantidadHabitaciones(int cantidadHabitaciones) {
		this.cantidadHabitaciones = cantidadHabitaciones;
	}
	public int getCantidadBa�os() {
		return cantidadBa�os;
	}
	public void setCantidadBa�os(int cantidadBa�os) {
		this.cantidadBa�os = cantidadBa�os;
	}
	public boolean isCochera() {
		return cochera;
	}
	public void setCochera(boolean cochera) {
		this.cochera = cochera;
	}
	@Override
	public String toString() {
		return "Propiedad [cantidadHabitaciones=" + cantidadHabitaciones + ", cantidadBa�os=" + cantidadBa�os
				+ ", cochera=" + cochera + "]";
	}
	public Propiedad(String ubicacion, String tama�o, String localidad, int cantidadHabitaciones, int cantidadBa�os,
			boolean cochera) {
		super(ubicacion, tama�o, localidad);
		this.cantidadHabitaciones = cantidadHabitaciones;
		this.cantidadBa�os = cantidadBa�os;
		this.cochera = cochera;
	}
	
}
