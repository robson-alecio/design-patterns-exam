package exam.designpatterns.state;

public class Rascunho extends State {
	
	private Publicacao publicacao;

	public Rascunho(Publicacao publicacao) {
		super(publicacao);
		this.publicacao = publicacao;
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
