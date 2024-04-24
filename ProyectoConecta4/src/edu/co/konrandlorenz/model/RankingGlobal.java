package edu.co.konrandlorenz.model;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RankingGlobal {
    private Map<String, Integer> puntajes;

    public RankingGlobal() {
        puntajes = new HashMap<>();
    }

    public void agregarPuntaje(String nombreJugador, int puntaje) {
        puntajes.put(nombreJugador, puntajes.getOrDefault(nombreJugador, 0) + puntaje);
    }

    public List<Map.Entry<String, Integer>> obtenerRankingOrdenado() {
        List<Map.Entry<String, Integer>> listaPuntajes = new LinkedList<>(puntajes.entrySet());
        listaPuntajes.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        return listaPuntajes;
    }

    public void mostrarRanking() {
        List<Map.Entry<String, Integer>> ranking = obtenerRankingOrdenado();
        System.out.println("Ranking Global:");
        int posicion = 1;
        for (Map.Entry<String, Integer> entrada : ranking) {
            System.out.println(posicion + ". " + entrada.getKey() + " - Puntaje: " + entrada.getValue());
            posicion++;
        }
    }
}

