package exam.designpatterns.decorator;

public class NegritoDecorator extends TextoDecorator {

	public NegritoDecorator(TextoDecorator decorator) {
		super(decorator);
	}
}
