
public class Address {
	int houseNo;
	String streetname;
	String city;
	String state;
	int zipcode;
	
	
	
	public Address(int houseNo, String streetname, String city, String state, int zipcode) {
		super();
		this.houseNo = houseNo;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	
}
