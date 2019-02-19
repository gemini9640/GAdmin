package com.gadmin.generated.db;

public class ERPCustomerimg {
    private String CUSTOMERIMG_ID;

    private String CDESCRIPTION;

    private String CTIME;

    private String CUSTOMER_ID;

    public ERPCustomerimg(String CUSTOMERIMG_ID, String CDESCRIPTION, String CTIME, String CUSTOMER_ID) {
        this.CUSTOMERIMG_ID = CUSTOMERIMG_ID;
        this.CDESCRIPTION = CDESCRIPTION;
        this.CTIME = CTIME;
        this.CUSTOMER_ID = CUSTOMER_ID;
    }

    public ERPCustomerimg() {
        super();
    }

    public String getCUSTOMERIMG_ID() {
        return CUSTOMERIMG_ID;
    }

    public void setCUSTOMERIMG_ID(String CUSTOMERIMG_ID) {
        this.CUSTOMERIMG_ID = CUSTOMERIMG_ID == null ? null : CUSTOMERIMG_ID.trim();
    }

    public String getCDESCRIPTION() {
        return CDESCRIPTION;
    }

    public void setCDESCRIPTION(String CDESCRIPTION) {
        this.CDESCRIPTION = CDESCRIPTION == null ? null : CDESCRIPTION.trim();
    }

    public String getCTIME() {
        return CTIME;
    }

    public void setCTIME(String CTIME) {
        this.CTIME = CTIME == null ? null : CTIME.trim();
    }

    public String getCUSTOMER_ID() {
        return CUSTOMER_ID;
    }

    public void setCUSTOMER_ID(String CUSTOMER_ID) {
        this.CUSTOMER_ID = CUSTOMER_ID == null ? null : CUSTOMER_ID.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", CUSTOMERIMG_ID=").append(CUSTOMERIMG_ID);
        sb.append(", CDESCRIPTION=").append(CDESCRIPTION);
        sb.append(", CTIME=").append(CTIME);
        sb.append(", CUSTOMER_ID=").append(CUSTOMER_ID);
        sb.append("]");
        return sb.toString();
    }
}