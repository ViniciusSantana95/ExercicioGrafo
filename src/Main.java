import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Hashtable<String, ArrayList<String>> hashtable = new Hashtable<String, ArrayList<String>>();

        ArrayList<String> colegasDog = new ArrayList<String>();

        colegasDog.add("Claire");
        colegasDog.add("Alice");
        colegasDog.add("Bob");

        hashtable.put("Dog", colegasDog);

        ArrayList<String> colegasClaire = new ArrayList<String>();

        colegasClaire.add("Thom");
        colegasClaire.add("Jonny");

        hashtable.put("Clair", colegasClaire);

        ArrayList<String> colegasAlice = new ArrayList<String>();

        colegasAlice.add("Peggy");

        hashtable.put("Alice", colegasAlice);

        ArrayList<String> colegasBob = new ArrayList<String>();

        colegasBob.add("Anuj");
        colegasBob.add("Peggy");

        hashtable.put("Bob", colegasBob);

        for(Map.Entry<String, ArrayList<String>> entidade : hashtable.entrySet()){
            String chave = entidade.getKey();
            ArrayList<String> valor = entidade.getValue();

            System.out.println(chave + "|" + valor);
        }

    }
}
