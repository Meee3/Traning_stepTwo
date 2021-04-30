import heranca.desafio.BMW;
import heranca.desafio.Carro;
import heranca.desafio.Civic;

public class CarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro carroCivic = new Civic();
		
		carroCivic.acelerar();
		carroCivic.acelerar();
		carroCivic.acelerar();
		carroCivic.acelerar();
		carroCivic.acelerar();
	

		System.out.println("minha Velocidade de Civic: " + carroCivic.getVelocidade() );
		carroCivic.frear();
		carroCivic.frear();
		carroCivic.frear();
		carroCivic.frear();
		System.out.println("minha Velocidade de BMW: " + carroCivic.getVelocidade() );
		

		Carro carroBMW = new BMW();
		
		carroBMW.acelerar();
		carroBMW.acelerar();
		carroBMW.acelerar();
		carroBMW.acelerar();
		carroBMW.acelerar();
		
		System.out.println("minha Velocidade de BMW: " + carroBMW.getVelocidade() );
		
		carroBMW.frear();
		carroBMW.frear();
		carroBMW.frear();
		carroBMW.frear();
		System.out.println("minha Velocidade de BMW: " + carroBMW.getVelocidade() );
		
	}

}
