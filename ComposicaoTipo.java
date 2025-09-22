import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public enum ComposicaoTipo {
    ROCHAS,
    METAIS,
    GELO,
    GASES;

    public static Set<ComposicaoTipo> getTodos() {
        Set<ComposicaoTipo> tudoJunto = new HashSet<>();
        tudoJunto.add(ROCHAS);
        tudoJunto.add(METAIS);
        tudoJunto.add(GELO);
        tudoJunto.add(GASES);
        return Collections.unmodifiableSet(tudoJunto);
    }

    public static boolean isTodos(Set<ComposicaoTipo> composicao) {
        return composicao != null && composicao.size() == 4 && 
               composicao.contains(ROCHAS) && 
               composicao.contains(METAIS) && 
               composicao.contains(GELO) && 
               composicao.contains(GASES);
    }
}
