package exam.designpatterns.decorator;

public class negritoDecorator extends TextoDecoratorTest {

	public negritoDecorator(TextoDecoratorTest deco) {
		super(deco);
	}
	
	@Override
	public String process(String text) {
		return "--" + super.process(text) + "--";
	}
}

