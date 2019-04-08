import java.util.HashMap;

public class TableSymboles {
    HashMap<String, Donnee> table = new HashMap<String, Donnee>();
    int size = 0; // adresse?


    public void put(String var, Type type){
        table.put(var, new Donnee(size, type));
        size += type.size();
    }

    public Donnee getDonnee(String id){
        return table.get(id);
    }

    public int getSize(){
        return size;
    }



}
