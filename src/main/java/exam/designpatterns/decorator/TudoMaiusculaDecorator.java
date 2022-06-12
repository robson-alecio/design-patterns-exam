package exam.designpatterns.decorator;

public class TudoMaiusculaDecorator extends TextoDecorator {

	private Text decorator;

	public TudoMaiusculaDecorator(Text decorator) {
		super(decorator);
		this.decorator = decorator;
	}

	@Override
	public String processar(String texto) {
		return (this.decorator.processar(texto).toUpperCase() + "**");
	}
}
