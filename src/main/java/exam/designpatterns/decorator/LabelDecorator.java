package exam.designpatterns.decorator;

public class LabelDecorator extends TextoDecorator {

	private String label;

	public LabelDecorator(TextoDecorator decorator, String label) {
		super(decorator);
		this.label = label;
	}
	@Override
	public String processar(String texto) {
		return this.label + ": " + super.processar(texto);
	}

}
