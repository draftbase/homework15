package task1;

public class Country {
    private String countryCode;
    private String countryName;
    private String population;

    public Country(String countryCode, String countryName, String population) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.population = population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return countryName + " (" + countryCode + ") ma " + population + " ludności.";
    }
}
