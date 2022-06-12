package exam.designpatterns.decorator;

import java.util.Objects;

public abstract class TextoDecorator {

	private TextoDecorator decorator;

	public TextoDecorator(TextoDecorator decorator) {
		this.decorator = decorator;
	}

	public String processar(String text) {
		String textAlterado = text;
		if(Objects.nonNull(decorator)) {
			textAlterado = decorator.processar(text);
		}
		return textAlterado;
	}
}
