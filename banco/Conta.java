public class Conta {
    private int agencia;
    private int conta;
    private double saldo;

    public void depositar (double valor){
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }
        System.out.printf("Depósito de R$%.2f realizado com sucesso.%n", valor);
        this.saldo+=valor;
        mostrarSaldo();
    }

    public void sacar (double valor){
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }
        if(this.saldo>=valor){
            System.out.printf("Saque de R$%.2f realizado com sucesso.%n", valor);
            this.saldo-=valor;
            mostrarSaldo();
        }
        else{
            System.out.println("Saldo Insuficente!");
            mostrarSaldo();
        }
    }

    public void mostrarSaldo(){
        System.out.printf("Saldo atual: R$%.2f%n", saldo);
        System.out.println("--------------------------------------------------------");
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}
