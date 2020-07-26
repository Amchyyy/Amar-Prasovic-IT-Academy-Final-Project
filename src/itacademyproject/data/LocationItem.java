package itacademyproject.data;

public class LocationItem {

    private String countryName;
    private String adress;
    
    public LocationItem(String countryName, String adress) {
        this.countryName = countryName;
        this.adress = adress;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
}
