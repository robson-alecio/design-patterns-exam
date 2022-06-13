package exam.designpatterns.decorator;

public class TudoMaiusculaDecorator extends TextoDecorator {
	public TudoMaiusculaDecorator(TextoDecorator decorator) {
		super(decorator);
	}

	@Override
	public String processar(String text) {
		return super.processar(text).toUpperCase();
	}
}
