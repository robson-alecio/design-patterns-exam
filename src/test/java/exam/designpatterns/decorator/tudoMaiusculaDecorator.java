package exam.designpatterns.decorator;

public class tudoMaiusculaDecorator extends TextoDecoratorTest{

	public tudoMaiusculaDecorator(TextoDecoratorTest deco) {
		super(deco);
	}
	
	@Override
	public String process(String text) {
		return super.process(text).toUpperCase();
	}
}
