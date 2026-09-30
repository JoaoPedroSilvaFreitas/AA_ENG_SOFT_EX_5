package padroesestruturais.decorator;

public class Subprograma extends VariavelDecorator {

    public Subprograma(Variavel filtro) {
        super(filtro);
    }

    public int getPesoFiltro() {
        return 16;
    }

    public String getNomeEstrutura() {
        return "Subprograma";
    }
}
