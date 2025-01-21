public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    protected void exibirDetalhes(){

        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);

    }

    protected abstract void acelerar();
    protected abstract void frear();

    //getters e setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}
