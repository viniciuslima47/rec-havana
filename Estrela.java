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

    public String getTipoEspectral(){
        return this.tipoEspectral;
    }

    public void setTipoEspectral(String tipoEspectral){
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

    @Override
    public void imprimirInfos() {
        super.imprimirInfos();
        System.out.println("Tipo Espectral: " + tipoEspectral);
        System.out.println("Luminosidade (em solares): " + luminosidade);
        System.out.println("Estágio Evolutivo: " + estagioEvolutivo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Temperatura (K): " + temperatura);
    }

    // Methods

    public void atualizarTipo() {
        if (getMassa() > 10 && tipoEspectral.startsWith("O")) {
            this.tipo = "Estrela massiva";
        } else {
            this.tipo = "Outro tipo";
        }
    }

    public void imprimirTempoVidaRest() {
        double vidaTotal = 10e9;
        double vidaRestante = vidaTotal - (getMassa() * 1e8);
        System.out.println("Tempo de vida restante: " + vidaRestante + " anos");
    }
}
