package murach.backend.entity;

import java.io.Serializable;

public class Survey implements Serializable {
    private String heardFrom;
    private boolean wantsUpdates;
    private boolean emailOK;
    private String contactBy;
    private User user;

    public Survey() {
        this.heardFrom = "";
        this.wantsUpdates = false;
        this.emailOK = false;
        this.contactBy = "";
        this.user = null;
    }

    public Survey(User user, String heardFrom, boolean wantsUpdates, boolean emailOK, String contactBy) {
        this.user = user;
        this.heardFrom = heardFrom;
        this.wantsUpdates = wantsUpdates;
        this.emailOK = emailOK;
        this.contactBy = contactBy;
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