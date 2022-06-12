package exam.designpatterns.state;

public class Publicado extends State {

	public Publicado(Publicacao publicacao) {
		super(publicacao);
	}

	@Override
	protected boolean editar(String text) {
		return true;
	}

	@Override
	public State proximoState() {
		return null;
	}
}
