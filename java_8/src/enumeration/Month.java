package enumeration;
/* 
-> In simple enum constant ";" is optional. But in enum fields ";" is mandatory.
-> enum class constructor must be private.
-> enum w.r.t inheritance, enum class cannot extends any other enum class but it can implements any no of interfaces.
-> you cannot extends enum class.(enum class is by default final & one cannot create child of final class).
-> java.lang.Enum is the direct parent class of every enum class.
-> compiler automatically provide 2 static methods:-  1. public static Month[] values();
	  												  2. public static Month valueOf(java.lang.String);
-> enum class implicitly implements 2 interfaces Comparable, Serializable.
-> enum class we can declare methods,declare interface,  
*/
public enum Month {

	//JAN,FEB,MAR,APR
	JAN("JANUARY"), FEB("FEBRUARY"), MAR("MARCH"), APR("APRIL"), MAY("MAY"), JUNE("JUNE"), JULY("JULY"), AUG("AUGUST"),
	SEP("SEPTEMBER"), OCT("OCTOBER"), NOV("NOVEMEBR"), DEC("DECEMBER");
	
	private String month;
	private  Month(String month) {
		this.month=month;
	}
	public String getMonth() {
		
		return month;
	}
	public static void main(String[] args) {
		//System.out.println(Month.JAN.toString());
		//System.out.println(Month.FEB.ordinal());
		//System.out.println(Month.APR.valueOf("JAN"));
		for(Month month:Month.values()) {
		//System.out.println(month.getMonth());
		}
	}
	}

