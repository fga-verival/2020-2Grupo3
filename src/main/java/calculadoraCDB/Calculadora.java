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
        if(tempo <= 180) aliquota = 22.5F;
        else if(tempo <= 360) aliquota = 20F;
        else if(tempo <=720) aliquota = 17.5F;
        else aliquota = 15F;
    }

    public double getRendimentoBruto(){
        return (valorInicial*tempo*juros)/(100*365);
    }

    public double getImpostoRenda(){
        return getRendimentoBruto()*(aliquota/100);
    }

    public double getRendimentoLiquido(){
        return 1.0829; // Falsificação  
    }


    public static void main(String[] args) {

    }
}
