package zoo.modele;

public class Pays {
	protected String code, nomPays;

	public Pays(String code, String nomPays) {
		this.code = code;
		this.nomPays = nomPays;
	}

	public String getCode() { return code; }

	public void setCode(String code) { this.code = code; }

	public String getNomPays() { return nomPays; }

	public void setNomPays(String nomPays) { this.nomPays = nomPays; }
}
