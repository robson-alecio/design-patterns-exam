package exam.designpatterns.state;

public class Revisao extends State {
	
	int count = 1;

	public Revisao(Publicacao publicacao) {
		super(publicacao);
	}

	@Override
	protected boolean editar(String text) {
		return count++ <= 2;
	}

	@Override
	public State proximoState() {
		return new Publicado(super.publicacao);
	}
}
