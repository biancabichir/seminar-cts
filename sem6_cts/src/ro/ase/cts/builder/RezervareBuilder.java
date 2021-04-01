package ro.ase.cts.builder;

public class RezervareBuilder implements AbstarctBuilder {
 private Rezervare rezervare;
 
 public RezervareBuilder() {
	 rezervare=new Rezervare(0,false,false,false,false,"rock");
 }
@Override
public Rezervare build() {
	// TODO Auto-generated method stub
	return rezervare;
}

public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa){
	this.rezervare.setAreMancareInclusa(areMancareInclusa);
	return this;
}
public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
	this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
	return this;
}

public RezervareBuilder setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
	this.rezervare.setAreBauturaRacoritoare(areBauturaRacoritoare);
	return this;
}

public RezervareBuilder setCodRezervare(int codRezervare) {
	this.rezervare.setCodRezervare(codRezervare);
	return this;
}
}
