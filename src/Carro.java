public class Carro extends Veiculo{
    int capacidadePortaMalas;

    //get e set
    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }
    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    @Override
    protected void acelerar(){
        System.out.println("Carro acelerando");
    }
    @Override
    protected void frear(){
        System.out.println("Carro freando");
    }
}
