package modelo;

public class Arancel {
	private int numeroDeArancel;
	private double montoDeArancel;
	private double montoTotalDeArancel;
	private int diasDeMora;
	private boolean pagado;
	public int getNumeroDeArancel() {
		return numeroDeArancel;
	}
	public void setNumeroDeArancel(int numeroDeArancel) {
		this.numeroDeArancel = numeroDeArancel;
	}
	public double getMontoDeArancel() {
		return montoDeArancel;
	}
	public void setMontoDeArancel(double montoDeArancel) {
		this.montoDeArancel = montoDeArancel;
	}
	public double getMontoTotalDeArancel() {
		return montoTotalDeArancel;
	}
	public void setMontoTotalDeArancel(double montoTotalDeArancel) {
		this.montoTotalDeArancel = montoTotalDeArancel;
	}
	public int getDiasDeMora() {
		return diasDeMora;
	}
	public void setDiasDeMora(int diasDeMora) {
		this.diasDeMora = diasDeMora;
	}
	public boolean isPagado() {
		return pagado;
	}
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
	@Override
	public String toString() {
		return "Arancel [numeroDeArancel=" + numeroDeArancel + ", montoDeArancel=" + montoDeArancel
				+ ", montoTotalDeArancel=" + montoTotalDeArancel + ", diasDeMora=" + diasDeMora + ", pagado=" + pagado
				+ "]";
	}
	public Arancel(int numeroDeArancel, double montoDeArancel, double montoTotalDeArancel, int diasDeMora,
			boolean pagado) {
		super();
		this.numeroDeArancel = numeroDeArancel;
		this.montoDeArancel = montoDeArancel;
		this.montoTotalDeArancel = montoTotalDeArancel;
		this.diasDeMora = diasDeMora;
		this.pagado = pagado;
	}

}
