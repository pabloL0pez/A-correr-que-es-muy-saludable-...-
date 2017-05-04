package miPaquete;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Carrera {
	
	private List<Corredor> corredores;
	private List<Categoria> categorias;
	private List<Integer> resultados;
	
	public List<Corredor> getCorredores() {
		return corredores;
	}

	public void setCorredores(List<Corredor> corredores) {
		this.corredores = corredores;
	}
	
	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	public List<Integer> getResultados() {
		return resultados;
	}
	
	public void setResultados(List<Integer> resultados) {
		this.resultados = resultados;
	}
	
	public Carrera(String path) {
		File arch = new File(path);
		try {
			Scanner scan = new Scanner(arch);
			int cantCompetidores = scan.nextInt();
			if(cantCompetidores < 1 || cantCompetidores > 1000000) {
				System.out.println("Cantidad de competidores no válida.");
				System.exit(1);
			}
			
			int cantCategoriasFemeninas = scan.nextInt();
			if(cantCategoriasFemeninas < 1 || cantCategoriasFemeninas > 60) {
				System.out.println("Cantidad de categorias femeninas no válida.");
				System.exit(1);
			}
			
			int cantCategoriasMasculinas = scan.nextInt();
			if(cantCategoriasMasculinas < 1 || cantCategoriasMasculinas > 60) {
				System.out.println("Cantidad de categorias masculinas no válida.");
				System.exit(1);
			}
			
			int cantGanadores = scan.nextInt();
			if(cantGanadores < 0 || cantGanadores > cantCompetidores) {
				System.out.println("Cantidad de ganadores no válida.");
				System.exit(1);
			}
			
			
			categorias = new LinkedList<Categoria>();
			for(int i = 0 ; i < cantCategoriasFemeninas ; i++) {
				int edadMin = scan.nextInt();
				int edadMax = scan.nextInt();
				categorias.add(new Categoria(i+1,'F',edadMin,edadMax));
			}
			for(int i = 0 ; i < cantCategoriasMasculinas ; i++) {
				int edadMin = scan.nextInt();
				int edadMax = scan.nextInt();	
				categorias.add(new Categoria(i+1,'M',edadMin,edadMax));
			}
			
			corredores = new LinkedList<Corredor>();
			for(int i = 0 ; i < cantCompetidores ; i++) {
				int edad = scan.nextInt();
				char sexo = scan.next().charAt(0);
				corredores.add(new Corredor(edad, sexo, i+1, categorias));
			}
			
			resultados = new ArrayList<Integer>();
			for(int i = 0 ; i < cantGanadores ; i++) {
				resultados.add(scan.nextInt());
			}
			
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("Problema al abrir archivo de entrada...");
		}
	}
	
	public void entregarMedallas(String path) {
		FileWriter arch;
		try {
			arch = new FileWriter(path);
			BufferedWriter buffer = new BufferedWriter(arch);
			
			distribuirCorredoresPorCategoria();
			
			for(int i = 0 ; i < categorias.size() ; i++) {
				buffer.write(categorias.get(i).getNroCategoria() + " " + categorias.get(i).getCorredor(0).getNroCorredor() + " " + categorias.get(i).getCorredor(1).getNroCorredor() + " " +  categorias.get(i).getCorredor(2).getNroCorredor());
				buffer.newLine();
			}
			buffer.close();
		} catch (IOException e) {
			System.out.println("Problema al generar archivo de salida...");
		}
	}
	
	private void distribuirCorredoresPorCategoria() {
		for(int i = 0 ; i < resultados.size() ; i++) {
			Corredor corredor = corredores.get(resultados.get(i) - 1);
			categorias.get(corredor.getNroCategoria() - 1).añadirCorredor(corredor);
		}
	}
	
	private void mostrarCorredores() {
		for(int i = 0 ; i < this.corredores.size() ; i++) {
			System.out.println(this.corredores.get(i).getNroCategoria());
		}
		
	}
}
