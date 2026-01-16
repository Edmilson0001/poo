package heranca;

public class funcionario extends pessoa {
	public String setor;
	public boolean trabalhando;
	public void mudarTrabalho() {
		trabalhando = !trabalhando;
	}

}
