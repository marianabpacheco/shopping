public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;


    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }



    public boolean estaVencido(Data data){

        if(this.dataValidade.getAno() < data.getAno()){
            return true;
        }else if(this.dataValidade.getAno() >= data.getAno() && this.dataValidade.getMes() < data.getMes()){
            return true;
        }
        else if(this.dataValidade.getAno() >= data.getAno() && this.dataValidade.getMes() >= data.getMes() && this.dataValidade.getDia() < data.getDia()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Nome do produto:" + nome +
                "\nPreço: R$ " + preco +
                "\n Data de validade: " + dataValidade.toString();
    }
}
