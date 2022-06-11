package exam.designpatterns.decorator;

public class NegritoDecorator extends TextoDecorator {

	private Texto textoDcorador;
	public NegritoDecorator(Texto textoDecorador) {
		super(textoDecorador);
		this.textoDcorador = textoDecorador;
	}

	@Override
	public String processar(String texto){
		return  "**" + this.textoDcorador.processar(texto);
	}
}