package com.gadmin.generated.db;

public class SYSMenu {
    private Integer MENU_ID;

    private String MENU_NAME;

    private String MENU_URL;

    private String PARENT_ID;

    private String MENU_ORDER;

    private String MENU_ICON;

    private String MENU_TYPE;

    private Integer MENU_STATE;

    public SYSMenu(Integer MENU_ID, String MENU_NAME, String MENU_URL, String PARENT_ID, String MENU_ORDER, String MENU_ICON, String MENU_TYPE, Integer MENU_STATE) {
        this.MENU_ID = MENU_ID;
        this.MENU_NAME = MENU_NAME;
        this.MENU_URL = MENU_URL;
        this.PARENT_ID = PARENT_ID;
        this.MENU_ORDER = MENU_ORDER;
        this.MENU_ICON = MENU_ICON;
        this.MENU_TYPE = MENU_TYPE;
        this.MENU_STATE = MENU_STATE;
    }

    public SYSMenu() {
        super();
    }

    public Integer getMENU_ID() {
        return MENU_ID;
    }

    public void setMENU_ID(Integer MENU_ID) {
        this.MENU_ID = MENU_ID;
    }

    public String getMENU_NAME() {
        return MENU_NAME;
    }

    public void setMENU_NAME(String MENU_NAME) {
        this.MENU_NAME = MENU_NAME == null ? null : MENU_NAME.trim();
    }

    public String getMENU_URL() {
        return MENU_URL;
    }

    public void setMENU_URL(String MENU_URL) {
        this.MENU_URL = MENU_URL == null ? null : MENU_URL.trim();
    }

    public String getPARENT_ID() {
        return PARENT_ID;
    }

    public void setPARENT_ID(String PARENT_ID) {
        this.PARENT_ID = PARENT_ID == null ? null : PARENT_ID.trim();
    }

    public String getMENU_ORDER() {
        return MENU_ORDER;
    }

    public void setMENU_ORDER(String MENU_ORDER) {
        this.MENU_ORDER = MENU_ORDER == null ? null : MENU_ORDER.trim();
    }

    public String getMENU_ICON() {
        return MENU_ICON;
    }

    public void setMENU_ICON(String MENU_ICON) {
        this.MENU_ICON = MENU_ICON == null ? null : MENU_ICON.trim();
    }

    public String getMENU_TYPE() {
        return MENU_TYPE;
    }

    public void setMENU_TYPE(String MENU_TYPE) {
        this.MENU_TYPE = MENU_TYPE == null ? null : MENU_TYPE.trim();
    }

    public Integer getMENU_STATE() {
        return MENU_STATE;
    }

    public void setMENU_STATE(Integer MENU_STATE) {
        this.MENU_STATE = MENU_STATE;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", MENU_ID=").append(MENU_ID);
        sb.append(", MENU_NAME=").append(MENU_NAME);
        sb.append(", MENU_URL=").append(MENU_URL);
        sb.append(", PARENT_ID=").append(PARENT_ID);
        sb.append(", MENU_ORDER=").append(MENU_ORDER);
        sb.append(", MENU_ICON=").append(MENU_ICON);
        sb.append(", MENU_TYPE=").append(MENU_TYPE);
        sb.append(", MENU_STATE=").append(MENU_STATE);
        sb.append("]");
        return sb.toString();
    }
}