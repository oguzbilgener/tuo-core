package co.uberdev.ultimateorganizer.core;

import java.util.ArrayList;

public class CoreUser extends Core
{
    // the email address of the user
    protected String emailAddress;
    // the plain password of the user (NEVER STORED)
    protected String password;
    // the encrypted password of the user (only stored on the server side)
    protected String passwordHashed;
    // the first name of the user
    protected String firstName;
    // the last name of the user
    protected String lastName;

    // the public key - a key to determine the identity of the user
    protected String publicKey;
    // the secret token - a token to authenticate and authorize the user. only sent once and stored both on the server side and the client side
    protected String secretToken;
    // will be a key when password is forgotten, it will be sent to the user to reset her password
    protected String resetKey;
    // amount of time user has, to submit resetKeydefi
    protected int resetDue;

    protected int state;

    // Some academic information about the user.
    // Stored at high level because we might need to search
    protected String schoolName;
    protected String departmentName;

    protected int created;
    protected int birthday;

    // the devices list of the user. stored as json array
    protected CoreDevices devices;

    public static final int STATE_BANNED = 0;
    public static final int STATE_USER = 1;
    public static final int STATE_ADMIN = 10;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordHashed() {
        return passwordHashed;
    }

    public void setPasswordHashed(String passwordHashed) {
        this.passwordHashed = passwordHashed;
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

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getSecretToken() {
        return secretToken;
    }

    public void setSecretToken(String secretToken) {
        this.secretToken = secretToken;
    }

    public String getResetKey() {
        return resetKey;
    }

    public void setResetKey(String resetKey) {
        this.resetKey = resetKey;
    }

    public int getResetDue() {
        return resetDue;
    }

    public void setResetDue(int resetDue) {
        this.resetDue = resetDue;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public CoreDevices getDevices() {
        return devices;
    }

    public void setDevices(CoreDevices devices) {
        this.devices = devices;
    }

    public void addDevice(CoreDevice device) {
        this.devices.add(device);
    }

}
