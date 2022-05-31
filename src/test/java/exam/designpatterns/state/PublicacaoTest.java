package exam.designpatterns.state;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PublicacaoTest {

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

}