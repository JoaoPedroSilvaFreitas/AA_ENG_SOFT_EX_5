package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariavelTest {

    @Test
    void deveRetornarPesoPadrao() {
        Variavel filtro = new VariavelBase();

        assertEquals(0, filtro.getPesoTotal());
    }

    @Test
    void deveRetornarPesoPais() {
        Variavel filtro = new Pais(new VariavelBase());

        assertEquals(1, filtro.getPesoTotal());
    }

    @Test
    void deveRetornarPesoEstado() {
        Variavel filtro = new Estado(new VariavelBase());

        assertEquals(2, filtro.getPesoTotal());
    }


    @Test
    void deveRetornarPesoTipoAvaliacao() {
        Variavel filtro = new TipoAvaliacao(new VariavelBase());

        assertEquals(4, filtro.getPesoTotal());
    }

    @Test
    void deveRetornarPesoPrograma() {
        Variavel filtro = new Programa(new VariavelBase());

        assertEquals(8, filtro.getPesoTotal());
    }
    
        @Test
    void deveRetornarPesoSubPrograma() {
        Variavel filtro = new Subprograma(new VariavelBase());

        assertEquals(16, filtro.getPesoTotal());
    }
        
    @Test
    void deveRetornarPesFasePublicacao() {
        Variavel filtro = new FasePublicacao(new VariavelBase());

        assertEquals(32, filtro.getPesoTotal());
    }
     
    @Test
    void deveRetornarPesoRede() {
        Variavel filtro = new Rede(new VariavelBase());

        assertEquals(64, filtro.getPesoTotal());
    }

    @Test
    void deveRetornarPesoDisciplina() {
        Variavel filtro = new Disciplina(new VariavelBase());

        assertEquals(128, filtro.getPesoTotal());
    }
 
    @Test
    void deveRetornarPesoEtapa() {
        Variavel filtro = new Etapa(new VariavelBase());

        assertEquals(256, filtro.getPesoTotal());
    }


    @Test
    void deveRetornarCombinacaoMaxima() {
        Variavel filtro = new Etapa(new Disciplina(new Rede(new FasePublicacao(new Subprograma(new Programa(new TipoAvaliacao(new Estado(new Pais(new VariavelBase())))))))));

        assertEquals(511, filtro.getPesoTotal());
    }

    @Test
    void deveRetornarCombinacaoMinima() {
        Variavel filtro = new Estado(new Pais(new VariavelBase()));

        assertEquals(3, filtro.getPesoTotal());
    }


    @Test
    void deveRetornarEstruturaPadrao() {
        Variavel filtro = new VariavelBase();
        assertEquals("Variavel", filtro.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPais() {
        Variavel filtro = new Pais(new VariavelBase());
        assertEquals("Variavel/Pais", filtro.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaEstado() {
        Variavel filtro = new Estado(new VariavelBase());
        assertEquals("Variavel/Estado", filtro.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaTipoAvaliacao() {
        Variavel filtro = new TipoAvaliacao(new VariavelBase());
        assertEquals("Variavel/TipoAvaliacao", filtro.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPrograma() {
        Variavel filtro = new Programa(new VariavelBase());
        assertEquals("Variavel/Programa", filtro.getEstrutura());
    }
    
    @Test
    void deveRetornarEstruturaSubPrograma() {
        Variavel filtro = new Subprograma(new VariavelBase());
        assertEquals("Variavel/Subprograma", filtro.getEstrutura());
    }
        
    @Test
    void deveRetornarEstruturaFasePublicacao() {
        Variavel filtro = new FasePublicacao(new VariavelBase());
        assertEquals("Variavel/FasePublicacao", filtro.getEstrutura());
    }
     
    @Test
    void deveRetornarEstruturaRede() {
        Variavel filtro = new Rede(new VariavelBase());
        assertEquals("Variavel/Rede", filtro.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaDisciplina() {
        Variavel filtro = new Disciplina(new VariavelBase());
        assertEquals("Variavel/Disciplina", filtro.getEstrutura());
    }
 
    @Test
    void deveRetornarEstruturaEtapa() {
        Variavel filtro = new Etapa(new VariavelBase());
        assertEquals("Variavel/Etapa", filtro.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCombinacaoMaxima() {
        Variavel filtro = new Etapa(new Disciplina(new Rede(new FasePublicacao(new Subprograma(new Programa(new TipoAvaliacao(new Estado(new Pais(new VariavelBase())))))))));
        assertEquals("Variavel/Pais/Estado/TipoAvaliacao/Programa/Subprograma/FasePublicacao/Rede/Disciplina/Etapa", filtro.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCombinacaoMinima() {
        Variavel filtro = new Estado(new Pais(new VariavelBase()));
        assertEquals("Variavel/Pais/Estado", filtro.getEstrutura());
    }

}