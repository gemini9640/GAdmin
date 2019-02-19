package com.gadmin.entity;

public class TBPictures {
    private String PICTURES_ID;

    private String TITLE;

    private String NAME;

    private String PATH;

    private String CREATETIME;

    private String MASTER_ID;

    private String BZ;

    private Integer ORDER_BY;

    public TBPictures(String PICTURES_ID, String TITLE, String NAME, String PATH, String CREATETIME, String MASTER_ID, String BZ, Integer ORDER_BY) {
        this.PICTURES_ID = PICTURES_ID;
        this.TITLE = TITLE;
        this.NAME = NAME;
        this.PATH = PATH;
        this.CREATETIME = CREATETIME;
        this.MASTER_ID = MASTER_ID;
        this.BZ = BZ;
        this.ORDER_BY = ORDER_BY;
    }

    public TBPictures() {
        super();
    }

    public String getPICTURES_ID() {
        return PICTURES_ID;
    }

    public void setPICTURES_ID(String PICTURES_ID) {
        this.PICTURES_ID = PICTURES_ID == null ? null : PICTURES_ID.trim();
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE == null ? null : TITLE.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getPATH() {
        return PATH;
    }

    public void setPATH(String PATH) {
        this.PATH = PATH == null ? null : PATH.trim();
    }

    public String getCREATETIME() {
        return CREATETIME;
    }

    public void setCREATETIME(String CREATETIME) {
        this.CREATETIME = CREATETIME == null ? null : CREATETIME.trim();
    }

    public String getMASTER_ID() {
        return MASTER_ID;
    }

    public void setMASTER_ID(String MASTER_ID) {
        this.MASTER_ID = MASTER_ID == null ? null : MASTER_ID.trim();
    }

    public String getBZ() {
        return BZ;
    }

    public void setBZ(String BZ) {
        this.BZ = BZ == null ? null : BZ.trim();
    }

    public Integer getORDER_BY() {
        return ORDER_BY;
    }

    public void setORDER_BY(Integer ORDER_BY) {
        this.ORDER_BY = ORDER_BY;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", PICTURES_ID=").append(PICTURES_ID);
        sb.append(", TITLE=").append(TITLE);
        sb.append(", NAME=").append(NAME);
        sb.append(", PATH=").append(PATH);
        sb.append(", CREATETIME=").append(CREATETIME);
        sb.append(", MASTER_ID=").append(MASTER_ID);
        sb.append(", BZ=").append(BZ);
        sb.append(", ORDER_BY=").append(ORDER_BY);
        sb.append("]");
        return sb.toString();
    }
}