
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) obj;
        if (this.country != compared.country) {
            return false;
        }

        if (this.regCode != compared.regCode) {
            return false;
        }
        return true; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        if (this.regCode == null) {
            return -1;
        }
        return this.regCode.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
}
