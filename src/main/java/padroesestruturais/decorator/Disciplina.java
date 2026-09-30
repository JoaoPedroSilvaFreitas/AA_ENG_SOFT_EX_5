package padroesestruturais.decorator;

public class Disciplina extends VariavelDecorator {

    public Disciplina(Variavel filtro) {
        super(filtro);
    }

    public int getPesoFiltro() {
        return 128;
    }

    public String getNomeEstrutura() {
        return "Disciplina";
    }
}
