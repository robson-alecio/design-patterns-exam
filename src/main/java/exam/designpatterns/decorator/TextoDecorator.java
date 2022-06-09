package exam.designpatterns.decorator;

import java.util.Objects;

public abstract class TextoDecorator {

	private TextoDecorator decorator;

	public TextoDecorator(TextoDecorator decorator) {
		this.decorator = decorator;
	}

	public String processar(String texto){
		String textoTratado = texto;
		if(Objects.nonNull(decorator)) {
			textoTratado = decorator.processar(texto);
		}
		return textoTratado;
	}; 
}
