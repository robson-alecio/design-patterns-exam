package exam.designpatterns.state;

public class Publicado extends State{
	
	public Publicado (PublicacaoTest publicacao) {
		super(publicacao);
	}
	
	@Override
	protected boolean editar(String texto) {
		return false;
	}
	
	@Override
	public State proximoState() {
		return null;
	}

}

