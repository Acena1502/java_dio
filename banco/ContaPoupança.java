public class ContaPoupanca extends Conta {
    private double taxaRendimento;
    private int mesesRendimento;

    public void renderJuros(){
        double saldo = getSaldo();
        saldo = saldo * Math.pow(taxaRendimento, mesesRendimento);
        setSaldo(saldo);
        System.out.printf("Rendimento: %.2f%n", saldo);
        System.out.println("Meses: " + mesesRendimento);
        System.out.println("Taxa: " + taxaRendimento);
        System.out.println("----------------------------------------");
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void setMesesRendimento(int mesesRendimento) {
        this.mesesRendimento = mesesRendimento;
    }

    
}
