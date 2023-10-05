import java.util.Scanner;

public class Principal {
   public static void main(String[] args) {
       String produto = "Teclado Mecânico";
       int quantidade = 50;
       int opcao = 0;

       Scanner scan = new Scanner(System.in);

       System.out.println("Informações do Produto:");
       System.out.println("================================");
       System.out.println("Nome: " + produto);
       System.out.println("Quantidade em Estoque: " + quantidade);
       System.out.println("================================");

       System.out.println("Escolha a Opção:");
       System.out.println("1. Consultar Quantidade em Estoque");
       System.out.println("2. Add Produto ao Estoque");
       System.out.println("3. Remove Produtos do Estoque");
       System.out.println("4. Sair");

       do {
           System.out.println("Informe a Opção:");
           opcao = scan.nextInt();

           switch (opcao) {
               case 1:
                   System.out.println("Quantidade Atual do Produto: " + quantidade);
                   break;
               case 2:
                   int nova_quantidade = scan.nextInt();
                   quantidade += nova_quantidade;
                   System.out.println("Quantidade Atual do Produto: " + quantidade);
                   break;
               case 3:
                   int quantidade_retirada = scan.nextInt();
                   if (quantidade - quantidade_retirada >= 0) {
                       quantidade -= quantidade_retirada;
                       System.out.println("Quantidade Atual do Produto: " + quantidade);
                       if (quantidade <= 10) {
                           System.out.println("Alerta: A quantidade em estoque está abaixo de 10 unidades.");
                       }
                   } else {
                       System.out.println("DESCULPE! Quantidade em estoque não possui produtos suficientes para essa operação.");
                   }
                   break;
           }
       } while (opcao != 4);


   }
}








