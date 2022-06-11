package exam.designpatterns.decorator;

import java.util.Objects;

public abstract class TextoDecorator {

	private TextoDecorator decorator;


	public TextoDecorator(TextoDecorator decorator) {
		this.decorator = decorator;
	}

	public String processar(String texto) {
		//return this.decorator.toString();
		if(decorator != null) {
			texto = decorator.processar(texto);
		}
		return texto;
	}
	
}
