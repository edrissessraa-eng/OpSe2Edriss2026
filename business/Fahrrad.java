package business;

public class Fahrrad {
	
    private String name;
    private String rahmennummer;
    private String fahrradtyp;
    private char damenHerrenKinder;
    private String[] groessen;
    
    public Fahrrad(String name, String rahmennummer, String fahrradtyp,
       	char damenHerrenKinder, String[] groessen){
    	this.name = name;
      	this.rahmennummer = rahmennummer;
       	this.fahrradtyp = fahrradtyp;
       	this.damenHerrenKinder = damenHerrenKinder;
       	this.groessen = groessen;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRahmennummer() {
		return rahmennummer;
	}

	public void setRahmennummer(String rahmennummer) {
		this.rahmennummer = rahmennummer;
	}

	public String getFahrradtyp() {
		return fahrradtyp;
	}

	public void setFahrradtyp(String fahrradtyp) {
		this.fahrradtyp = fahrradtyp;
	}

	public char getDamenHerrenKinder() {
		return damenHerrenKinder;
	}

	public void setDamenHerrenKinder(char damenHerrenKinder) {
		this.damenHerrenKinder = damenHerrenKinder;
	}

	public String[] getGroessen() {
		return groessen;
	}

	public void setGroessen(String[] groessen) {
		this.groessen = groessen;
	}
	
 	public String getGroessenAlsString(char trenner) {
		String ergebnis = "";
		int i = 0;
		for(i = 0; i < this.getGroessen().length - 1; i++) {
			ergebnis = ergebnis + this.getGroessen()[i] + trenner; 
		}
		return ergebnis	+ this.getGroessen()[i];
	}
	
	public String gibFahrradZurueck(char trenner){
  		return this.getName() + trenner 
  			+ this.getRahmennummer() + trenner
  			+ this.getFahrradtyp() + trenner
  		    + this.getDamenHerrenKinder() + trenner + "\n"
  		    + this.getGroessenAlsString(trenner) + "\n";
  	}
}

