package ro.ase.cts.builderv2;

public class RezervareBuilder implements AbstarctBuilder {
	private int codRezervare;
	private boolean areBauturaRacoritoare;
	private boolean areScaunErgonomic;
	private boolean areMancareInclusa;
	private boolean areMuzicaAmbientalaPersonalizata;
	private String genMuzica;
	
	public RezervareBuilder setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}
	public RezervareBuilder setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
		this.areBauturaRacoritoare = areBauturaRacoritoare;
		return this;
	}
	public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}
	public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}
	public RezervareBuilder setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
		this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
		return this;
	}
	public RezervareBuilder setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}
	@Override
	public Rezervare build() {
		Rezervare rezervare=new Rezervare(codRezervare, areBauturaRacoritoare, areScaunErgonomic, areMancareInclusa, areMuzicaAmbientalaPersonalizata, genMuzica);
		return rezervare;
	}
	
	
}
