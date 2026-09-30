package padroesestruturais.decorator;

public class Estado extends VariavelDecorator {

    public Estado(Variavel filtro) {
        super(filtro);
    }

    public int getPesoFiltro() {
        return 2;
    }

    public String getNomeEstrutura() {
        return "Estado";
    }
}
