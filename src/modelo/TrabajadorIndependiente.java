package modelo;

public class TrabajadorIndependiente extends TipoTrabajador{
	private String comprobante1;
	private String comprobante2;
	private String comprobante3;
	public String getComprobante1() {
		return comprobante1;
	}
	public void setComprobante1(String comprobante1) {
		this.comprobante1 = comprobante1;
	}
	public String getComprobante2() {
		return comprobante2;
	}
	public void setComprobante2(String comprobante2) {
		this.comprobante2 = comprobante2;
	}
	public String getComprobante3() {
		return comprobante3;
	}
	public void setComprobante3(String comprobante3) {
		this.comprobante3 = comprobante3;
	}
	@Override
	public String toString() {
		return "TrabajadorIndependiente [comprobante1=" + comprobante1 + ", comprobante2=" + comprobante2
				+ ", comprobante3=" + comprobante3 + "]";
	}
	public TrabajadorIndependiente(long id, String comprobante1, String comprobante2, String comprobante3) {
		super(id);
		this.comprobante1 = comprobante1;
		this.comprobante2 = comprobante2;
		this.comprobante3 = comprobante3;
	}
	
	
	
}
