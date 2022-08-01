package practics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QA43 {
public static void main(String[] args) {
	List<String> longlist = List.of("Hello","World","Beat");
	List<String> shortlist = new ArrayList<>();
//	longlist.stream().filter(w->w.indexOf('e')!=-1).parallel().forEach(w->shortlist.add(w));  
//	longlist.parallelStream().filter(w->w.indexOf('e')!=-1).forEach(w->shortlist.add(w));
//	shortlist=longlist.stream().filter(w->w.indexOf('e')!=-1).parallel().collect(Collectors.toList());
	System.out.println(shortlist);
//	longlist.stream().filter(w->w.indexOf('e')!=-1).parallel().collect(shortlist);
}
}
