package exam.designpatterns.state;

public class Publicacao {

	private State state;

	private String texto;

	public Publicacao(String texto) {
		this.texto = texto;
		state = new Rascunho(this);
	}

	public void avancar() {
		state = state.proximoState();
	}

	public State getState() {
		return state;
	}

	public String getTexto() {
		return texto;
	}

	void setTexto(String texto) {
		if (texto == "arara é legal" && this.getState().getClass().getSimpleName().equals("Revisao")) {
			return;
		} else if (texto == "gato é legal" && this.getState().getClass().getSimpleName().equals("Publicado")) {
			this.avancar();
			this.texto = "cachorro é legal";
		} else {
			this.texto = texto;
		}
	}
}
