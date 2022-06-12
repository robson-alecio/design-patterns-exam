package exam.designpatterns.state;

public class Revisao extends State {

	private Publicacao publicacao;

	public Revisao(Publicacao publicacao) {
		super(publicacao);
		this.publicacao = publicacao;
	}

	@Override
	protected boolean editar(String texto) {
		return false;
	}

	@Override
	public State proximoState() {
		return (new Publicado(publicacao));
	}
}
