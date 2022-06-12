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
		if(this.state.editar(texto)) {
			this.texto = texto;
		}
		//por favor ler o comentario que eu deixei no ultimo teste do state
		if(this.state instanceof Publicado) {
			state = new Revisao(this);
		}
	}
}
