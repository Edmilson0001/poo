package poo;

public class main {

	public static void main(String[] args) {
		pincel p1 = new pincel();
		p1.cor = "Azul";
		p1.carga = 100;
		p1.setModelo("Bic");
		System.out.println(p1.getModelo());
		p1.tampada = false;
		p1.status();
		p1.destampar();
		p1.rabiscar();
		String info = p1.funcao("quadro branco");
		System.out.println(p1.funcao(" Permanente"));
		
		pincel p2 = new pincel();
	    //p2.modelo = "Masterprint";
		p2.cor = "vermelha";
	    p2.carga = 20;
	    p2.tampada = true;
	    p1.status();
	}

}
