package padroesestruturais.decorator;

public class Rede extends VariavelDecorator {

    public Rede(Variavel filtro) {
        super(filtro);
    }

    public int getPesoFiltro() {
        return 64;
    }

    public String getNomeEstrutura() {
        return "Rede";
    }
}
