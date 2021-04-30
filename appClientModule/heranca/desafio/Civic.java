package heranca.desafio;

public class Civic extends Carro {

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		//setVelocidade(3);
		if(velocidade <=120) {
		velocidade += 3;
		}
	}
	
	
	public void frear() {
		velocidade -= 1*2;
	}
	
}
