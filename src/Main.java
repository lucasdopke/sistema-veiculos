//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Carro voyage = new Carro();
            voyage.setModelo("Sedan");
            voyage.setAno(2015);
            voyage.setMarca("volkswagen");
            voyage.setCapacidadePortaMalas(200);

            Moto mt = new Moto();
            mt.setModelo("naked");
            mt.setAno(2020);
            mt.setMarca("yamaha");
            mt.setTemBagageiro(false);

            System.out.println("Detalhes do Carro");
            voyage.exibirDetalhes();
            voyage.acelerar();
            voyage.frear();


            System.out.println("Detalhes do Moto");
            mt.exibirDetalhes();
            mt.acelerar();
            mt.frear();
    }
}