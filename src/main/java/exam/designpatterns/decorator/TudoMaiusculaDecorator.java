package exam.designpatterns.decorator;

public class TudoMaiusculaDecorator extends TextoDecorator {
	public TudoMaiusculaDecorator(TextoDecorator decorator) {
		super(decorator);
	}
}
