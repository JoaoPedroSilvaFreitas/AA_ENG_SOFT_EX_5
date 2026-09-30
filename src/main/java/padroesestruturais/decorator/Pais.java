package padroesestruturais.decorator;

public class Pais extends VariavelDecorator {

    public Pais(Variavel filtro) {
        super(filtro);
    }

    public int getPesoFiltro() {
        return 1;
    }

    public String getNomeEstrutura() {
        return "Pais";
    }
}
