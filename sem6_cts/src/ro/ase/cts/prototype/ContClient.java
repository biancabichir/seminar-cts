package ro.ase.cts.prototype;

public class ContClient implements AbstractPrototype {
	private String nume;
	private int varsta;
	
	public ContClient(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		//realizam validari costisitoare
	}
	private ContClient()
	{
		//aici nu vom face validari
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContClient [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public AbstractPrototype copiaza() {
		ContClient client=new ContClient();
		client.nume=this.nume;
		client.varsta=this.varsta;
		return client;
	}
	
	

}
