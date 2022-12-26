public class Passport {

    private long numPassport;
    private String lastName;
    private String firstName;
    private String midName;
    private String dateOfBirth;

    public Passport(long numPassport, String lastName, String firstName, String midName, String dateOfBirth) {
        this.numPassport = numPassport;
        this.lastName = lastName;
        this.firstName = firstName;
        this.midName = midName;
        this.dateOfBirth = dateOfBirth;
    }

    public long getNumPassport() {
        return numPassport;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMidName() {
        return midName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Список паспортов: " +
                "\nНомер паспорта - " + numPassport +
                "\nФамилия - " + lastName +
                "\nИмя - " + firstName +
                "\nОтчество - " + midName +
                "\nДата рождения - " + dateOfBirth;
    }
}
