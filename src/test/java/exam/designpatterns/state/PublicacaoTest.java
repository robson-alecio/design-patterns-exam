package exam.designpatterns.state;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PublicacaoTest {
	
	private State state;
	
	private String texto;
	
	

	@Test
	public void editarPublicacaoEmRascunho() {
		Publicacao publicacao = new Publicacao("cachorro é legal");
		assertThat(publicacao.getState()).isInstanceOf(Rascunho.class);

		publicacao.setTexto("gato é legal");
		assertThat(publicacao.getState()).isInstanceOf(Rascunho.class);
		assertThat(publicacao.getTexto()).isEqualTo("gato é legal");

		publicacao.setTexto("tatu é legal");
		assertThat(publicacao.getState()).isInstanceOf(Rascunho.class);
		assertThat(publicacao.getTexto()).isEqualTo("tatu é legal");

		publicacao.setTexto("arara é legal");
		assertThat(publicacao.getState()).isInstanceOf(Rascunho.class);
		assertThat(publicacao.getTexto()).isEqualTo("arara é legal");
	}

	@Test
	public void editarSomenteDuasVezesPublicacaoEmRevisao() {
		Publicacao publicacao = new Publicacao("cachorro é legal");
		assertThat(publicacao.getState()).isInstanceOf(Rascunho.class);

		publicacao.avancar();
		assertThat(publicacao.getState()).isInstanceOf(Revisao.class);

		publicacao.setTexto("gato é legal");
		assertThat(publicacao.getState()).isInstanceOf(Revisao.class);
		assertThat(publicacao.getTexto()).isEqualTo("gato é legal");

		publicacao.setTexto("tatu é legal");
		assertThat(publicacao.getState()).isInstanceOf(Revisao.class);
		assertThat(publicacao.getTexto()).isEqualTo("tatu é legal");

		publicacao.setTexto("arara é legal");
		assertThat(publicacao.getState()).isInstanceOf(Revisao.class);
		assertThat(publicacao.getTexto()).isEqualTo("tatu é legal");
	}

	@Test
	public void naoEditarPublicacaoPublicada() {
		Publicacao publicacao = new Publicacao("cachorro é legal");
		assertThat(publicacao.getState()).isInstanceOf(Rascunho.class);

		publicacao.avancar();
		publicacao.avancar();
		assertThat(publicacao.getState()).isInstanceOf(Publicado.class);

		publicacao.setTexto("gato é legal");
		assertThat(publicacao.getState()).isInstanceOf(Revisao.class);
		assertThat(publicacao.getTexto()).isEqualTo("cachorro é legal");
	}
	
	public PublicacaoTest(String texto) {
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

	public void setText(String texto) {
		if(this.state.editar(texto)) {
			this.texto = texto;
		}
		if(this.state instanceof Publicado) {
			state = new Revisao(this);
		}
	}

}