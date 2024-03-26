package Cadastro;

/*
 * classe que representa o cadastro das unidades.
 * */
public class CadastroUnidade {
    String cnes;
    String nomedoEstabelecimento;
    int faixadeCep;

    public CadastroUnidade(String cnes, String nomedoEstabelecimento, int faixadeCep) {
        this.cnes = cnes;
        this.nomedoEstabelecimento = nomedoEstabelecimento;
        this.faixadeCep = faixadeCep;
    }


    /*
    metodos get and setter
    coloquei os set como private para o usuario não poder mudar o nome , e colocar um nome aleatorio que não existe
     */
    private void setCnes(String cnes) {
        this.cnes = cnes;
    }

    private void setNomedoEstabelecimento(String nomedoEstabelecimento) {
        this.nomedoEstabelecimento = nomedoEstabelecimento;
    }

    private void setFaixadeCep(int faixadeCep) {
        this.faixadeCep = faixadeCep;
    }


    public String getNomedoEstabelecimento() {
        return nomedoEstabelecimento;
    }


    public String getCnes() {
        return cnes;
    }


    public int getFaixadeCep() {
        return faixadeCep;
    }


    /*
    metodo to String , para o resultado sair formatado no terminal.
     */
    @Override
    public String toString() {
        return "cadastroUnidade{" +
                "cnes = " + cnes +
                ", nomedoEstabelecimento = '" + nomedoEstabelecimento +
                ", faixadeCep = " + faixadeCep +
                '}';
    }

}
