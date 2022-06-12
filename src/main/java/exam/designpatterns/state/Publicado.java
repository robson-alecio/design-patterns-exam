package exam.designpatterns.state;

public class Publicado extends State {
	
	private Publicacao publicacao;

	public Publicado(Publicacao publicacao) {
		super(publicacao);
	}

	@Override
	protected boolean editar(String texto) {
		return false;
	}

	@Override
	public State proximoState() {
		return (new Revisao(publicacao));
	}
}
