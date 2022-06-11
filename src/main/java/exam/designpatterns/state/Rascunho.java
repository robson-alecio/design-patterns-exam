package exam.designpatterns.state;

public class Rascunho extends State {

	public Rascunho(PublicacaoTest publicacao) {
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
