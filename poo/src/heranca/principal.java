package heranca;

public class principal {

	public static void main(String[] args) {
		pessoa pess = new pessoa();
		aluno alun = new aluno();
		professor prof = new professor();
		funcionario func = new funcionario();
		bolsista bol = new bolsista();
		
		bol.pagarmensalidade();
		pess.nome = "Alusio";
		alun.nome = "italo";
		prof.nome = "Denis";
		func.nome = "Kelvin";
		pess.idade = 20;
		pess.sexo = ("masculino");
		System.out.println(pess.nome);
		System.out.println(alun.nome);
        System.out.println(prof.nome);
        System.out.println(func.nome);
        System.out.println(pess.idade);	
        System.out.println(pess.sexo);
        
        alun.matricula = 2506;
        alun.curso = "programador de sistemas";
        System.out.println(alun.matricula);
        System.out.println(alun.curso);
        alun.fazeraniversario();
        System.out.println(alun.idade);
        alun.cancelarMatricula();
        
       
	}
	    
	   
	    
    

}
