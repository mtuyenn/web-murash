package murach.backend.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dateOfBirth;
    private String heardFrom;
    private boolean wantsUpdates;
    private boolean emailOK;
    private String contactBy;

    public User() {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.dateOfBirth = null;
        this.heardFrom = "";
        this.wantsUpdates = false;
        this.emailOK = false;
        this.contactBy = "";
    }

    public User(String firstName, String lastName, String email, LocalDate dateOfBirth, 
                String heardFrom, boolean wantsUpdates, boolean emailOK, String contactBy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.heardFrom = heardFrom;
        this.wantsUpdates = wantsUpdates;
        this.emailOK = emailOK;
        this.contactBy = contactBy;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHeardFrom() {
        return heardFrom;
    }

    public void setHeardFrom(String heardFrom) {
        this.heardFrom = heardFrom;
    }

    public boolean isWantsUpdates() {
        return wantsUpdates;
    }

    public void setWantsUpdates(boolean wantsUpdates) {
        this.wantsUpdates = wantsUpdates;
    }

    public boolean isEmailOK() {
        return emailOK;
    }

    public void setEmailOK(boolean emailOK) {
        this.emailOK = emailOK;
    }

    public String getContactBy() {
        return contactBy;
    }

    public void setContactBy(String contactBy) {
        this.contactBy = contactBy;
    }
}
