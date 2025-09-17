import java.util.Set;


public class Planeta extends CorpoCeleste {

    private int qtdLuas;
    private boolean temAneis;
    private boolean temVida;
    private String sistema;

    public Planeta(String nome, String localizacao, boolean luzPropria, double massa, double diametro,
            Set<ComposicaoTipo> composicao, String orbita,
            int qtdLuas, boolean temAneis, boolean temVida, String sistema) {
        super(nome, localizacao, luzPropria, massa, diametro, composicao, orbita);
        this.qtdLuas = qtdLuas;
        this.temAneis = temAneis;
        this.temVida = temVida;
        this.sistema = sistema;
    }

    @Override
    public void imprimirInfos() {
        super.imprimirInfos();
        System.out.println("Quantidade de luas: " + qtdLuas);
        System.out.println("Tem anéis: " + (temAneis ? "Sim" : "Não"));
        System.out.println("Tem vida: " + (temVida ? "Sim" : "Não"));
        System.out.println("Sistema: " + sistema);
    }

    public int getQtdLuas() {
        return this.qtdLuas;
    }

    public void setQtdLuas(int qtdLuas) {
        this.qtdLuas = qtdLuas;
    }

    public boolean getTemAneis() {
        return this.temAneis;
    }

    public void setTemAneis(boolean temAneis) {
        this.temAneis = temAneis;
    }

    public boolean getTemVida() {
        return this.temVida;
    }

    public void setTemVida(boolean temVida) {
        this.temVida = temVida;
    }

    public String getSistema() {
        return this.sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
}
