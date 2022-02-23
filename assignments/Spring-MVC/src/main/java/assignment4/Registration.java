package assignment4;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class Registration {
	
	@NotNull
	@Pattern(regexp = "[A-Za-z0-9]{8,20}" , message="Must be alphanumeric")
	public String username;
	
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&.])[A-Za-z\\d$@$!%*?&.]{8,20}",message = "Password should contain at least one upper- case letter, lower-case letter, a digit or special character (_, $, #, ., @). Password should also be 8 to 20 characters long.")
	public String password;
	
	@Email
	public String email;
	
	@NotNull
	public long contact;
	
	@NotNull
	public String city;
	
	@Pattern(regexp = "[0-9]{6}",message = "Length should be 6")
	public long zipcode;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	
	

}
