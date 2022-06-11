package exam.designpatterns.state;

public class Revisao extends State {
	
	Integer edicoes  = 1;

	public Revisao(Publicacao publicacao) {
		super(publicacao);
	}

	@Override
	protected boolean editar(String texto) {
		if(edicoes <= 2){
			edicoes ++;
			return true;
		}
		return false;
	}

	@Override
	public State proximoState() {
		return new Publicado(super.getPublicacao());
	}
}
