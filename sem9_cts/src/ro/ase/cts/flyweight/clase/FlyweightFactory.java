package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	
private Map<String,Flyweight>clienti;

public FlyweightFactory() {
	this.clienti=new HashMap<>();
}
public Flyweight getClient(String nrTelefon) {
	Flyweight flyweight=clienti.get(nrTelefon);
	if(flyweight==null) {
		flyweight=new Client("Bianca",nrTelefon,"bia@gmail.com");
		clienti.put(nrTelefon, flyweight);
	}
	return flyweight;
}
}
