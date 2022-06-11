package exam.designpatterns.state;

public class Revisao extends State {

	public int contador =0;
	
	public Revisao(Publicacao publicacao) {
		super(publicacao);
	}

	@Override
	protected boolean editar(String texto) {
		if(contador++ <= 1)
			return true;
		return false;
	}

	@Override
	public State proximoState() {
		return new Publicado(super.publicacao);
	}
}
