package murach.backend.entity;

import java.io.Serializable;

public class Survey implements Serializable {
    private User user;
    private String heardFrom;
    private boolean wantsUpdates;
    private boolean emailOK;
    private String contactBy;

    public Survey() {
        this.user = null;
        this.heardFrom = "";
        this.wantsUpdates = false;
        this.emailOK = false;
        this.contactBy = "";
    }

    public Survey(User user, String heardFrom, boolean wantsUpdates, boolean emailOK, String contactBy) {
        this.user = user;
        this.heardFrom = heardFrom;
        this.wantsUpdates = wantsUpdates;
        this.emailOK = emailOK;
        this.contactBy = contactBy;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
