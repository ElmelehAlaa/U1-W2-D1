import expection.BancaException;

public class ContoCorrente {
    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;

    ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    double preleva(double x) throws BancaException {


          if(nMovimenti < maxMovimenti ){


            saldo = saldo - x - 0.50;}

         else{ saldo= saldo-x;}
         nMovimenti++;
         if(saldo-x<0){
            throw new BancaException("il Contro è in rosso");
        }
         return saldo;}

    public double restituisciSaldo() {
        return saldo;
    }




}
