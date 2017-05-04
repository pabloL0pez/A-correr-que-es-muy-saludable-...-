package miPaquete;

import java.util.LinkedList;
import java.util.List;

public class Categoria {

	private int nroCategoria;
	private char sexo;
	private int edadMin;
	private int edadMax;
	private List<Corredor> corredores;
	
	public int getEdadMin() {
		return edadMin;
	}
	
	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}
	
	public int getEdadMax() {
		return edadMax;
	}
	
	public void setEdadMax(int edadMax) {
		this.edadMax = edadMax;
	}
	
	public int getNroCategoria() {
		return nroCategoria;
	}

	public void setNroCategoria(int nroCategoria) {
		this.nroCategoria = nroCategoria;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public Corredor getCorredor(int corredor) {
		if(corredor < corredores.size()) {
			return corredores.get(corredor);
		}
		return new Corredor();
	}
	
	public void añadirCorredor(Corredor corredor) {
		corredores.add(corredor);
	}

	public Categoria(int nroCategoria, char sexo, int edadMin, int edadMax) {
		this.nroCategoria = nroCategoria;
		this.sexo = sexo;
		this.edadMin = edadMin;
		this.edadMax = edadMax;
		this.corredores = new LinkedList<Corredor>();
	}
	
	public void mostrarCategoria() {
		for (int j = 0; j < corredores.size(); j++) {
			System.out.println("Corredor: "+corredores.get(j).getNroCorredor());
		}
		
	}
	
}
