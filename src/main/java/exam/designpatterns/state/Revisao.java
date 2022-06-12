package designpatterns.state;

public class Revisao extends State {

	public Revisao(Publicacao publicacao) {
		super(publicacao);
	}
	@Override
	protected boolean editar(String texto) {
		return false;
	}
	@Override
	public State proximoState() {
		return null;
	}
}
