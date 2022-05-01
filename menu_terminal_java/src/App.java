import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        boolean status_loja = true;
        String entrada1;

        //entrada_menu
        Scanner entrada_menu_inicial = new Scanner(System.in);
        while (status_loja == true) {
            //Novo objeto para utilirarios
            Utilitarios util = new Utilitarios();

            //Chama metodo para mostrar menu
            System.out.print(util.mostrar_menu_inicial());
            
            entrada1 = entrada_menu_inicial.nextLine();

            switch (entrada1) {
                case "0":
                    status_loja = false;
                    break;
                case "1":
                    //Novo objeto da classe estoque
                    contratoCrud estoque = new Estoque();

                    estoque.mostra_menu2();
    
                    break;

                case "2":

                    //Novo objeto da classe caixa
                    contratoCrud caixa = new Caixa();

                    caixa.mostra_menu2();

                    break;

                case "3":
                    
                    //Novo obejto da classe funcionario
                    contratoCrud rh = new Rh();

                    rh.mostra_menu2();

                    break;
                
                case "4":

                    //Novo obejto da classe administração
                    contratoCrud adm = new Adm();

                    adm.mostra_menu2();

                    break;

                default:
                    System.out.println("Caso default");
                    break;
            }
        }

        entrada_menu_inicial.close(); 
   
    }
}
