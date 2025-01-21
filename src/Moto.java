public class Moto extends Veiculo {
    boolean temBagageiro;
    private static int contarMotos = 0;

    public Moto() {
        contarMotos++;
    }

    public boolean TemBagageiro() {
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
    static int getContarMotos() {
        return contarMotos;
    }
}
