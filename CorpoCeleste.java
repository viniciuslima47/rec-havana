import java.util.Set;

public class CorpoCeleste {

    private String nome;
    private String localizacao;
    private boolean luzPropria;
    private double massa;
    private double diametro;
    private Set<ComposicaoTipo> composicao;
    private String orbita;

    public CorpoCeleste(String nome, String localizacao, boolean luzPropria, double massa, double diametro,
            Set<ComposicaoTipo> composicao, String orbita) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.luzPropria = luzPropria;
        this.massa = massa;
        this.diametro = diametro;
        this.composicao = composicao;
        this.orbita = orbita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setIdade(String localizacao) {
        this.localizacao = localizacao;
    }

    public boolean getLuzPropria() {
        return luzPropria;
    }

    public void setLuzPropria(boolean luzPropria) {
        this.luzPropria = luzPropria;
    }

    public double getMassa() {
        return massa;
    }

    public void setMasa(Double massa) {
        this.massa = massa;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public Set<ComposicaoTipo> getComposicao() {
        return composicao;
    }

    public void setComposicao(Set<ComposicaoTipo> composicao) {
        this.composicao = composicao;
    }

    public String getOrbita() {
        return orbita;
    }

    public void setOrbita(String orbita) {
        this.orbita = orbita;
    }

    public void imprimirInfos() {
        System.out.println("------------------------------------");
        System.out.println(" ");
        System.out.println("Nome: " + nome);
        System.out.println("Localização: " + localizacao);
        System.out.println("Luz Própria: " + luzPropria);
        System.out.println("Massa: " + massa);
        System.out.println("Diâmetro: " + diametro + " km");
        System.out.println("Composição: " + composicao);
        System.out.println("Órbita: " + orbita);
        System.out.println(" ");
    }
}
