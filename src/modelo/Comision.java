package modelo;

public class Comision {
	private long id;
	private String tipoDePago;
	private double monto;
	public String getTipoDePago() {
		return tipoDePago;
	}
	public void setTipoDePago(String tipoDePago) {
		this.tipoDePago = tipoDePago;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	@Override
	public String toString() {
		return "Comision [id=" + id + ", tipoDePago=" + tipoDePago + ", monto=" + monto + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Comision(long id, String tipoDePago, double monto) {
		super();
		this.id = id;
		this.tipoDePago = tipoDePago;
		this.monto = monto;
	}
}
