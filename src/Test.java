/*Scott Cromling
COMP167
LAB 5
 */
import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Dwelling> dwellingList = new ArrayList<>();
        Scanner read = new Scanner(new File("dwelling.txt"));
        while (read.hasNextLine()) {
            String line = read.nextLine();
            if(line.isEmpty()) continue;
            Character type = line.charAt(0);
            String streetAddress = read.nextLine();
            String city = read.nextLine();
            String state = read.nextLine();
            String zip = read.nextLine();
            int bedrooms = Integer.parseInt(read.nextLine());
            double bathrooms = Double.parseDouble(read.nextLine());

            if (type.equals('H')) {
                House newHouse = new House();
                newHouse.setStreetAddress(streetAddress);
                newHouse.setCity(city);
                newHouse.setState(state);
                newHouse.setZip(zip);
                newHouse.setBedrooms(bedrooms);
                newHouse.setBathrooms(bathrooms);
                newHouse.setAcreage(Double.parseDouble(read.nextLine()));
                newHouse.setGarageSize(Integer.parseInt(read.nextLine()));
                dwellingList.add(newHouse);
            } else {
                Apartment newApartment = new Apartment();
                newApartment.setStreetAddress(streetAddress);
                newApartment.setCity(city);
                newApartment.setState(state);
                newApartment.setZip(zip);
                newApartment.setBedrooms(bedrooms);
                newApartment.setBathrooms(bathrooms);
                newApartment.setApptNum(read.nextLine());
                newApartment.setLaundry(read.nextInt() == 1);
                dwellingList.add(newApartment);
            }
        }
            for (int i =0; i<dwellingList.size();i++ ) {
                System.out.println(dwellingList.get(i));
            }
        }
}

