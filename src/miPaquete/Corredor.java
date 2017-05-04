package miPaquete;

import java.util.List;

public class Corredor {
	
	private int edad;
	private char sexo;
	private int nroCorredor;
	private int nroCategoria;
	

	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public int getNroCategoria() {
		return nroCategoria;
	}

	public void setNroCategoria(int nroCategoria) {
		this.nroCategoria = nroCategoria;
	}
	
	public void setNroCategoria(List<Categoria> categorias) {
		for(int i = 0 ; i < categorias.size() ; i++) {
			if(this.edad >= categorias.get(i).getEdadMin() || this.edad <= categorias.get(i).getEdadMax()) {
				this.setNroCategoria(categorias.get(i).getNroCategoria());
				return;
			}
		}
	}
	
	public int getNroCorredor() {
		return nroCorredor;
	}

	public void setNroCorredor(int nroCorredor) {
		this.nroCorredor = nroCorredor;
	}

	public Corredor() {
		this.edad = 0;
		this.sexo = ' ';
		this.nroCorredor = 0;
		this.nroCategoria = 0;
	}
	
	public Corredor(int edad, char sexo, int nroCorredor) {
		this.edad = edad;
		this.sexo = sexo;
		this.nroCorredor = nroCorredor;
		this.nroCategoria = 0;
	}
	
	public Corredor(int edad, char sexo, int nroCorredor, List<Categoria> categorias) {
		this.edad = edad;
		this.sexo = sexo;
		this.nroCorredor = nroCorredor;
		for(int i = 0 ; i < categorias.size() ; i++) {
			if(this.edad >= categorias.get(i).getEdadMin() && this.edad <= categorias.get(i).getEdadMax() && this.sexo == categorias.get(i).getSexo()) {
				//this.setNroCategoria(categorias.get(i).getNroCategoria());
				this.setNroCategoria(i+1);
				return;
			}
		}
	}

}
