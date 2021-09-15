public class Auto {
    String _Marke;
    String _Modell;
    String _Baujahr;
    int _Preis; 

    public Auto(String Marke, String Model){
        this.setMarke(Marke);
        this.setModel(Model);
        //this.setBaujahr(Baujahr);
    }

    public void setBaujahr(String _Baujahr) {
        this._Baujahr = _Baujahr;
    }
    public void setMarke(String _Marke) {
        this._Marke = _Marke;
    }
    public void setModel(String _Modell) {
        this._Modell = _Modell;
    }
    public void set_Preis(int _Preis) {
        this._Preis = _Preis;
    }

    public String getBaujahr() {
        return _Baujahr;
    }
    public String getMarke() {
        return _Marke;
    }
    public String getModell() {
        return _Modell;
    }
    public int get_Preis() {
        return _Preis;
    }


    
}
