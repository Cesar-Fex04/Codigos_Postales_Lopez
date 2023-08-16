package org.example;

class Casa {
    private int numeroExterior;
    private String nombreCalle;

    public Casa(int numeroExterior) {
        this.numeroExterior = numeroExterior;
        this.nombreCalle = "Zacatecas";
    }

    public int getNumeroExterior() {
        return numeroExterior;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }



    public static void main(String[] args) {
        Casa[] casas = new Casa[10];

        // Crear las casas con diferentes números exteriores
        for (int i = 0; i < casas.length; i++) {
            casas[i] = new Casa(i + 1);
        }

        int casasEnZacatecas = 0;

        // Contar las casas que pertenecen a la calle Zacatecas
        for (Casa casa : casas) {
            if (casa.getNombreCalle().equals("Zacatecas")) {
                casasEnZacatecas++;
            }
        }

        System.out.println("Total de casas en la calle Zacatecas: " + casasEnZacatecas);
    }
}
