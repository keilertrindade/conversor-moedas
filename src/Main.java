import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = -1;
        Scanner leitura = new Scanner(System.in);
        do{
            //Runtime.getRuntime().exec("cls");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileiro");
            System.out.println("4) Real brasileiro =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida: ");
            System.out.println("************************************");
            opcao = leitura.nextInt();

            if(opcao < 7 && opcao > 0){

            }

            switch (opcao){
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Escolha uma opção válida!");
            }
        }while (opcao != 7);



    }
}