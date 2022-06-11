package exam.designpatterns.state;

public abstract class State {

		protected PublicacaoTest publicacao;
		
		public State(PublicacaoTest publicacao) {
			this.publicacao = publicacao;
		}
		
		protected abstract boolean editar(String texto);
		
		public abstract State proximoState();
}
