package assignment1;
import java.util.Objects;

/**
 * Simple class for address of assignment 1
 * @author maria ramlochan
 */
public class Address {

    //Data members
    private String street;
    private int streetNum;
    private String city;
    private String zipCode;
    
    /**
     * Default constructor 
     */
    public Address() {
        this.street = "";
        this.streetNum = 0;
        this.city = "";
        this.zipCode = "";
    }
    
    /**
     * Constructor with street, street number, city and zip code
     * @param street the street name of an address
     * @param streetNum the number of an address
     * @param city the city of an address
     * @param zipCode the zip code of an address
     */
    public Address (String street, int streetNum, String city, String zipCode) {
        this.street = street;
        this.streetNum = streetNum;
        this.city = city;
        this.zipCode = zipCode;
    }
    
    /**
     * Method to verify if street number is valid
     * @param streetNum the street number
     * @return true if the conditions are not false
     */
    public boolean isStreetNumValid(int streetNum) {
        boolean isStreetNumValid;
        if (this.streetNum > 0 && this.streetNum < 99999)
            isStreetNumValid = true;
        else
            isStreetNumValid = false;
            
        return isStreetNumValid;
    }
    
    /**
     * Method to verify if the city is valid
     * @return true if the conditions are not false
     */
    public boolean isCityValid() {
        boolean isCityValid = true;
        for (int i = 0; i < city.length(); i++) {
            if (Character.isSpaceChar(city.charAt(i)) || city.charAt(i) == '-' ||
                     Character.isLetter(city.charAt(i))) 
               isCityValid = true; 
            else 
               isCityValid = false; 
        }
        return isCityValid;

    }
    
    /**
     * Method to verify if the zip code is valid
     * @param zipCode
     * @return true if the conditions are not false
     */
    public boolean isZipCodeValid(String zipCode) {
//        for(int i = 0; i < zipCode.length(); i++){
//            if(zipCode.charAt(i) >= 'a' && zipCode.charAt(i) <= 'z') 
//                if(zipCode.charAt(i+1) == 1) 
//                    continue;
//                else 
//                    break;          
//            i += 1;
//        }
//        return true;
    
        boolean isZipCodeValid = true;
	String pattern = "^(?!.*[DFIOQU])[A-VXY][0-9][A-Z] ?[0-9][A-Z][0-9]$";
        if(zipCode.matches(pattern))
            isZipCodeValid = true;
	else
            isZipCodeValid = false;
        
	return isZipCodeValid;
    }
    
    /**
     * Method to convert every word in a string to title case
     * @param str
     * @return 
     */
    public String toTitleCase(String str) {
        StringBuilder converted = new StringBuilder();
        
        boolean convertNext = true;
        for (char ch : str.toCharArray()) {
            if (Character.isSpaceChar(ch)) {
                convertNext = true;
            } else if (convertNext) {
                ch = Character.toTitleCase(ch);
                convertNext = false;
            } else {
                ch = Character.toLowerCase(ch);
            }
            converted.append(ch);
        }
        return converted.toString();
    }
    
    public boolean equals(Address address) {
        if (this == address) {
            return true;
        }
        if (address == null) {
            return false;
        }
        if (getClass() != address.getClass()) {
            return false;
        }
        final Address other = (Address) address;
        if (this.streetNum != other.streetNum) {
            return false;
        }
        if (!Objects.equals(this.street, other.street)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.zipCode, other.zipCode)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return String.format("\nStreet: %s\nStreen Number: %s\nCity: %s\nZip Code:"
                + " %s", toTitleCase(street), streetNum, toTitleCase(city), zipCode);
    }
    
    //Getters
    public String getStreet() {
        return street;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }
    
    //Setters
    public void setStreet(String street) {
        this.street = street;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
}