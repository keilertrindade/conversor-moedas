public class GerenciadorConversor {

    String resposta = "";
    public GerenciadorConversor() {
    }

    public String Converter(String from, String to, double valor){
        try {
            double valorConvertido = Request.getExchangeRate(from,to,valor);
            //System.out.println(valor+" USD = " + valorConvertido + " ARS");
            resposta = String.format("%.2f %s é convertido em %.2f %s.",valor,from,valorConvertido,to);
            //resposta = valor+" "+from+" é convertido em "+valorConvertido+" "+to+".";
        } catch (Exception e) {
            //throw new RuntimeException(e);
            resposta = "Ocorreu um erro!\n"+e;
        }
        //20.0 USD é convertido em: 19635.0 ARS.
        return resposta;
    }
}
