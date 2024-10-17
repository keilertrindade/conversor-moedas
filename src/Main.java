import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = -1;
        double valor = 0;
        //Request request = new Request();
        Scanner leitura = new Scanner(System.in);
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
            //System.out.println("************************************");
            opcao = leitura.nextInt();

            /*if(opcao < 7 && opcao > 0){

            } */

            switch (opcao){
                case 1:
                    System.out.println("Insira o valor a ser convertido: ");
                    valor = leitura.nextDouble();
                    try {
                        double valorConvertido = Request.getExchangeRate("USD","ARS",valor);
                        System.out.println(valor+" USD = " + valorConvertido + " ARS");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    System.out.println("Insira o valor a ser convertido: ");
                    valor = leitura.nextDouble();
                    try {
                        double valorConvertido = Request.getExchangeRate("ARS","USD",valor);
                        System.out.println(valor+" ARS = " + valorConvertido + " USD");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    System.out.println("Insira o valor a ser convertido: ");
                    valor = leitura.nextDouble();
                    try {
                        double valorConvertido = Request.getExchangeRate("USD","BRL",valor);
                        System.out.println(valor+" USD = " + valorConvertido + " BRL");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 4:
                    System.out.println("Insira o valor a ser convertido: ");
                    valor = leitura.nextDouble();
                    try {
                        double valorConvertido = Request.getExchangeRate("BRL","USD",valor);
                        System.out.println(valor+" BRL = " + valorConvertido + " USD");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 5:
                    System.out.println("Insira o valor a ser convertido: ");
                    valor = leitura.nextDouble();
                    try {
                        double valorConvertido = Request.getExchangeRate("USD","COP",valor);
                        System.out.println(valor+" USD = " + valorConvertido + " COP");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 6:
                    System.out.println("Insira o valor a ser convertido: ");
                    valor = leitura.nextDouble();
                    try {
                        double valorConvertido = Request.getExchangeRate("COP","USD",valor);
                        System.out.println(valor+" COP = " + valorConvertido + " USD");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
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