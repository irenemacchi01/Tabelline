import java.util.Scanner;

public class TabellinaTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean continua = true;
        while (continua) {
            System.out.print("Inserisci un numero per visualizzare la sua tabellina (oppure inserisci 0 per uscire): ");
            int numero = input.nextInt();
            
            if (numero == 0) {
                continua = false;
            } else {
                Tabellina tabellina = new Tabellina(numero);
                tabellina.visualizzaTabellina();
            }
        }
        
        input.close();
        
        System.out.println("Grazie per aver utilizzato il programma!");
    }
}