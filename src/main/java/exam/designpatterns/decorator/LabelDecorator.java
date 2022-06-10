package exam.designpatterns.decorator;

public class LabelDecorator extends TextoDecorator {

	private String label;

	public LabelDecorator(TextoDecorator decorator, String label) {
		super(decorator);
		this.label = label;
	}
 
	
	
	
	
	@Override
	public String processar(String texto) {
		// TODO Auto-generated method stub
		//String labelDecorator = colocarLabel(texto);
		//System.out.println("passou label");
		//return labelDecorator+super.processar(texto);
		return	this.label + ": " + super.processar(texto);
	}
	
	//public String colocarLabel(String texto) {
	//	return this.label+": ";
	//}
	
	
	
    
}
