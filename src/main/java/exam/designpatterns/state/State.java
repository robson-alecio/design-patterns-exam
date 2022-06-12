package exam.designpatterns.state;

public abstract class State {

	protected Publicacao publicacao;

	public State(Publicacao publicacao) {
		this.publicacao = publicacao;
	}

	protected abstract boolean editar(String text);

	public abstract State proximoState();
}
