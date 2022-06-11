package exam.designpatterns.decorator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Objects;

class TextoDecoratorTest {
	

	private TextoDecoratorTest deco;
	
	public TextoDecoratorTest(TextoDecoratorTest deco) {
		this.deco = deco;
	}

	public String process(String text) {
		String textTreated = text;
		if(Objects.nonNull(deco)) {
			textTreated = deco.process(text);
		}
		return textTreated;
	}

	@Test
	public void combinacaoUm() {
		var negritoDecorator = new NegritoDecorator(null);
		var labelDecorator = new LabelDecorator(negritoDecorator, "Texto");
		var tudoMaiusculaDecorator = new TudoMaiusculaDecorator(labelDecorator);

		String resultado = tudoMaiusculaDecorator.processar("uma frase legal");
		assertThat(resultado).isEqualTo("TEXTO: **UMA FRASE LEGAL**");
	}

	@Test
	public void combinacaoDois() {
		var tudoMaiusculaDecorator = new TudoMaiusculaDecorator(null);
		var labelDecorator = new LabelDecorator(tudoMaiusculaDecorator, "Texto");
		var negritoDecorator = new NegritoDecorator(labelDecorator);

		String resultado = negritoDecorator.processar("uma frase legal");
		assertThat(resultado).isEqualTo("**Texto: UMA FRASE LEGAL**");
	}
}