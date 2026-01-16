package heranca;

public class professor extends pessoa{
	public String especialidade;
	public float salario;
	public void receberAumento(float aumento) {
		salario = salario + aumento;
		
	}

}
