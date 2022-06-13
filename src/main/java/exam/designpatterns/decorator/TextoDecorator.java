package exam.designpatterns.decorator;

public abstract class TextoDecorator implements Texto{

	private final Texto decorator;

	public TextoDecorator(TextoDecorator decorator) {
		this.decorator = decorator;
	}
	
	@Override
	public String processar(String texto){
		String textoAux;
		if(decorator!=null) {	
			textoAux = decorator.processar(texto);	
		} else {
			return texto;
		}
		return textoAux;
	}; 
}
