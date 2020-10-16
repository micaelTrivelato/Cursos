package cap2;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {
    private static Map<String, Nota> notas =
            new HashMap<String, Nota>();
    

    
    public Nota pega(String nome){
        
        if(nome.equalsIgnoreCase("do"))notas.put(nome, new Do());
        if(nome.equalsIgnoreCase("do#"))notas.put(nome, new DoSustenido());
        if(nome.equalsIgnoreCase("re"))notas.put(nome, new Re());
        if(nome.equalsIgnoreCase("mi"))notas.put(nome, new Mi());
        if(nome.equalsIgnoreCase("fa"))notas.put(nome, new Fa());
        if(nome.equalsIgnoreCase("sol"))notas.put(nome, new Sol());
        if(nome.equalsIgnoreCase("la"))notas.put(nome, new La());
        if(nome.equalsIgnoreCase("si"))notas.put(nome, new Si());
        
        return notas.get(nome);
    }
}
