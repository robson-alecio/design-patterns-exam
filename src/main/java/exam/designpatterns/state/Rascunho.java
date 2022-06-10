package exam.designpatterns.state;

public class Rascunho extends State {

	public Rascunho(Publicacao publicacao) {
		super(publicacao);
	}

	@Override
	protected boolean editar(String texto) {
		return true;
	}

	@Override
	public State proximoState() {
		return new Revisao(super.publicacao) ;
	}
}
