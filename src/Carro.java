public class Carro extends Veiculo{
    private int capacidadePortaMalas;
    private static int contarCarros = 0;

    public Carro(String marca , String modelo , int ano , int capacidadePortaMalas ){
        super.setMarca(marca);
        super.setModelo(modelo);
        super.setAno(ano);
        this.setCapacidadePortaMalas(capacidadePortaMalas);
        contarCarros++;
    }

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
    static int getContarCarros(){
    return contarCarros;
    }

}
