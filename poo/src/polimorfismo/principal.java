package polimorfismo;

public class principal {

	public static void main(String[] args) {
		mamifero m = new mamifero();
		reptil r = new reptil();
		peixe p = new peixe();
		ave a = new ave();
		cachorro au = new cachorro();
		m.locomover();
		r.locomover();
		p.locomover();
		a.locomover();
		au.emitirSom();
		au.reagir(true);
		au.reagir(16);
		au.reagir(5,12);
		au.reagir("danilo");
	}

}
