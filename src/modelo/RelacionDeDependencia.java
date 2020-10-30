package modelo;

public class RelacionDeDependencia extends TipoTrabajador{
	private String reciboDeSueldo;

	public String getReciboDeSueldo() {
		return reciboDeSueldo;
	}

	public void setReciboDeSueldo(String reciboDeSueldo) {
		this.reciboDeSueldo = reciboDeSueldo;
	}

	@Override
	public String toString() {
		return "RelacionDeDependencia [reciboDeSueldo=" + reciboDeSueldo + "]";
	}

	public RelacionDeDependencia(String reciboDeSueldo) {
		super();
		this.reciboDeSueldo = reciboDeSueldo;
	}
	
	
}
