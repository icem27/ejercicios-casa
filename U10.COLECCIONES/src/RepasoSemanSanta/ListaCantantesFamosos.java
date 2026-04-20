package RepasoSemanSanta;

import java.util.ArrayList;

public class ListaCantantesFamosos {
    
    private ArrayList<String> lista = new ArrayList<String>();
            
    
    public ListaCantantesFamosos()
    {
        for (int i = 0; i < 3; i++)
            lista.add("Cantante "+i);
        
    }
    
    public void anadir(String s)
    {
        lista.add(s);
    }
    
    public String toString()
    {
        String cantantes = "";
        
        for (int i = 0; i < lista.size(); i++)
            cantantes+=lista.get(i)+"\n";
        return cantantes;
    }
}