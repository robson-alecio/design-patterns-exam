package exam.designpatterns.decorator;

public class labelDecorator extends TextoDecoratorTest {

	private String label;
	
	public labelDecorator(TextoDecoratorTest deco, String label) {
		super(deco);
		this.label = label;
	}
	
	@Override
	public String process(String text) {
		return this.label + ":" + super.process(text);
	} 
	
}
