public class Caixa implements contratoCrud{

    @Override
    public void mostra_menu2() {
        System.out.print("+######  STORE CASE - CARUARU  ###### +\n" +
        "+              MENU - CAIXA           +\n" +
        "+                                     +\n" +
        "+       [1] - ABRIR CAIXA             +\n" +
        "+       [2] - NOVA VENDA              +\n" +
        "+       [3] - ULTIMAS VENDAS          +\n" +
        "+       [4] - FECHAR CAIXA            +\n" + 
        "+       [0] - VOLTAR                  +\n" +
        "+-------------------------------------+\n" +
        "->  ");
    }

    public void cadastra() {
        System.out.print("Metodo cadastra nova venda");
        
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void atualiza() {
        System.out.print("Metodo relatorio vendas venda");
        
    }

    public void  abre_caixa() {

    }

    public void fecha_caixa() {

    }

    public void volta() {
        
    }
    
}
