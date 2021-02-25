package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private List<Animal> lista;
	private Zookeeper keeper;
	
	public Zoo(List<Animal> lista, Zookeeper keeper1) {
		super();
		this.lista = lista;
		this.keeper = keeper;
	}
	

	public Zoo() {
		super();
		lista=new ArrayList<Animal>();
		keeper=new Zookeeper();
	}
	public void add(Animal animal)
	{
		lista.add(animal);
	}
	public void feedAll()
	{
		for(Animal animal : lista)
		{
			 keeper.feed(animal);
		}
	}

	public List<Animal> getLista() {
		return lista;
	}

	public void setLista(List<Animal> lista) {
		this.lista = lista;
	}

	public Zookeeper getKeeper1() {
		return keeper;
	}

	public void setKeeper1(Zookeeper keeper) {
		this.keeper = keeper;
	}

}
