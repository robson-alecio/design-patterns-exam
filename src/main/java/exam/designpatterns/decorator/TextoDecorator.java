package exam.designpatterns.decorator;

public abstract class TextoDecorator extends Text {

	private final Text decorator;

	public TextoDecorator(Text decorator) {
		this.decorator = decorator;
	}

	@Override
	public String processar(String texto) {
		return (decorator.processar(texto));
	}
}
