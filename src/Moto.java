public class Moto extends Veiculo {
    boolean temBagageiro;

    //get e set
    public boolean isTemBagageiro() {
        return temBagageiro;
    }
    public void setTemBagageiro(boolean temBagageiro) {
        this.temBagageiro = temBagageiro;
    }

    @Override
    protected void acelerar() {
        System.out.println("Moto acelerando");
    }
    @Override
    protected void frear() {
        System.out.println("Moto freando");
    }
}
