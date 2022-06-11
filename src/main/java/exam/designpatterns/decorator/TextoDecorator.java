package exam.designpatterns.decorator;

public abstract class TextoDecorator extends Texto {

	private final Texto textoDecorador;

	public TextoDecorator(Texto textoDecorador) {
		this.textoDecorador = textoDecorador;
	}

	@Override
	public String processar(String texto) {
		return textoDecorador.processar(texto);
	}
}