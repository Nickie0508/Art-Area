package entities;

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
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;   
	}
	public void ligaDesliga(boolean estado) {
		if (estado == false) {
			estado = true;
			}else {
			estado = false;
		}
	}
	public void mais() {
		if (estado && velocidade <3)
			velocidade ++
		
	}
}
