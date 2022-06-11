package exam.designpatterns.state;

public abstract class State {

	protected Publicacao publicacao;

	public State(Publicacao publicacao) {
		this.publicacao = publicacao;
	}

	protected abstract boolean editar(String texto);

	public abstract State proximoState();
}
