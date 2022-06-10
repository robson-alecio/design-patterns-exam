package exam.designpatterns.decorator;

public class NegritoDecorator extends TextoDecorator {

	public NegritoDecorator(TextoDecorator decorator) {
		super(decorator);
	}
	

	
	
	
	@Override
	public String processar(String texto) {
		// TODO Auto-generated method stub
		//System.out.println("passou negrito");
		//return super.processar(texto);
		return "**" + super.processar(texto) + "**" ;
		
	}
	
	
	
	
	
	
}
