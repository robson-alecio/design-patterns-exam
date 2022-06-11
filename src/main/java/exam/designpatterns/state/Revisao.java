package exam.designpatterns.state;

public class Revisao extends State {

	private int cont = 1;

	public Revisao(Publicacao publicacao) {
		super(publicacao);
	}

	@Override
	protected boolean editar(String texto) {
		return cont++ <= 2 ;
	}

	@Override
	public State proximoState() {
		return new Revisao(super.publicacao) ;
	}
	}
}
