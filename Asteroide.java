import java.util.Set;

public class Asteroide extends CorpoCeleste {

    private String tipoOrbital;
    private String grupoOrbital;
    private boolean ePerigoso;

    public Asteroide(String nome, String localizacao, boolean luzPropria, double massa, double diametro,
                     Set<ComposicaoTipo> composicao, String orbita,
                     String tipoOrbital, String grupoOrbital, boolean ePerigoso) {
        super(nome, localizacao, luzPropria, massa, diametro, composicao, orbita);
        this.tipoOrbital = tipoOrbital;
        this.grupoOrbital = grupoOrbital;
        this.ePerigoso = ePerigoso;
    }

    public void verificarPerigo() {
        // Exemplo simplificado: digamos que asteróides maiores que certa massa e em certo grupo são perigosos
        if (getMassa() > 1e12 && grupoOrbital.equalsIgnoreCase("Apollo")) {
            this.ePerigoso = true;
            System.out.println("Alerta! Asteróide perigoso detectado!");
        } else {
            this.ePerigoso = false;
            System.out.println("Asteróide não apresenta perigo para a Terra.");
        }
    }

    @Override
    public void imprimirInfos() {
        super.imprimirInfos();
        System.out.println("Tipo Orbital: " + tipoOrbital);
        System.out.println("Grupo Orbital: " + grupoOrbital);
        System.out.println("É perigoso? " + (ePerigoso ? "Sim" : "Não"));
    }
}
