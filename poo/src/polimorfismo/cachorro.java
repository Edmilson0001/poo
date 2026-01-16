package polimorfismo;

public class cachorro extends mamifero{
	@Override
	public void emitirSom() {
		System.out.println("Au!Au!Au!");
	}
    public void reagir(String frase) {
    	 if(frase.equals( "Toma comida") || frase.equals("Olá")) {
    		 System.out.println("Abana e late");
    	 }else if(frase == "Danilo") {
    		 System.out.println("Rosna");
    	 }else {
    		 System.out.println("Rosna");
    	 }
    }
    public void reagir(int hora) {
    	if(hora<12 && hora>=0) {
    		System.out.println("Abana");
    	}else if (hora>=18 && hora<24) {
    		System.out.println("ignora");
    	}else if(hora>12 && hora<18) {
    		System.out.println("late");
    	}
    }
    public void reagir(boolean dono) {
    	if(dono) {
    		System.out.println("Abana"); 
    	}else {
    		System.out.println("Rosna e Late");
    	}
    	
    }
    public void reagir(int idade, float peso) {
    	if (idade<5) {
    		if (peso <10) {
    			System.out.println("abana");
    		}else {
    			System.out.println("Late");
    		}	
    		}else {
    			if(peso<10) {
    				System.out.println("Rosna");
    			}else {
    				System.out.println("Ignora");
    			}
    		}
    	}
    
    
}
