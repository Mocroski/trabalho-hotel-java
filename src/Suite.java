public class Suite {
    private int numero;
    private String tipo;
    private int capacidade;
    private double valorDiaria;

    public Suite(int numero, String tipo, int capacidade, double diaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.valorDiaria = diaria;
    }

    public Suite() {
    }
    public void exibir(){
        System.out.println("Numero: "+getNumero()+ "\nTipo: "+getTipo()+"\nCapacidade: "+getCapacidade()+ "\nValor Diaria: "+getValorDiaria());
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    
    
    
}
