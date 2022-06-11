package exam.designpatterns.decorator;

import java.util.Objects;

public abstract class TextoDecorator {

	private TextoDecorator decorator;

	public TextoDecorator(TextoDecorator decorator) {
		this.decorator = decorator;
	}

	public String processar(String texto){
		String novoTexto = texto;
		if(Objects.nonNull(decorator)) {
			novoTexto = decorator.processar(texto);
		}
		return novoTexto;
	}; 
}
