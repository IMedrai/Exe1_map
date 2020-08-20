import java.util.Comparator;
import java.util.Map;

public class ComparatorCNE implements Comparator<String>{

	
	

	   Map<String, Eleve> map;
	   public ComparatorCNE(Map<String, Eleve> map) {
		   super();
		   this.map = map;
	}

	  
	

	@Override
	public int compare(String cne1, String cne2) {
		Eleve eleve1 = map.get(cne1);
		Eleve eleve2 = map.get(cne2);
		return eleve1.compareTo(eleve2);
	
	}
	}
	

