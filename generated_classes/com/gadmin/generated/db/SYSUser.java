package com.gadmin.generated.db;

public class SYSUser {
    private String USER_ID;

    private String USERNAME;

    private String PASSWORD;

    private String NAME;

    private String RIGHTS;

    private String ROLE_ID;

    private String LAST_LOGIN;

    private String IP;

    private String STATUS;

    private String BZ;

    private String SKIN;

    private String EMAIL;

    private String NUMBER;

    private String PHONE;

    public SYSUser(String USER_ID, String USERNAME, String PASSWORD, String NAME, String RIGHTS, String ROLE_ID, String LAST_LOGIN, String IP, String STATUS, String BZ, String SKIN, String EMAIL, String NUMBER, String PHONE) {
        this.USER_ID = USER_ID;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
        this.NAME = NAME;
        this.RIGHTS = RIGHTS;
        this.ROLE_ID = ROLE_ID;
        this.LAST_LOGIN = LAST_LOGIN;
        this.IP = IP;
        this.STATUS = STATUS;
        this.BZ = BZ;
        this.SKIN = SKIN;
        this.EMAIL = EMAIL;
        this.NUMBER = NUMBER;
        this.PHONE = PHONE;
    }

    public SYSUser() {
        super();
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID == null ? null : USER_ID.trim();
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME == null ? null : USERNAME.trim();
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD == null ? null : PASSWORD.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getRIGHTS() {
        return RIGHTS;
    }

    public void setRIGHTS(String RIGHTS) {
        this.RIGHTS = RIGHTS == null ? null : RIGHTS.trim();
    }

    public String getROLE_ID() {
        return ROLE_ID;
    }

    public void setROLE_ID(String ROLE_ID) {
        this.ROLE_ID = ROLE_ID == null ? null : ROLE_ID.trim();
    }

    public String getLAST_LOGIN() {
        return LAST_LOGIN;
    }

    public void setLAST_LOGIN(String LAST_LOGIN) {
        this.LAST_LOGIN = LAST_LOGIN == null ? null : LAST_LOGIN.trim();
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP == null ? null : IP.trim();
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS == null ? null : STATUS.trim();
    }

    public String getBZ() {
        return BZ;
    }

    public void setBZ(String BZ) {
        this.BZ = BZ == null ? null : BZ.trim();
    }

    public String getSKIN() {
        return SKIN;
    }

    public void setSKIN(String SKIN) {
        this.SKIN = SKIN == null ? null : SKIN.trim();
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL == null ? null : EMAIL.trim();
    }

    public String getNUMBER() {
        return NUMBER;
    }

    public void setNUMBER(String NUMBER) {
        this.NUMBER = NUMBER == null ? null : NUMBER.trim();
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE == null ? null : PHONE.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", USER_ID=").append(USER_ID);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append(", PASSWORD=").append(PASSWORD);
        sb.append(", NAME=").append(NAME);
        sb.append(", RIGHTS=").append(RIGHTS);
        sb.append(", ROLE_ID=").append(ROLE_ID);
        sb.append(", LAST_LOGIN=").append(LAST_LOGIN);
        sb.append(", IP=").append(IP);
        sb.append(", STATUS=").append(STATUS);
        sb.append(", BZ=").append(BZ);
        sb.append(", SKIN=").append(SKIN);
        sb.append(", EMAIL=").append(EMAIL);
        sb.append(", NUMBER=").append(NUMBER);
        sb.append(", PHONE=").append(PHONE);
        sb.append("]");
        return sb.toString();
    }
}