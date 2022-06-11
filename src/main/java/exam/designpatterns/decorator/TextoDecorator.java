package exam.designpatterns.decorator;

public abstract class TextoDecorator {

	private TextoDecorator decorator;

	public TextoDecorator(TextoDecorator decorator) {
		this.decorator = decorator;
	}

	public String processar(String texto){
		String textoImplementado = texto;
		if(Objects.nonNull(decorator)) {
			textoImplementado = decorator.processar(texto);
		}
		return textoImplementado;
	}; 
}
