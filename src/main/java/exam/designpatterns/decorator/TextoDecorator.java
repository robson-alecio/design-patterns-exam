package exam.designpatterns.decorator;

public abstract class TextoDecorator {

	private TextoDecorator decorator;

	public TextoDecorator(TextoDecorator decorator) {
		this.decorator = decorator;
	}

	public String processar(String texto) {
		String textoFiltrado = texto;
		if(this.decorator != null) {
			textoFiltrado = this.decorator.processar(texto);
		}
		return textoFiltrado;
	}
}
