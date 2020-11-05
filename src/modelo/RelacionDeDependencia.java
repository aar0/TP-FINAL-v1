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

	public RelacionDeDependencia(long id, String reciboDeSueldo) {
		super(id);
		this.reciboDeSueldo = reciboDeSueldo;
	}
}
