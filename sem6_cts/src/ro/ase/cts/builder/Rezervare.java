package ro.ase.cts.builder;

public class Rezervare {
	private int codRezervare;
	private boolean areBauturaRacoritoare;
	private boolean areScaunErgonomic;
	private boolean areMancareInclusa;
	private boolean areMuzicaAmbientalaPersonalizata;
	private String genMuzica;
	
	public Rezervare(int codRezervare, boolean areBauturaRacoritoare, boolean areScaunErgonomic,
			boolean areMancareInclusa, boolean areMuzicaAmbientalaPersonalizata, String genMuzica) {
		super();
		this.codRezervare = codRezervare;
		this.areBauturaRacoritoare = areBauturaRacoritoare;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areMancareInclusa = areMancareInclusa;
		this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
		this.genMuzica = genMuzica;
	}

	public int getCodRezervare() {
		return codRezervare;
	}

	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}

	public boolean isAreBauturaRacoritoare() {
		return areBauturaRacoritoare;
	}

	public void setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
		this.areBauturaRacoritoare = areBauturaRacoritoare;
	}

	public boolean isAreScaunErgonomic() {
		return areScaunErgonomic;
	}

	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}

	public boolean isAreMancareInclusa() {
		return areMancareInclusa;
	}

	public void setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
	}

	public boolean isAreMuzicaAmbientalaPersonalizata() {
		return areMuzicaAmbientalaPersonalizata;
	}

	public void setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
		this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
	}

	public String getGenMuzica() {
		return genMuzica;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [codRezervare=");
		builder.append(codRezervare);
		builder.append(", areBauturaRacoritoare=");
		builder.append(areBauturaRacoritoare);
		builder.append(", areScaunErgonomic=");
		builder.append(areScaunErgonomic);
		builder.append(", areMancareInclusa=");
		builder.append(areMancareInclusa);
		builder.append(", areMuzicaAmbientalaPersonalizata=");
		builder.append(areMuzicaAmbientalaPersonalizata);
		builder.append(", genMuzica=");
		builder.append(genMuzica);
		builder.append("]");
		return builder.toString();
	}
	

}
