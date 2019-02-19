package com.gadmin.entity;

public class SYSLoginimg {
    private String LOGINIMG_ID;

    private String NAME;

    private String FILEPATH;

    private Integer TYPE;

    private Integer FORDER;

    public SYSLoginimg(String LOGINIMG_ID, String NAME, String FILEPATH, Integer TYPE, Integer FORDER) {
        this.LOGINIMG_ID = LOGINIMG_ID;
        this.NAME = NAME;
        this.FILEPATH = FILEPATH;
        this.TYPE = TYPE;
        this.FORDER = FORDER;
    }

    public SYSLoginimg() {
        super();
    }

    public String getLOGINIMG_ID() {
        return LOGINIMG_ID;
    }

    public void setLOGINIMG_ID(String LOGINIMG_ID) {
        this.LOGINIMG_ID = LOGINIMG_ID == null ? null : LOGINIMG_ID.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getFILEPATH() {
        return FILEPATH;
    }

    public void setFILEPATH(String FILEPATH) {
        this.FILEPATH = FILEPATH == null ? null : FILEPATH.trim();
    }

    public Integer getTYPE() {
        return TYPE;
    }

    public void setTYPE(Integer TYPE) {
        this.TYPE = TYPE;
    }

    public Integer getFORDER() {
        return FORDER;
    }

    public void setFORDER(Integer FORDER) {
        this.FORDER = FORDER;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", LOGINIMG_ID=").append(LOGINIMG_ID);
        sb.append(", NAME=").append(NAME);
        sb.append(", FILEPATH=").append(FILEPATH);
        sb.append(", TYPE=").append(TYPE);
        sb.append(", FORDER=").append(FORDER);
        sb.append("]");
        return sb.toString();
    }
}