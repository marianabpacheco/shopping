import java.util.Arrays;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private int salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int qtdMaximaProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.salarioBaseFuncionario = -1;
        this.estoqueProdutos = new Produto[qtdMaximaProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int qtdMaximaProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[qtdMaximaProdutos];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }
    public void setSalarioBaseFuncionario(int salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public double gastosComSalario(){
        if(this.salarioBaseFuncionario == -1) {
            return -1;
        }
        return this.salarioBaseFuncionario * this.quantidadeFuncionarios;
    }

    public char tamanhoDaLoja(){
        if(this.quantidadeFuncionarios < 10){
            return 'P';
        }
        else if(this.quantidadeFuncionarios <= 30) {
            return 'M';
        }
        return 'G';
    }

    public void imprimeProdutos(){
        for(int i = 0; i<estoqueProdutos.length; i++){
            System.out.println("Produtos: " + Arrays.toString(estoqueProdutos));
        }
    }

    public boolean insereProduto( Produto p){
        for(int i = 0; i<estoqueProdutos.length; i++){
            if(estoqueProdutos[i] == null){
                estoqueProdutos[i] = p;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto){
        for(int i = 0; i<estoqueProdutos.length; i++){
            if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)){
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Nome da loja: " + nome + "\n" +
                "Quantidade de funcionários: " + quantidadeFuncionarios + "\n" +
                "Salário base dos funcionários: " + salarioBaseFuncionario + "\n" +
                "Endereço: " + endereco.toString() + "\n" +
                "Data de fundação: " + dataFundacao.toString()+
                "Estoque de produtos: " + Arrays.toString(estoqueProdutos);
    }
}
