package padroesestruturais.decorator;

public class VariavelBase implements Variavel {

    public int peso;

    public VariavelBase() {
        this.peso = 0;
    }

    public int getPesoTotal() {
        return peso;
    }

    public String getEstrutura() {
        return "Variavel";
    }

}

