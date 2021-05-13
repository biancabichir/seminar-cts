package ro.ase.cts.template;

public abstract class SpectatorAbstract {
 public abstract void asezareCoada();
 public abstract void prezintaBilet();
 public abstract void realizareControlCorporal();
 public abstract void intrarePeStadion();
 public abstract void ocupaLoc();
 
 public void intrareSpectatorStadion() {
	asezareCoada();
	prezintaBilet();
	realizareControlCorporal();
	intrarePeStadion();
	ocupaLoc();
 }
}
