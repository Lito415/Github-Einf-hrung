public class Verkaeufer {
    String _Vorname;
    String _Nachname;
    String _Personalnummer;

    public Verkaeufer(String Vorname, String Nachname){
        this.setVorname(Vorname);
        this.setNachname(Nachname);

    }

    public void setNachname(String _Nachname) {
        this._Nachname = _Nachname;
    }
    public void setVorname(String _Vorname) {
        this._Vorname = _Vorname;
    }
    public void setPersonalnummer(String _Personalnummer) {
        this._Personalnummer = _Personalnummer;
    }


    public String getNachname() {
        return _Nachname;
    }
    public String getVorname() {
        return _Vorname;
    }
    public String getPersonalnummer() {
        return _Personalnummer;
    }

    
}
