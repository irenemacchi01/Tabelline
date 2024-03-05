class Tabellina {
    private int numero;

    public Tabellina(int numero) {
        this.numero = numero;
    }

    public void visualizzaTabellina() {
        System.out.println("Tabellina del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}