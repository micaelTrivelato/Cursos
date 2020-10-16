package cap2;

import java.util.Arrays;
import java.util.List;

public class Programa {
    
    public static void main(String[] args) {
       NotasMusicais notas = new NotasMusicais();
       
       List<Nota> musica = Arrays.asList(
               notas.pega("do"), 
               notas.pega("do#"),
               notas.pega("re"),
               notas.pega("mi")
               
       );
       
       
       Piano piano = new Piano();
       piano.toca(musica);
       
    }
    
}
