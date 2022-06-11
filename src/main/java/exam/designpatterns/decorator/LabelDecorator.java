package exam.designpatterns.decorator;

public class LabelDecorator extends TextoDecorator {

	private String label;
	private Texto textoDcorador;

	public LabelDecorator(Texto decorator, String label) {
		super(decorator);
		this.textoDcorador = decorator;
		this.label = label;
	}

	@Override
	public String processar(String texto){
		return label + ": " + this.textoDcorador.processar(texto);
	}
}