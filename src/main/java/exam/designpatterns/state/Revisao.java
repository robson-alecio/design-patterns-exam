package exam.designpatterns.state;

public class Revisao extends State {
	
	private int limiteEdicao = 0;

	public Revisao(Publicacao publicacao) {
		super(publicacao);
	}

	@Override
	protected boolean editar(String texto) {
		if(limiteEdicao == 2)
			return false;
		limiteEdicao++;
		return true;
	}

	@Override
	public State proximoState() {
		return new Publicado(publicacao);
	}
	
}
