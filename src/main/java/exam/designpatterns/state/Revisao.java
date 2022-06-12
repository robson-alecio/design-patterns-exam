package exam.designpatterns.state;

public class Revisao extends State {

	Integer edicoes = 0;

	public Revisao(Publicacao publicacao) {
		super(publicacao);
	}

	@Override
	protected boolean editar(String texto) {
		if (edicoes <= 1){
			edicoes ++;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public State proximoState() {
		return new Publicado(super.getPublicacao());
	}
}
