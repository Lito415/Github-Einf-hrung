public class Kunde {
    String _Vorname;
    String _Adresse;
    String _Nachname;
    String _Telefon;

    public Kunde(String Vorname, String Nachname){
        this.setVorname(Vorname);
        this.setNachname(Nachname);

    }


    public void setAdresse(String _Adresse) {
        this._Adresse = _Adresse;
    }
    public void setNachname(String _Nachname) {
        this._Nachname = _Nachname;
    }
    public void setTelefon(String _Telefon) {
        this._Telefon = _Telefon;
    }
    public void setVorname(String _Vorname) {   
        this._Vorname = _Vorname;
    }


    public String getAdresse() {
        return _Adresse;
    }
    public String getNachname() {
        return _Nachname;
    }
    public String getTelefon() {
        return _Telefon;
    }
    public String get_Vorname() {
        return _Vorname;
    }

    
}
