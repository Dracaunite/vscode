package ski.modele;


public class Station {
	protected int noStation;
	protected String nomStation;
	protected String pays;
	protected int altitude;
	
	public Station(int pNoStat, String pNomStat, String pPays, int pAlt){
		setNoStation(pNoStat);
		setNomStation(pNomStat);
		setPays(pPays);
		setAltitude(pAlt);
	}

	/**
	 * @return Renvoie noStation.
	 */
	public int getNoStation() {
		return noStation;
	}

	/**
	 * @param noStation noStation : Numéro de la station
	 */
	public void setNoStation(int noStation) {
		this.noStation = noStation;
	}

	/**
	 * @return Renvoie nomStation.
	 */
	public String getNomStation() {
		return nomStation;
	}

	/**
	 * @param nomStation nomStation 
	 */
	public void setNomStation(String nomStation) {
		this.nomStation = nomStation;
	}

	/**
	 * @return Renvoie pays.
	 */
	public String getPays() {
		return pays;
	}

	/**
	 * @param pays pays de la station
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}

	/**
	 * @return Renvoie altitude.
	 */
	public int getAltitude() {
		return altitude;
	}

	/**
	 * @param altitude altitude de la station
	 */
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
}
