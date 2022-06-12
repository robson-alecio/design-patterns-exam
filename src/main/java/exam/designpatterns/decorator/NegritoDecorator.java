package exam.designpatterns.decorator;

public class NegritoDecorator extends TextoDecorator {

	private Text decorator;

	public NegritoDecorator(Text decorator) {
		super(decorator);
		this.decorator = decorator;
	}

	@Override
	public String processar(String texto) {
		return ("**" + this.decorator.processar(texto));
	}
}
