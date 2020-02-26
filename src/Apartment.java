/*Scott Cromling
COMP167
LAB 5
 */

public class Apartment extends Dwelling{

    public String apptNum;
    public boolean laundry;

    public Apartment(){
        apptNum = "";
        laundry = true;

    }
    public String getApptNum() {
        return apptNum;
    }

    public void setApptNum(String apptNum) {
        this.apptNum = apptNum;
    }

    public boolean isLaundry() {
        return laundry;
    }

    public void setLaundry(boolean laundry) {
        this.laundry = laundry;
    }

    @Override
    public String toString() {
        return super.toString() + "|" + apptNum + "|" + (laundry ? "Laundry" : "No Laundry");
    }
}


