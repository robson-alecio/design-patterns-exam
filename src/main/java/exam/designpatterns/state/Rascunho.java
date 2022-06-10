package exam.designpatterns.state;

public class Rascunho extends State {

	private Publicacao publicacao;
	
	public Rascunho(Publicacao publicacao) {
		super(publicacao);
	}

	@Override
	protected boolean editar(String texto) {
		return true;
	}

	@Override
	public State proximoState() {
		//return this.publicacao.setState(new Revisao(this.publicacao));
		return new Revisao(this.publicacao);
	}
}
