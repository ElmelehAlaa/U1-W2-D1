import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random =  new Random();
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0; i<array.length; i++){
            array[i] = random.nextInt(10)+1;
        }
        while(true){
            System.out.print("Array: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.print("inserisci un numero (0 per uscire): ");
            int numeroInserito = input.nextInt();
            if (numeroInserito == 0) {
                break;
            }
            System.out.print("inserisci una posizione (da 1 a 5): ");
            int posizioneInserita = input.nextInt();
            if (posizioneInserita < 1 || posizioneInserita > 5) {
                System.err.println("posizione non esistente. Deve essere compresa tra 1 e 5.");
                continue;}
        array[posizioneInserita - 1] = numeroInserito;
        }
        System.out.println("esecuzione chiusa");
    }
}