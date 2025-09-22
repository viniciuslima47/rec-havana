
import java.util.Set;

public class Asteroide extends CorpoCeleste {

    private String tipoOrbital;
    private String grupoOrbital;
    private boolean perigoso;

    public Asteroide(String nome, String localizacao, boolean luzPropria, double massa, double diametro,
            Set<ComposicaoTipo> composicao, String orbita,
            String tipoOrbital, String grupoOrbital, boolean perigoso) {
        super(nome, localizacao, luzPropria, massa, diametro, composicao, orbita);
        this.tipoOrbital = tipoOrbital;
        this.grupoOrbital = grupoOrbital;
        this.perigoso = perigoso;
    }

    public String getTipoOrbital() {
        return tipoOrbital;
    }

    public void setTipoOrbital(String tipoOrbital) {
        this.tipoOrbital = tipoOrbital;
    }

    public String getGrupoOrbital() {
        return grupoOrbital;
    }

    public void setGrupoOrbital(String grupoOrbital) {
        this.grupoOrbital = grupoOrbital;
    }

    public boolean isPerigoso() {
        return perigoso;
    }

    public void setPerigoso(boolean perigoso) {
        this.perigoso = perigoso;
    }

    public void verificarPerigo() {
        boolean criterioTamanho = getDiametro() > 0.14;
        boolean criterioGrupo = grupoOrbital.equalsIgnoreCase("Apollo")
                || grupoOrbital.equalsIgnoreCase("Aten")
                || grupoOrbital.equalsIgnoreCase("Atira")
                || grupoOrbital.equalsIgnoreCase("Amor");
        boolean criterioMassa = getMassa() > 1e10;

        perigoso = criterioTamanho && criterioGrupo && criterioMassa;

        if (perigoso) {
            System.out.println("Asteroide perigoso para a Terra!");
            System.out.println("   - Diâmetro: " + getDiametro() + " km");
            System.out.println("   - Grupo orbital: " + grupoOrbital);
            System.out.println("   - Massa: " + String.format("%.2e", getMassa()) + " kg");
        }
    }

    @Override
    public void imprimirInfos() {
        super.imprimirInfos();
        System.out.println("Tipo Orbital: " + tipoOrbital);
        System.out.println("Grupo Orbital: " + grupoOrbital);
        verificarPerigo();
        System.out.println("É perigoso? " + (perigoso ? "Sim" : "Não"));
        System.out.println("------------------------------------\n");
    }
}
