package exam.designpatterns.decorator;

import org.w3c.dom.Text;

public class TudoMaiusculaDecorator extends TextoDecorator {

	private Texto textoDcorador;
	public TudoMaiusculaDecorator(Texto decorator) {
		super(decorator);
		this.textoDcorador = decorator;
	}

	@Override
	public String processar(String texto){
		return this.textoDcorador.processar(texto).toUpperCase() + "**";
	}
}