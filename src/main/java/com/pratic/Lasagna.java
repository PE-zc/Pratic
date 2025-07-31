package com.pratic;

public class Lasagna {
    // Metodo para definir o tempo de cozimento
    public int expectedMinutesInOven() {
        int minutes = 40;
        return minutes;
    }
    // Metodo para retornar quanto tempo a lasanha esta no forno
    public int remainingMinutesInOven(int minutes) {
        int minutesRemain = 10;
        return minutes - minutesRemain;
    }

    // Neste metodo ele pede pra retornar quantos minutos para preparar cada camada
    public int preparationTimeInMinutes(int layers) {
        int prepare = 2;
        return layers * prepare;
    }

    /* Neste metodo ele quer saber qual foi o tempo total da lasanha
       Entao resgata o parametro minutes e o parametro layers x2
     */

    public int totalTimeInMinutes(int layers, int minutes) {
        return layers * 2 + minutes;
    }
}