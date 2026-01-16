package poo;

public class pincel {
	private String modelo;
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	public String cor;
	public int carga;
	boolean tampada;

	public void rabiscar() {
		if (tampada == true) {
			System.out.println("Erro, não posso rabiscar!");
		} else {
			System.out.println("Estou rabiscando");
		}

	}

	public void status() {
		System.out.println("um pincel " + cor);
		System.out.println("Está tampada? " + tampada);
	}

	public void tampar() {
		tampada = true;
	}

	public void destampar() {
		tampada = false;
	}

	public String funcao(String tipo) {
		String resposta = "Essa caneta é do tipo" + tipo;
		return resposta;

	}
}
