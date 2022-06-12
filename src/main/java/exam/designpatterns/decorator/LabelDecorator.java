package designpatterns.decorator;

public class LabelDecorator extends DecoratorText {

	private String label;

	public LabelDecorator(DecoratorText decorator, String label) {
		super(decorator);
		this.label = label;
	}

}
