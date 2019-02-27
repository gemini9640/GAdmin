package com.gadmin.entity;

public class SYSButton {
    private String BUTTON_ID;

    private String NAME;

    private String QX_NAME;

    private String BZ;

    public SYSButton(String BUTTON_ID, String NAME, String QX_NAME, String BZ) {
        this.BUTTON_ID = BUTTON_ID;
        this.NAME = NAME;
        this.QX_NAME = QX_NAME;
        this.BZ = BZ;
    }

    public SYSButton() {
        super();
    }

    public String getBUTTON_ID() {
        return BUTTON_ID;
    }

    public void setBUTTON_ID(String BUTTON_ID) {
        this.BUTTON_ID = BUTTON_ID == null ? null : BUTTON_ID.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getQX_NAME() {
        return QX_NAME;
    }

    public void setQX_NAME(String QX_NAME) {
        this.QX_NAME = QX_NAME == null ? null : QX_NAME.trim();
    }

    public String getBZ() {
        return BZ;
    }

    public void setBZ(String BZ) {
        this.BZ = BZ == null ? null : BZ.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", BUTTON_ID=").append(BUTTON_ID);
        sb.append(", NAME=").append(NAME);
        sb.append(", QX_NAME=").append(QX_NAME);
        sb.append(", BZ=").append(BZ);
        sb.append("]");
        return sb.toString();
    }
}