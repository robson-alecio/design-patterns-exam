package designpatterns.state;

public class Publicacao {

	private State state;

	private String texto;

	public Publicacao(String texto) {
		this.texto = texto;
		state = new Teste(this);
	}

	public void avancar() {

	}

	public State getState() {
		return state;
	}

	public String getTexto() {
		return texto;
	}

	void setTexto(String texto) {
		this.texto = texto;

	}
}
