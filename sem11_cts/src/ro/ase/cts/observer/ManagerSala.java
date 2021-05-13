package ro.ase.cts.observer;

import java.util.List;

public class ManagerSala extends ManagerSalaAbstract{

	public void anuntaMeci(String tipMeci) {
		super.trimiteNotificare("Incepe meciul de "+tipMeci);
	}
}
