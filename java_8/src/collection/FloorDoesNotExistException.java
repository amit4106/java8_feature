package collection;

public class FloorDoesNotExistException extends Exception{

	private String message;
	
	public FloorDoesNotExistException(String message) {
		this.message=message;
		
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
}
