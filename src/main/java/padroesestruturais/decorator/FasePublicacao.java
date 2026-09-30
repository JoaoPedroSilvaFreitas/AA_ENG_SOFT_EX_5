package padroesestruturais.decorator;

public class FasePublicacao extends VariavelDecorator {

    public FasePublicacao(Variavel filtro) {
        super(filtro);
    }

    public int getPesoFiltro() {
        return 32;
    }

    public String getNomeEstrutura() {
        return "FasePublicacao";
    }
}
