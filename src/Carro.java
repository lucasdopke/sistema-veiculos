public class Carro extends Veiculo{
    private int capacidadePortaMalas;

    public Carro(String marca , String modelo , int ano , int capacidadePortaMalas ){
        super.setMarca(marca);
        super.setModelo(modelo);
        super.setAno(ano);
        this.setCapacidadePortaMalas(capacidadePortaMalas);
    }
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
    static void teste(){
        System.out.println("teste");

    }

}
