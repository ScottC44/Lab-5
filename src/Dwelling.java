/*Scott Cromling
COMP167
LAB 5
 */

public class Dwelling {

    public String streetAddress;
    public String city;
    public String state;
    public String zip;
    public int bedrooms;
    public double bathrooms;

    public Dwelling(){

    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public double getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(double bathrooms) {
        this.bathrooms = bathrooms;
    }

    @Override
    public String toString() {
        return streetAddress + "|" + city + "|" + state + "|" + zip + "|" + bedrooms + "|" + bathrooms;
    }
}

