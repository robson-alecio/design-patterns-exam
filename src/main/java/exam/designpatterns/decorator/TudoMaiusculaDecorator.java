package exam.designpatterns.decorator;

public class TudoMaiusculaDecorator extends TextoDecorator {
	public TudoMaiusculaDecorator(TextoDecorator decorator) {
		super(decorator);

	}
	
	

	@Override
	public String processar(String texto) {
		// TODO Auto-generated method stub
		//System.out.println("passou maiusculo");
		//String maiusculo = texto.toUpperCase();
		return super.processar(texto).toUpperCase();
	}
	
	
	
}


