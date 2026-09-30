package padroesestruturais.decorator;

public class Programa extends VariavelDecorator {

    public Programa(Variavel filtro) {
        super(filtro);
    }

    public int getPesoFiltro() {
        return 8;
    }

    public String getNomeEstrutura() {
        return "Programa";
    }
}
