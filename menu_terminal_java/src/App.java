import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        boolean status_loja = true;

        //entrada_menu
        Scanner entrada_menu_inicial = new Scanner(System.in);

        //entrada menu estoque estoque
        Scanner entrada_menu_estoque = new Scanner(System.in);

        while (status_loja == true) {
            //Novo objeto para utilirarios
            Utilitarios util = new Utilitarios();

            //Chama metodo para mostrar menu
            System.out.print(util.mostrar_menu_inicial());
            
            String entrada1 = entrada_menu_inicial.nextLine();

            switch (entrada1) {
                case "0":
                    status_loja = false;
                    break;
                case "1":
                    //Novo objeto da classe estoque
                    Estoque estoque = new Estoque();

                    estoque.menu_estoque();

                    


                    break;
                default:
                    break;
            }
        }

        entrada_menu_inicial.close(); 
   
    }
}
