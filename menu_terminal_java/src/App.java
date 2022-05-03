import java.util.*;
// Zé Felipe aqui
public class App {
    public static void main(String[] args) throws Exception {
        boolean status_loja = true;
        String entrada1;
        
        boolean status_adm = true;
        Scanner menu_adm = new Scanner(System.in);
        String entrada2;

        //entrada_menu
        Scanner entrada_menu_inicial = new Scanner(System.in);
        while (status_loja == true) {
            //Novo objeto para utilitarios
            Utilitarios util = new Utilitarios();

            //Chama metodo para mostrar menu
            System.out.print(util.mostrar_menu_inicial());
            
            entrada1 = entrada_menu_inicial.nextLine();

            switch (entrada1) {
                case "0":
                    System.out.println("Saindo, obrigado por usar nosso sistema!");
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
                    while(status_adm == true){
                        contratoCrud adm = new Adm();

                        adm.mostra_menu2();
                        entrada2 = menu_adm.nextLine();
                        
                        switch(entrada2){

                            case "0":
                                System.out.println("Saindo");
                                status_adm = false;
                                break;
                            
                            case "1":
                                System.out.println("Relatório de vendas");
                                break;
                            
                            case "2":
                                System.out.println("Cargos");
                                break;
                            
                            case "3":
                                System.out.println("Produtos + vendidos");
                                break;
                            
                            default:
                                System.out.println("Caso default");
                                break;
                        }
                    }
                    break;

                default:
                    System.out.println("Caso default");
                    break;
            }
        }

        entrada_menu_inicial.close(); 
   
    }
}
