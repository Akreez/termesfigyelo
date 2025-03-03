/*
* File: Solution.java
* Author: Kövesdi Ákos
* Copyright: 2025, Kövesdi Ákos
* Group: Szoft V
* Date: 2025-03-03
* Github: https://github.com/Akreez/
* Licenc: MIT
*/

import java.util.ArrayList;

public class Solution {
    Store store = new Store();
    ArrayList<Termes> termesLista = store.readFile();

    public void kiirBuza(){
        int szamlalo = 0;
        for(Termes termes : termesLista){
            if (termes.getNev().equals("búza")) {
                szamlalo = szamlalo + 1;
            }
            System.out.printf("Hányszor szerepel a búza: %d\n",termes.getNev());
        }
    }

    public void kiirBuzaMennyiseg(){
        int osszeg = 0;
        for(Termes termes : termesLista){
            if (termes.getNev().equals("búza")) {
                osszeg = osszeg + termes.getMennyiseg();
            }
            System.out.printf("Hány q búza: %d\n",termes.getNev());
        }
    }
}
