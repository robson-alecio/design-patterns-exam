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

	public void setTexto(String texto) {
		if(this.state.editar(texto)){
			this.texto = texto;
		} else {
			setRevisaoState(texto);
		}
	}	
	
	public void setRevisaoState(String texto) {
		state = new Revisao(this);
	}

}
