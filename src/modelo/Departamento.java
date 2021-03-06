package modelo;

public class Departamento extends Propiedad{
	private String expensa;
	private double montoExpensa;
	public String getExpensa() {
		return expensa;
	}
	public void setExpensa(String expensa) {
		this.expensa = expensa;
	}
	public Double getMontoExpensa() {
		return montoExpensa;
	}
	public void setMontoExpensa(Double montoExpensa) {
		this.montoExpensa = montoExpensa;
	}
	@Override
	public String toString() {
		return "Departamento [expensa=" + expensa + ", montoExpensa=" + montoExpensa + "]";
	}
	public Departamento(long id, String ubicacion, String tama�o, String localidad, int cantidadHabitaciones,
			int cantidadBa�os, boolean cochera, String expensa, double montoExpensa) {
		super(id, ubicacion, tama�o, localidad, cantidadHabitaciones, cantidadBa�os, cochera);
		this.expensa = expensa;
		this.montoExpensa = montoExpensa;
	}
}
