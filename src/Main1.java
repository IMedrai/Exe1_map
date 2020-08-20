import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Map<String, Eleve> map1 = new HashMap<String, Eleve>();
		map1.put("AB123", new Eleve("AB123","Brayche","Issam",1995));
		map1.put("CB123", new Eleve("CB123","Mesbahi","Ilham",1996));
		map1.put("AF123", new Eleve("AF123","Demnati","Adam",1990));
		map1.put("EH123", new Eleve("EH123","Ghzaoui","laila",1988));
		map1.put("LB123", new Eleve("LB123","Medrai","Inssaf",2001));
		
		
	Set<Map.Entry<String, Eleve>> cl1 = map1.entrySet();
	Iterator<Map.Entry<String, Eleve>> it = cl1.iterator();
	while(it.hasNext()) {
		Map.Entry entry = it.next();
		System.out.println("clé : " + entry.getKey()+ " - valeur : " + entry.getValue());
		
	}
	System.out.println("------------------par ordre de cne eleve");
	
	Map<String, Eleve> map2 = new TreeMap<String, Eleve>( new ComparatorCNE(map1));
	
	map2.putAll(map1);      
	Set<Map.Entry<String, Eleve>> cl2 = map2.entrySet();
	Iterator<Map.Entry<String, Eleve>> it2 = cl2.iterator();
	while(it2.hasNext()){
		Map.Entry entry = it2.next();
		System.out.println("clé : " + entry.getKey() + " - valeur : " + entry.getValue());
}
	
		
	}

}

