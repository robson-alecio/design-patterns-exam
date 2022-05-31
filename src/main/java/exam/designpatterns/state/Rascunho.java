package exam.designpatterns.state;

public class Rascunho extends State {

	public Rascunho(Publicacao publicacao) {
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
