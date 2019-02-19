package com.gadmin.generated.db;

public class SYSRoleButton {
    private String RB_ID;

    private String ROLE_ID;

    private String BUTTON_ID;

    public SYSRoleButton(String RB_ID, String ROLE_ID, String BUTTON_ID) {
        this.RB_ID = RB_ID;
        this.ROLE_ID = ROLE_ID;
        this.BUTTON_ID = BUTTON_ID;
    }

    public SYSRoleButton() {
        super();
    }

    public String getRB_ID() {
        return RB_ID;
    }

    public void setRB_ID(String RB_ID) {
        this.RB_ID = RB_ID == null ? null : RB_ID.trim();
    }

    public String getROLE_ID() {
        return ROLE_ID;
    }

    public void setROLE_ID(String ROLE_ID) {
        this.ROLE_ID = ROLE_ID == null ? null : ROLE_ID.trim();
    }

    public String getBUTTON_ID() {
        return BUTTON_ID;
    }

    public void setBUTTON_ID(String BUTTON_ID) {
        this.BUTTON_ID = BUTTON_ID == null ? null : BUTTON_ID.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", RB_ID=").append(RB_ID);
        sb.append(", ROLE_ID=").append(ROLE_ID);
        sb.append(", BUTTON_ID=").append(BUTTON_ID);
        sb.append("]");
        return sb.toString();
    }
}