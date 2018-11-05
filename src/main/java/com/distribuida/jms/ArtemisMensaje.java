package com.distribuida.jms;

public class ArtemisMensaje {

	private int n1;
	private int n2;
	private int resultado;
	
		
	public ArtemisMensaje(int n1, int n2, int resultado) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.resultado = resultado;
	}
	
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	 @Override
	    public String toString() {
	        return String.format("ArtemisMensaje{n1=%s, n2=%s}", getN1(), getN2());
	    }
	
	
}
