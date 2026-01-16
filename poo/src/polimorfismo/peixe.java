package polimorfismo;

public class peixe extends animal {
	public String corEscama;

	@Override
	public void alimentar() {
		System.out.println("Come Substâncias");

	}

	@Override
	public void emitirSom() {
		System.out.println("Não faz som");

	}

	@Override
	public void locomover() {
		System.out.println("Nadando");

	}

}
