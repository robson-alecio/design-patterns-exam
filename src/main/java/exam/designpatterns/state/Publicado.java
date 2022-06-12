package designpatterns.state;

public class Published extends State {

	public Published(Publicacao publicacao) {
		super(publicacao);
	}

	@Override
	protected boolean editar(String texto) {
		return false;
	}

	@Override
	public State proximoState() {
		return null;
	}
}
