import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);



        int opcao = 0;

        while(opcao != 3) {
            System.out.println("""
                    (1) Criar um loja
                    (2) Criar um produto
                    (3) Sair""");
            opcao = sc.nextInt();
            if(opcao == 1){
                System.out.println("Digite o nome da loja: ");
                String nome = sc.next();

                System.out.println("Digite a quantidade de funcionários: ");
                int quantidadeFuncionarios = sc.nextInt();

                System.out.println("Digite o valor do salário base dos funcionários: R$ ");
                int salarioBase = sc.nextInt();

                System.out.println("Digite o nome da rua do endereço da loja: ");
                String nomeDaRua = sc.next();

                System.out.println("Digite o nome da cidade do endereço da loja: ");
                String cidade = sc.next();

                System.out.println("Digite o estado do endereço da loja: ");
                String estado = sc.next();

                System.out.println("Digite o país do endereço da loja: ");
                String pais = sc.next();

                System.out.println("Digite o CEP do endereço da loja: ");
                String cep = sc.next();

                System.out.println("Digite o número do endereço da loja: ");
                String numero = sc.next();

                System.out.println("Digite o complemento do endereço da loja: ");
                String complemento = sc.next();

                Endereco endereco = new Endereco(nomeDaRua,cidade,estado,pais,cep,numero,complemento);

                System.out.println("Digite o dia em que foi criada a loja: ");
                int dia = sc.nextInt();

                System.out.println("Digite o mês em que foi criada a loja: ");
                int mes = sc.nextInt();

                System.out.println("Digite o ano em que foi criada a loja: ");
                int ano = sc.nextInt();

                System.out.println("Digite a quantidade máxima de produtos em estoque: ");
                int qtdMaximaProdutos = sc.nextInt();

                Data data = new Data(dia,mes,ano);

                Loja loja = new Loja(nome,quantidadeFuncionarios,salarioBase,endereco,data,qtdMaximaProdutos);
                System.out.println(loja);
            }
            else if(opcao == 2){
                System.out.println("Digite o nome do produto: ");
                String nome = sc.next();

                System.out.println("Digite o preço do produto: R$ ");
                double preco = sc.nextDouble();

                System.out.println("Digite o dia da data de validade do produto: ");
                int dia = sc.nextInt();

                System.out.println("Digite o mês da data de validade do produto: ");
                int mes = sc.nextInt();

                System.out.println("Digite o ano da data de validade do produto: ");
                int ano = sc.nextInt();

                Data dataValidade = new Data(dia,mes,ano);
                Produto produto = new Produto(nome,preco,dataValidade);
                Data dataRecebida = new Data(20,10,2023);

                if(produto.estaVencido(dataRecebida)){
                    System.out.println("PRODUTO VENCIDO");
                }
                else {
                    System.out.println("PRODUTO NÃO VENCIDO");
                }


            }
            else if(opcao == 3){
                break;
            }
            else {
                System.out.println("Opção inválida");
            }
        }


    }
}
