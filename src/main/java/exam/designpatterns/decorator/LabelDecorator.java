package exam.designpatterns.decorator;

public class LabelDecorator extends TextoDecorator {

	private Text decorator;
	private String label;

	public LabelDecorator(Text decorator, String label) {
		super(decorator);
		this.label = label;
		this.decorator = decorator;
	}

	@Override
	public String processar(String texto) {
		return (label + ": " + this.decorator.processar(texto));
	}

}
