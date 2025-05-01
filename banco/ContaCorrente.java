public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public void usarChequeEspecial(){
        System.out.printf("Seu limite do cheque especial é: R$ %.2f.%n", limiteChequeEspecial);
        System.out.println("Você está usando o cheque especial.");
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    
}
