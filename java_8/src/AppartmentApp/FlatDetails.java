package AppartmentApp;

public class FlatDetails {

	//FloorNo
	//FlatNo
	//Rent
	//Vacated
	private int floorNo;
	private int flatNo;
	private int rent;
	private boolean vacated;
	public FlatDetails(int floorNo, int flatNo, int rent, boolean vacated) {
		super();
		this.floorNo = floorNo;
		this.flatNo = flatNo;
		this.rent = rent;
		this.vacated = vacated;
	}
	/**
	 * @return the floorNo
	 */
	public int getFloorNo() {
		return floorNo;
	}
	/**
	 * @param floorNo the floorNo to set
	 */
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	/**
	 * @return the flatNo
	 */
	public int getFlatNo() {
		return flatNo;
	}
	/**
	 * @param flatNo the flatNo to set
	 */
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	/**
	 * @return the rent
	 */
	public int getRent() {
		return rent;
	}
	/**
	 * @param rent the rent to set
	 */
	public void setRent(int rent) {
		this.rent = rent;
	}
	/**
	 * @return the vacated
	 */
	public boolean isVacated() {
		return vacated;
	}
	/**
	 * @param vacated the vacated to set
	 */
	public void setVacated(boolean vacated) {
		this.vacated = vacated;
	}
	

}
