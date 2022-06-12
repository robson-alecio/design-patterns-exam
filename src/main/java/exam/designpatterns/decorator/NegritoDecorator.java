package designpatterns.decorator;

public class DecoratorEmNegrito extends DecoratorText {

	public DecoratorEmNegrito(DecoratorText decorator) {
		super(decorator);
	}
	public String processar(String text) {
		return "**" + super.processar(text) + "**";
	}
}
