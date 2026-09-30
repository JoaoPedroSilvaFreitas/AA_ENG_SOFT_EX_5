package padroesestruturais.decorator;

public abstract class VariavelDecorator implements Variavel {

    private Variavel filtro;
    public String estrutura;

    public VariavelDecorator(Variavel filtro) {
        this.filtro = filtro;
    }

    //======================================================================
    public Variavel getFiltro() {
        return filtro;
    }

    public void setFiltro(Variavel filtro) {
        this.filtro = filtro;
    }

    //======================================================================
    public abstract int getPesoFiltro();

    public int getPesoTotal() {
        return this.filtro.getPesoTotal() + this.getPesoFiltro();
    }

    //======================================================================
    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.filtro.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }

}


