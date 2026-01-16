package polimorfismo;

public class ave extends animal{
	public String corPena;

	@Override
	public void alimentar() {
		System.out.println("Come frutas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de ave");
		
	}

	@Override
	public void locomover() {
		System.out.println("Voando");
		
	}
	

}
