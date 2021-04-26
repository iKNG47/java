package model;

public class Patient {
    private String firstName;
    private String lastName;
    private String personalIdentityNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalIdentityNumber() {
        return personalIdentityNumber;
    }

    public void setPersonalIdentityNumber(String personalIdentityNumber) {
        this.personalIdentityNumber = personalIdentityNumber;
    }
     public Patient(String firstName, String lastName, String personalIdentityNumber){

        this.firstName = firstName;
        this.lastName = lastName;
        this.personalIdentityNumber = personalIdentityNumber;
    }
}
