package org.juankessoglou.ecoparametrosdul.Model;

import java.util.HashMap;
import java.util.Map;

public class Colecciones {

    private static Map<String, String> generoHashMap = new HashMap<>();
    private static Map<String, String> aficionesHashMap = new HashMap<>();
    private static Map<String, String> paisesHashMap = new HashMap<>();
    private static Map<String, String> musicaHashMap = new HashMap<>();
    static {
        generoHashMap.put("F", "Feminino");
        generoHashMap.put("M", "Masculino");
        generoHashMap.put("O", "Otro");

        aficionesHashMap.put("D", "Deporte");
        aficionesHashMap.put("L", "Lectura");
        aficionesHashMap.put("P", "Pintura");
        aficionesHashMap.put("V", "Viajes");

        paisesHashMap.put("A", "Andorra");
        paisesHashMap.put("E", "España");
        paisesHashMap.put("F", "Francia");
        paisesHashMap.put("P", "Portugal");

        musicaHashMap.put("E", "Electrónica");
        musicaHashMap.put("F", "Funky");
        musicaHashMap.put("N", "New Age");
        musicaHashMap.put("P", "Pop");
        musicaHashMap.put("R", "Rock");
    }

    public static Map<String, String> getGeneroHashMap() {
        return generoHashMap;
    }

    public static Map<String, String> getAficionesHashMap() {
        return aficionesHashMap;
    }

    public static Map<String, String> getPaisesHashMap() {
        return paisesHashMap;
    }

    public static Map<String, String> getMusicaHashMap() {
        return musicaHashMap;
    }
}
