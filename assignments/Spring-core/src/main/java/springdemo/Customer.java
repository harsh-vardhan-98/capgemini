package springdemo;

public class Customer {
	
	private String name;
	private int customerid;
	private long contact;
	private Address address;
	
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", customerid=" + customerid + ", contact=" + contact + ", address=" + address
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
