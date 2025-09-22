import java.util.Set;

public class Estrela extends CorpoCeleste {
    private String tipoEspectral;
    private double luminosidade;
    private String estagioEvolutivo;
    private String tipo;
    private double temperatura;

    public Estrela(String nome, String localizacao, boolean luzPropria, double massa, double diametro,
            Set<ComposicaoTipo> composicao, String orbita,
            String tipoEspectral, double luminosidade, String estagioEvolutivo, String tipo, double temperatura) {
        super(nome, localizacao, luzPropria, massa, diametro, composicao, orbita);
        this.tipoEspectral = tipoEspectral;
        this.luminosidade = luminosidade;
        this.estagioEvolutivo = estagioEvolutivo;
        this.tipo = tipo;
        this.temperatura = temperatura;
    }

    public String getTipoEspectral() {
        return this.tipoEspectral;
    }

    public void setTipoEspectral(String tipoEspectral) {
        this.tipoEspectral = tipoEspectral;
    }

    public double getLuminosidade() {
        return this.luminosidade;
    }

    public void setLuminosidade(double luminosidade) {
        this.luminosidade = luminosidade;
    }

    public String getEstagioEvolutivo() {
        return this.estagioEvolutivo;
    }

    public void setEstagioEvolutivo(String estagioEvolutivo) {
        this.estagioEvolutivo = estagioEvolutivo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void atualizarTipo() {
        double massaSolar = getMassa() / 1.989e30;
        
        if (massaSolar < 0.08) {
            tipo = "Anã marrom";
            estagioEvolutivo = "Muito pouco massiva";
        } 
        else if (massaSolar < 0.5) {
            if (tipoEspectral.startsWith("M")) {
                tipo = "Anã vermelha";
            } else {
                tipo = "Estrela de baixa massa";
            }
            estagioEvolutivo = "Pouco massiva";
        } 
        else if (massaSolar < 8) {
            if (tipoEspectral.startsWith("G")) {
                tipo = "Estrela amarela (Sequência Principal)";
            } else if (tipoEspectral.startsWith("F")) {
                tipo = "Estrela branco-amarela";
            } else if (tipoEspectral.startsWith("A")) {
                tipo = "Estrela branca";
            } else if (tipoEspectral.startsWith("B")) {
                tipo = "Estrela azul-branca";
            } else if (tipoEspectral.startsWith("K")) {
                tipo = "Estrela laranja";
            } else {
                tipo = "Estrela da sequência principal";
            }
            estagioEvolutivo = "Massa intermediária";
        } 
        else if (massaSolar < 20) {
            tipo = "Estrela massiva (Classe B)";
            estagioEvolutivo = "Massiva";
        } 
        else if (massaSolar < 100) {
            tipo = "Estrela supermassiva (Classe O)";
            estagioEvolutivo = "Muito massiva";
        } 
        else {
            tipo = "Estrela hipergigante";
            estagioEvolutivo = "Extremamente massiva";
        }

        if (tipoEspectral.contains("V")) {
            tipo += " - Sequência Principal";
        } else if (tipoEspectral.contains("III")) {
            tipo = "Gigante " + tipo;
        } else if (tipoEspectral.contains("II")) {
            tipo = "Subgigante " + tipo;
        } else if (tipoEspectral.contains("I")) {
            tipo = "Supergigante " + tipo;
        } else if (tipoEspectral.contains("VII")) {
            tipo = "Anã branca";
        }
    }

    public void imprimirTempoDeVidaRestante() {
        double massaSolar = getMassa() / 1.989e30;
        double tempoVida;
        
        if (massaSolar < 0.08) {
            tempoVida = 10000000;
        } else if (massaSolar < 0.5) {
            tempoVida = 1000000;
        } else if (massaSolar < 8) {
            tempoVida = 10000 / Math.pow(massaSolar, 2.5);
        } else if (massaSolar < 20) {
            tempoVida = 1000 / Math.pow(massaSolar, 2.5);
        } else {
            tempoVida = 100 / Math.pow(massaSolar, 2.5);
        }
        
        System.out.println("Tempo de vida restante: " + String.format("%.2f", tempoVida) + " milhões de anos");
    }

    @Override
    public void imprimirInfos() {
        super.imprimirInfos();
        System.out.println("Tipo Espectral: " + tipoEspectral);
        System.out.println("Luminosidade (em solares): " + luminosidade);
        System.out.println("Estágio Evolutivo: " + estagioEvolutivo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Temperatura (K): " + temperatura);
        imprimirTempoDeVidaRestante();
        System.out.println("------------------------------------\n");
    }
}
