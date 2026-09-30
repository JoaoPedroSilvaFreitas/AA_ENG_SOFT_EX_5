package padroesestruturais.decorator;

public class Etapa extends VariavelDecorator {

    public Etapa(Variavel filtro) {
        super(filtro);
    }

    public int getPesoFiltro() {
        return 256;
    }

    public String getNomeEstrutura() {
        return "Etapa";
    }
}
