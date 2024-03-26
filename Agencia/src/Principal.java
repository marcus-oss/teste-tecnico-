import Cadastro.CadastroUnidade;

public class Principal {
    public static void main(String[] args) {

        /*
         * nessa classe está todas as unidades cadastrada como pedido no teste
         */


        CadastroUnidade cadastroUnidade = new CadastroUnidade("9971408", "Unidade Central", 100001);
        CadastroUnidade cadastroUnidade2 = new CadastroUnidade("2543354", "Unidade Bairro Agostini", 2000001);
        CadastroUnidade cadastroUnidade3 = new CadastroUnidade("9254501", "Unidade Bairro Jardim peperi", 300001);


        System.out.println(" numero do cnes: " + cadastroUnidade.getCnes());
        System.out.println("faixa de cep: " + cadastroUnidade.getFaixadeCep());
        System.out.println("Nome do estabelecimento: " + cadastroUnidade.getNomedoEstabelecimento());

        System.out.println("----");

        System.out.println(" numero do cnes: " + cadastroUnidade2.getCnes());
        System.out.println("faixa de cep: " + cadastroUnidade2.getFaixadeCep());
        System.out.println("Nome do estabelecimento: " + cadastroUnidade2.getNomedoEstabelecimento());

        System.out.println("------");

        System.out.println(" numero do cnes: " + cadastroUnidade3.getCnes());
        System.out.println("faixa de cep: " + cadastroUnidade3.getFaixadeCep());
        System.out.println("Nome do estabelecimento: " + cadastroUnidade3.getNomedoEstabelecimento());


    }
}