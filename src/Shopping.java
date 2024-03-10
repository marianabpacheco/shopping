import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco,int qtdMaxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[qtdMaxLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja l){
        for(int i = 0; i<lojas.length; i++){
            if(lojas[i] == null){
                lojas[i] = l;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja){
        for(int i = 0; i<lojas.length; i++){
            if(lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)){
                lojas[i] = null;
                return true;
            }

        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipo){
        var contador = 0;
        for (int i = 0; i<lojas.length; i++) {

            switch (tipo) {
                case "Cosmético" -> {
                    if (lojas[i] instanceof Cosmetico)
                        contador++;
                }
                case "Vestuário" -> {
                    if (lojas[i] instanceof Vestuario)
                        contador++;
                }
                case "Bijuteria" -> {
                    if (lojas[i] instanceof Bijuteria)
                        contador++;
                }
                case "Alimentação" -> {
                    if (lojas[i] instanceof Alimentacao)
                        contador++;
                }
                case "Informática" -> {
                    if (lojas[i] instanceof Informatica)
                        contador++;
                }
                default -> {
                    return -1;
                }
            }
        }
        return contador;
    }

    public Informatica lojaSeguroMaisCaro(){
        Informatica lojaMaisCara = null;
        double maiorValorSeguro = 0;
        for(int i = 1; i<lojas.length; i++) {
            if (lojas[i] instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) lojas[i];
                if (lojaInformatica.getSeguroEletronicos() > maiorValorSeguro) {
                    maiorValorSeguro = lojaInformatica.getSeguroEletronicos();
                    lojaMaisCara = lojaInformatica;
                }
            }

        }
        return lojaMaisCara;
    }

    @Override
    public String toString() {
        return "Nome do shopping" + nome +
                "\n Endereço: " + endereco +
                "\n Lojas: " + Arrays.toString(lojas);

    }
}
