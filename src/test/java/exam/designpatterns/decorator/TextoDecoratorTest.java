package exam.designpatterns.decorator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TextoDecoratorTest {

	@Test
	public void combinacaoUm() {
		var negritoDecorator = new NegritoDecorator(new Texto());
		var labelDecorator = new LabelDecorator(negritoDecorator, "Texto");
		var tudoMaiusculaDecorator = new TudoMaiusculaDecorator(labelDecorator);

		String resultado = tudoMaiusculaDecorator.processar("uma frase legal");
		assertThat(resultado).isEqualTo("TEXTO: **UMA FRASE LEGAL**");
	}

	@Test
	public void combinacaoDois() {
		var tudoMaiusculaDecorator = new TudoMaiusculaDecorator(new Texto());
		var labelDecorator = new LabelDecorator(tudoMaiusculaDecorator, "Texto");
		var negritoDecorator = new NegritoDecorator(labelDecorator);

		String resultado = negritoDecorator.processar("uma frase legal");
		assertThat(resultado).isEqualTo("**Texto: UMA FRASE LEGAL**");
	}
}