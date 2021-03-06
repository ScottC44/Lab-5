/*Scott Cromling
COMP167
LAB 5
 */

public class House extends Dwelling{
    public double acreage;
    public int garageSize;

    public House() {
        acreage = 0.0;
        garageSize = 0;
    }

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    public int getGarageSize() {
        return garageSize;
    }

    public void setGarageSize(int garageSize) {
        this.garageSize = garageSize;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + acreage + " | " + garageSize;
    }

}
