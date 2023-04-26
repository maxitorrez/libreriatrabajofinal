package libreria;

public class Libreria{
	private String nombre;
	ItemLibreria[] lista = new ItemLibreria[10];

	public Libreria() {
		this.nombre = "Libreria Libertador";
	}
	
	//metodos
	public boolean agregarALibreria(ItemLibreria nuevo) {
		boolean seAgrego = false;
		for(int i =0; i < this.lista.length-1;i++) {
			if(this.lista[i] == null) {
				this.lista[i] = nuevo;
				seAgrego = true;
				break;
			}
		}
		return seAgrego;
		
	}

	public ItemLibreria[] getLista() {
		return lista;
	}

	public void setLista(ItemLibreria[] lista) {
		this.lista = lista;
	}
	
	
}
