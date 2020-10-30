package modelo;

public class Comision {
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
		return "Comision [tipoDePago=" + tipoDePago + ", monto=" + monto + "]";
	}
	public Comision(String tipoDePago, double monto) {
		super();
		this.tipoDePago = tipoDePago;
		this.monto = monto;
	}
	
}
