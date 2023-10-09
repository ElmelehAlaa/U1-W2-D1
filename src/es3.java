import com.sun.source.util.SourcePositions;

import java.util.Scanner;

public class es3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci il numero di chilometri percorsi");
        int chilometri = input.nextInt();

        System.out.println("inserisci i litri di carubarante consumati:");
        int litri = input.nextInt();
        try {
         int kmSuLitro = chilometri/litri;
         System.out.println(kmSuLitro + "è il consumo km/l");}
        catch (ArithmeticException ex){
            System.err.println("Errore la divisione non puo essere per zero ");
        }



    }

}
