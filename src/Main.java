public static void main(String[] args) {

            Carro voyage = new Carro("volkswagen" , "Sedan" , 2015 , 200);
            new CarroDAO().cadastrarCarro(voyage);

            Moto mt = new Moto("yamaha" , "naked" , 2020 , false);
            Moto cg = new Moto("honda" , "cargo" , 2011 , true);
            new MotoDAO().cadastrarMoto(mt);
            new MotoDAO().cadastrarMoto(cg);

            System.out.println("Detalhes do Carro");
            voyage.exibirDetalhes();
            voyage.acelerar();
            voyage.frear();

            System.out.println("Detalhes do Moto");
            mt.exibirDetalhes();
            mt.acelerar();
            mt.frear();

            System.out.println("Total de Carros: " + Carro.getContarCarros());
            System.out.println("Total de Motos: " + Moto.getContarMotos());

}