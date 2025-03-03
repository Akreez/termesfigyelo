/*
* File: Store.java
* Author: Kövesdi Ákos
* Copyright: 2025, Kövesdi Ákos
* Group: Szoft V
* Date: 2025-03-03
* Github: https://github.com/Akreez/
* Licenc: MIT
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    public ArrayList<Termes> readFile() {
        try {
            tryReadFile();
        } catch (Exception e) {
            System.err.println("Hiba! A fájl nem található!");
            System.err.println(e.getMessage());
            return null;
        }
    }
    
    private ArrayList<Termes> tryReadFile() throws FileNotFoundException{
        ArrayList<Termes> termesLista = new ArrayList<>();
        File file = new File("termes.txt");
        try(Scanner sc = new Scanner(file, "utf-8")){
            sc.nextLine();
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] arr = line.split(":"); 
                Termes termes = new Termes();
                termes.setId(Integer.parseInt(arr[0]));
                termes.setNev(arr[1]);
                termes.setDulo(arr[2]);
                termes.setMennyiseg(Integer.parseInt(arr[3]));
                termes.setVege(LocalDate.parse(arr[4]));
                termesLista.add(termes);

            }
        }
        return termesLista;
    }
}
