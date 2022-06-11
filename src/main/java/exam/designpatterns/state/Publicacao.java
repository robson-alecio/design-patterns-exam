package exam.designpatterns.state;

public class Publicacao {

	private State state;

	private String texto;

	public Publicacao(String texto) {
		this.texto = texto;
		state = new Rascunho(this);
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void avancar() {
       //this.state = new Revisao(this);
		this.state = this.getState().proximoState();
	}

	public State getState() {
		return state;
	}

	public String getTexto() {
		return texto;
	}

	void setTexto(String texto) {
		//if((this.getClass().isInstance(Publicado.class))) {
	    //}
		if(this.getState().editar(texto)) {
			this.texto = texto;
		}
		
		/*comando para mudar o state para revisao caso faça uma edição no publicado conforme o que 
		 * esta no teste "naoEditarPublicacaoPublicada()"**/
		if(this.getState() instanceof Publicado ) {
			this.state = new Revisao(this);
		}
		
		
		
	}
}
