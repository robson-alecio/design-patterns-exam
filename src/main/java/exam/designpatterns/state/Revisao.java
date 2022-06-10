package exam.designpatterns.state;

public class Revisao extends State {
 
	private Publicacao publicacao;
	private int qtdEdicao = 0;
	
	public Revisao(Publicacao publicacao) {
		super(publicacao);
	}

	@Override
	protected boolean editar(String texto) {
		if(qtdEdicao>=2) {
			return false;
		}
		qtdEdicao++;
		return true;
	}

	@Override
	public State proximoState() {
		//this.publicacao.setState(new Publicado(this.publicacao));
		return new Publicado(this.publicacao);
	}
}
