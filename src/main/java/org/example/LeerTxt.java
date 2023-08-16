package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class LeerTxt {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Julio\\Downloads\\codigos_postales_hmo.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);


        String line = null;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 2133 ; i++) {
            while ((line = br.readLine()) != null) {
                if (map.containsKey(line)) {
                    map.put(line, map.get(line) + i++);
                } else {
                    map.put(line, 1);
                }
            }
        }



        br.close();

        // Filtra los números de las casas que pertenecen a la calle Puebla
        for (String number : map.keySet()) {
            if (map.get(number) > 1) {
                System.out.println(number + " se repite " + map.get(number) + " veces.");
            }
        }
    }
}

