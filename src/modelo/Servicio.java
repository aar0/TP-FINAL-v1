package modelo;

public class Servicio {
	private String tipoDeServicio;
	private double monto;
	public String getTipoDeServicio() {
		return tipoDeServicio;
	}
	public void setTipoDeServicio(String tipoDeServicio) {
		this.tipoDeServicio = tipoDeServicio;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	@Override
	public String toString() {
		return "Servicio [tipoDeServicio=" + tipoDeServicio + ", monto=" + monto + "]";
	}
	public Servicio(String tipoDeServicio, Double monto) {
		super();
		this.tipoDeServicio = tipoDeServicio;
		this.monto = monto;
	}
	
	
}
