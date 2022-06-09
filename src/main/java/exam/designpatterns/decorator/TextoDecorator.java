package exam.designpatterns.decorator;

public abstract class TextoDecorator {

	private TextoDecorator decorator;

	public TextoDecorator(TextoDecorator decorator) {
		this.decorator = decorator;
	}

	public String processar(String texto) {
		String textoProcessado = texto;
		if(decorator != null) {
			textoProcessado = decorator.processar(texto);
		}
		return textoProcessado;
	}

}
