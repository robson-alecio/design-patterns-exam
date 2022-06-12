package designpatterns.decorator;

public abstract class DecoratorText {

	private DecoratorText decorator;

	public DecoratorText(DecoratorText decorator) {
		this.decorator = decorator;
	}
	public String processar(String texto) {
		return null;
	}
}
