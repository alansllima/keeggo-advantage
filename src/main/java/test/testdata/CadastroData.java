package test.testdata;

import static core.config.Context.webActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CadastroData {

	private String username = "JJackson8";
	private String email = "juniorjj@gmail.com";
	private String password = "Senh@1234";
	private String firstname = "Junior";
	private String lastname = "Jackson";
	private String phonenumber = "11999999999";
	private String country = "Brazil";
	private String city = "Osasco";
	private String address = "Av Domingos odalia filho";
	private String stateprovinceregion = "SP";
	private String postalcode = "00000-000";

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

	public String getAddress() {
		return address;
	}

	public String getStateProvinceRegion() {
		return stateprovinceregion;
	}

	public String getPostalCode() {
		return postalcode;
	}

}
