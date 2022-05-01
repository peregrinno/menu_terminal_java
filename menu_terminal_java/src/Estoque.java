public class Estoque implements contratoCrud{
    
    public void mostra_menu2(){
        System.out.print("+######  STORE CASE - CARUARU  ###### +\n" +
        "+              MENU - ESTOQUE         +\n" +
        "+                                     +\n" +
        "+       [1] - MOSTRA ESTOQUE ATUAL    +\n" +
        "+       [2] - CADASTRAR PRODUTO       +\n" +
        "+       [3] - REMOVER PRODUTO         +\n" +
        "+       [4] - ATUALIZAR PRODUTO       +\n" +
        "+       [0] - SAIR                    +\n" +
        "+-------------------------------------+\n" +
        "->  ");
    }

    String estoque_atual(){
        String estoque_atual;

        estoque_atual = "Estoque atual";

        return estoque_atual;
    }

    public void cadastra(){
       System.out.print("Metodo cadastra produto");
    }

    public void remove(){
        System.out.print("Metodo removendo produtod");
    }

    public void atualiza(){
        System.out.print("Metodo atualçza produto");
    }

}
