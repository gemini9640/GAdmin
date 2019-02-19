package com.gadmin.entity;

public class SYSButton {
    private String buttonId;

    private String name;

    private String qxName;

    private String bz;

    public SYSButton(String buttonId, String name, String qxName, String bz) {
        this.buttonId = buttonId;
        this.name = name;
        this.qxName = qxName;
        this.bz = bz;
    }

    public SYSButton() {
        super();
    }

    public String getButtonId() {
        return buttonId;
    }

    public void setButtonId(String buttonId) {
        this.buttonId = buttonId == null ? null : buttonId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getQxName() {
        return qxName;
    }

    public void setQxName(String qxName) {
        this.qxName = qxName == null ? null : qxName.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", buttonId=").append(buttonId);
        sb.append(", name=").append(name);
        sb.append(", qxName=").append(qxName);
        sb.append(", bz=").append(bz);
        sb.append("]");
        return sb.toString();
    }
}