package practics2;

public class QA78 {
	public static void doThings()throws GeneralException {
		try {
			throw new RuntimeException("somthing happend");
		}catch (Exception e) {
			throw new SpecificException(e.getMessage());
		}
	}
	public static void main(String[] args) {
		try {
			QA78.doThings();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			}
	}
}

class GeneralException extends Exception{
	public GeneralException(String s) {
		super(s);
	}
}

class SpecificException extends GeneralException{
	public SpecificException(String s) {
		super(s);
	}
}
