package modelo;

public class TipoTrabajador {
	private long id;

	public TipoTrabajador(long id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "TipoTrabajador [id=" + id + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
