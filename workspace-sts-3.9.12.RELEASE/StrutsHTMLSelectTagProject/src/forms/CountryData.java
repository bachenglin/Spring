package forms;

public class CountryData
{
  private String countryId;
  private String countryName;
public CountryData(String countryId, String countryName)
{
	this.countryId = countryId;
	this.countryName = countryName;
}
public String getCountryId() {
	return countryId;
}
public void setCountryId(String countryId) {
	this.countryId = countryId;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}

}
