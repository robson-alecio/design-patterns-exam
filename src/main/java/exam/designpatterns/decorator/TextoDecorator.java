package exam.designpatterns.decorator;

import java.util.Objects;

public abstract class TextoDecorator {

	private TextoDecorator decorator;

	public TextoDecorator(TextoDecorator decorator) {
		this.decorator = decorator;
	}

	public String processar(String text) {
		String altText = text;
		if(Objects.nonNull(decorator)) {
			altText = decorator.processar(text);
		}
		return altText;
	};
}
