package padroesestruturais.decorator;

public class TipoAvaliacao extends VariavelDecorator {

    public TipoAvaliacao(Variavel filtro) {
        super(filtro);
    }

    public int getPesoFiltro() {
        return 4;
    }

    public String getNomeEstrutura() {
        return "TipoAvaliacao";
    }
}
