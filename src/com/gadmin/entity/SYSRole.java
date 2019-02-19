package com.gadmin.entity;

public class SYSRole {
    private String ROLE_ID;

    private String ROLE_NAME;

    private String RIGHTS;

    private String PARENT_ID;

    private String ADD_QX;

    private String DEL_QX;

    private String EDIT_QX;

    private String CHA_QX;

    public SYSRole(String ROLE_ID, String ROLE_NAME, String RIGHTS, String PARENT_ID, String ADD_QX, String DEL_QX, String EDIT_QX, String CHA_QX) {
        this.ROLE_ID = ROLE_ID;
        this.ROLE_NAME = ROLE_NAME;
        this.RIGHTS = RIGHTS;
        this.PARENT_ID = PARENT_ID;
        this.ADD_QX = ADD_QX;
        this.DEL_QX = DEL_QX;
        this.EDIT_QX = EDIT_QX;
        this.CHA_QX = CHA_QX;
    }

    public SYSRole() {
        super();
    }

    public String getROLE_ID() {
        return ROLE_ID;
    }

    public void setROLE_ID(String ROLE_ID) {
        this.ROLE_ID = ROLE_ID == null ? null : ROLE_ID.trim();
    }

    public String getROLE_NAME() {
        return ROLE_NAME;
    }

    public void setROLE_NAME(String ROLE_NAME) {
        this.ROLE_NAME = ROLE_NAME == null ? null : ROLE_NAME.trim();
    }

    public String getRIGHTS() {
        return RIGHTS;
    }

    public void setRIGHTS(String RIGHTS) {
        this.RIGHTS = RIGHTS == null ? null : RIGHTS.trim();
    }

    public String getPARENT_ID() {
        return PARENT_ID;
    }

    public void setPARENT_ID(String PARENT_ID) {
        this.PARENT_ID = PARENT_ID == null ? null : PARENT_ID.trim();
    }

    public String getADD_QX() {
        return ADD_QX;
    }

    public void setADD_QX(String ADD_QX) {
        this.ADD_QX = ADD_QX == null ? null : ADD_QX.trim();
    }

    public String getDEL_QX() {
        return DEL_QX;
    }

    public void setDEL_QX(String DEL_QX) {
        this.DEL_QX = DEL_QX == null ? null : DEL_QX.trim();
    }

    public String getEDIT_QX() {
        return EDIT_QX;
    }

    public void setEDIT_QX(String EDIT_QX) {
        this.EDIT_QX = EDIT_QX == null ? null : EDIT_QX.trim();
    }

    public String getCHA_QX() {
        return CHA_QX;
    }

    public void setCHA_QX(String CHA_QX) {
        this.CHA_QX = CHA_QX == null ? null : CHA_QX.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ROLE_ID=").append(ROLE_ID);
        sb.append(", ROLE_NAME=").append(ROLE_NAME);
        sb.append(", RIGHTS=").append(RIGHTS);
        sb.append(", PARENT_ID=").append(PARENT_ID);
        sb.append(", ADD_QX=").append(ADD_QX);
        sb.append(", DEL_QX=").append(DEL_QX);
        sb.append(", EDIT_QX=").append(EDIT_QX);
        sb.append(", CHA_QX=").append(CHA_QX);
        sb.append("]");
        return sb.toString();
    }
}