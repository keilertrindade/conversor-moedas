import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        double valor;
        GerenciadorConversor gerenciador = new GerenciadorConversor();
        Scanner leitura = new Scanner(System.in);
        Scanner pause = new Scanner(System.in);
        do{
            System.out.println("************************************");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileiro");
            System.out.println("4) Real brasileiro =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Sair");
            System.out.print("Escolha uma opção: ");
            try{
                opcao = leitura.nextInt();
            } catch (InputMismatchException e) {
                throw new InputMismatchException("Insira apenas valores numericos");
            }

            switch (opcao){
                case 1: //USD to ARS
                    System.out.println("Insira o valor a ser convertido: ");
                    valor = leitura.nextDouble();
                    System.out.println(gerenciador.Converter("USD","ARS", valor));
                    System.out.print("Pressione Enter para continuar!");
                    pause.nextLine();
                    break;
                case 2: //ARS to USD
                    System.out.println("Insira o valor a ser convertido: ");
                    valor = leitura.nextDouble();
                    System.out.println(gerenciador.Converter("ARS","USD", valor));
                    System.out.print("Pressione Enter para continuar!");
                    pause.nextLine();
                    break;
                case 3: //USD to BRL
                    System.out.println("Insira o valor a ser convertido: ");
                    valor = leitura.nextDouble();
                    System.out.println(gerenciador.Converter("USD","BRL", valor));
                    System.out.print("Pressione Enter para continuar!");
                    pause.nextLine();
                    break;
                case 4: //BRL to USD
                    System.out.println("Insira o valor a ser convertido: ");
                    valor = leitura.nextDouble();
                    System.out.println(gerenciador.Converter("BRL","USD", valor));
                    System.out.print("Pressione Enter para continuar!");
                    pause.nextLine();
                    break;
                case 5: //USD to COP
                    System.out.println("Insira o valor a ser convertido: ");
                    valor = leitura.nextDouble();
                    System.out.println(gerenciador.Converter("USD","COP", valor));
                    System.out.print("Pressione Enter para continuar!");
                    pause.nextLine();
                    break;
                case 6: //COP to USD
                    System.out.println("Insira o valor a ser convertido: ");
                    valor = leitura.nextDouble();
                    System.out.println(gerenciador.Converter("COP","USD", valor));
                    System.out.print("Pressione Enter para continuar!");
                    pause.nextLine();
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