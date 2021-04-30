package heranca.desafio;

public class Carro {

	
	protected double velocidade = 0.0;
	
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public Carro(){
		
	}
	public Carro(double velocidade){
		this.velocidade = velocidade;
	}
	
	public void acelerar() {
		this.velocidade += velocidade;
	}
	
	public void frear() {
		if(velocidade > 0) {
		this.velocidade -= 1;
		}else {
			velocidade = 0;
		}
	}
	
}


