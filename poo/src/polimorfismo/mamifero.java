package polimorfismo;

public class mamifero extends animal {
	public String corPelo;

	@Override
	public void locomover() {
		System.out.println("locomovendo");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de mamifero");
	}
}
