package entidade;

public class Liquidificador {
	private int velocidade;
	private boolean estado;
	public Liquidificador() {
		velocidade = 0; 
		estado = false;
	}
	public int getVelocidade() {
		return velocidade;
	}
	
	public void VelocidadeMais() {
		if (estado && velocidade < 3) {
			velocidade ++;
		}
	}
	
	public void VelocidadeMenos() {
		if (estado && velocidade > 0) {
			velocidade --;
		}
	}
	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado() {
		estado = !estado;
		velocidade = 0;
	}
	
	
	

}
