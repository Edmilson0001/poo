package polimorfismo;

public class reptil extends animal {
	public String corEscama;

	@Override
	public void alimentar() {
		System.out.println("Comendo Vegetal");

	}

	@Override
	public void emitirSom() {
		System.out.println("Som de reptil");

	}

	@Override
	public void locomover() {
		System.out.println("restejando");

	}

}
