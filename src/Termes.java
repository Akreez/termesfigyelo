/*
* File: Termes.java
* Author: Kövesdi Ákos
* Copyright: 2025, Kövesdi Ákos
* Group: Szoft V
* Date: 2025-03-03
* Github: https://github.com/Akreez/
* Licenc: MIT
*/

import java.time.LocalDate;

public class Termes {
    private int id;
    private String nev;
    private String dulo;
    private int mennyiseg;
    private LocalDate vege;

    

    public Termes() {
    }

    public Termes(int id, String nev, String dulo, int mennyiseg, LocalDate vege) {
        this.id = id;
        this.nev = nev;
        this.dulo = dulo;
        this.mennyiseg = mennyiseg;
        this.vege = vege;
    }

    public Termes(String nev, String dulo, int mennyiseg, LocalDate vege) {
        this.nev = nev;
        this.dulo = dulo;
        this.mennyiseg = mennyiseg;
        this.vege = vege;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNev() {
        return nev;
    }
    public void setNev(String nev) {
        this.nev = nev;
    }
    public String getDulo() {
        return dulo;
    }
    public void setDulo(String dulo) {
        this.dulo = dulo;
    }
    public int getMennyiseg() {
        return mennyiseg;
    }
    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }
    public LocalDate getVege() {
        return vege;
    }
    public void setVege(LocalDate vege) {
        this.vege = vege;
    }

    
}
