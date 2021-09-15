public class Verkauf {
//Deklaration der Klassenvariablen 
    Auto _Auto;
    Kunde _Kunde;
    int _Preis;
    Verkaeufer _Verkaeufer;
//Constructer festlegen 
    public Verkauf(Auto Auto, Verkaeufer Verkaeufer, Kunde Kunde){
        this.set_Auto(Auto);
        this.set_Verkaeufer(Verkaeufer);    
        this.set_Kunde(Kunde); 
    }
    


//getter festlegen, strg + Lerrtaste und get eingeben
    public int get_Preis() {
        return _Preis;
    }
    public Auto get_Auto() {
        return _Auto;
    }
    public Kunde get_Kunde() {
        return _Kunde;
    }
    public Verkaeufer get_Verkaeufer() {
        return _Verkaeufer;
    }

//setter festlegen, strg + Leertaste und set eingeben 
    public void set_Auto(Auto _Auto) {
        this._Auto = _Auto;
    }
    public void set_Kunde(Kunde _Kunde) {
        this._Kunde = _Kunde;
    }
    public void set_Preis(int _Preis) {
        this._Preis = _Preis;
    }
    public void set_Verkaeufer(Verkaeufer _Verkaeufer) {
        this._Verkaeufer = _Verkaeufer;
    }

    
    
}
