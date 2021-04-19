package calculadoraCDB;

public class Calculadora {

    private double valorInicial;
    private double juros;
    private double tempo;
    private double aliquota;

    public Calculadora(double valorInicial, double juros, double tempo) {
        this.valorInicial = valorInicial;
        this.juros = juros;
        this.tempo = tempo;
        aliquota = 0F;
    }

    public double getRendimentoBruto(){
        return (valorInicial*tempo*juros)/(100*365);
    }

    public static void main(String[] args) {

    }
}
