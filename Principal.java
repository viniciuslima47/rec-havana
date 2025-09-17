import java.util.HashSet;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
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
            1,
            false,
            false,
            "Sistema Solar"
        );

        planeta2 .imprimirInfos();
    }
}
