package org.example;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) throws IOException {
        //Ordenar los numeros del cosigo postal, losprimegors 5 digitos
        ArrayList<String>ocp= new ArrayList<>();

        File file = new File("C:\\Users\\Julio\\Downloads\\codigos_postales_hmo.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

       // String qtl =

        String line = null;
        HashSet<String> set = new HashSet<>();
        while ((line = br.readLine()) != null) {
            if (!set.contains(line)) {
                set.add(line);
            } else {
                System.out.println(line + " se repite " + set.size() + " veces.");
                set.remove(line);
            }
        }

        br.close();
    }
}