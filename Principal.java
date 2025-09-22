import java.util.HashSet;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {

        // Planetas
        Set<ComposicaoTipo> compTerra = new HashSet<>();
        compTerra.add(ComposicaoTipo.ROCHAS);
        compTerra.add(ComposicaoTipo.GASES);

        Planeta planeta1 = new Planeta(
                "Terra",
                "Sistema Solar",
                false,
                5.97e24,
                12742,
                compTerra,
                "Órbita ao redor do Sol",
                1,
                false,
                true,
                "Sistema Solar"
        );
        planeta1.imprimirInfos();

        Set<ComposicaoTipo> compMarte = new HashSet<>();
        compMarte.add(ComposicaoTipo.ROCHAS);
        compMarte.add(ComposicaoTipo.METAIS);

        Planeta planeta2 = new Planeta(
                "Marte",
                "Sistema Solar",
                false,
                6.4171e23,
                6779,
                compMarte,
                "Órbita ao redor do Sol",
                2,
                false,
                false,
                "Sistema Solar"
        );
        planeta2.imprimirInfos();

        // Asteroides
        Set<ComposicaoTipo> composicaoApophis = new HashSet<>();
        composicaoApophis.add(ComposicaoTipo.ROCHAS);

        Asteroide asteroide1 = new Asteroide(
                "Apophis",
                "Órbita Próxima da Terra",
                false,
                2.7e10,
                0.375,
                composicaoApophis,
                "Sol",
                "Apollo",
                "Apollo",
                false
        );
        asteroide1.imprimirInfos();

        Set<ComposicaoTipo> composicaoEros = new HashSet<>();
        composicaoEros.add(ComposicaoTipo.ROCHAS);
        composicaoEros.add(ComposicaoTipo.METAIS);

        Asteroide asteroide2 = new Asteroide(
                "Eros",
                "Cinturão de asteroides",
                false,
                6.69e15,
                16.84,
                composicaoEros,
                "Sol",
                "Amor",
                "Amor",
                false
        );
        asteroide2.imprimirInfos();

        Set<ComposicaoTipo> composicaoTudo = new HashSet<>();
        composicaoTudo.add(ComposicaoTipo.ROCHAS);
        composicaoTudo.add(ComposicaoTipo.METAIS);
        composicaoTudo.add(ComposicaoTipo.GELO);
        composicaoTudo.add(ComposicaoTipo.GASES);

        Asteroide asteroide3 = new Asteroide(
                "Ceres",
                "Cinturão de Asteroides",
                false,
                9.393e20,
                940,
                composicaoTudo,
                "Sol",
                "Cinturão Principal",
                "Cinturão Principal",
                false
        );
        asteroide3.imprimirInfos();

        // Estrelas
        Set<ComposicaoTipo> composicaoSol = new HashSet<>();
        composicaoSol.add(ComposicaoTipo.GASES);

        Estrela estrela1 = new Estrela(
                "Sol",
                "Sistema Solar",
                true,
                1.989e30,
                1.3927e6,
                composicaoSol,
                "Centro da Via Láctea",
                "G2V",
                1.0,
                "Sequência Principal",
                "",
                5778
        );
        estrela1.atualizarTipo();
        estrela1.imprimirInfos();

        Set<ComposicaoTipo> composicaoSirius = new HashSet<>();
        composicaoSirius.add(ComposicaoTipo.GASES);

        Estrela estrela2 = new Estrela(
                "Sirius",
                "Constelação de Cão Maior",
                true,
                4.018e30,
                2.063e6,
                composicaoSirius,
                "Via Láctea",
                "A1V",
                25.4,
                "Sequência Principal",
                "",
                9940
        );
        estrela2.atualizarTipo();
        estrela2.imprimirInfos();

        System.out.println("=== FIM! ===");
    }
}
