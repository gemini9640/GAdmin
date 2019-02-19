package com.gadmin.generated.db;

public class DBtimingbackup {
    private String TIMINGBACKUP_ID;

    private String JOBNAME;

    private String CREATE_TIME;

    private String TABLENAME;

    private Integer STATUS;

    private String FHTIME;

    private String TIMEEXPLAIN;

    private String BZ;

    public DBtimingbackup(String TIMINGBACKUP_ID, String JOBNAME, String CREATE_TIME, String TABLENAME, Integer STATUS, String FHTIME, String TIMEEXPLAIN, String BZ) {
        this.TIMINGBACKUP_ID = TIMINGBACKUP_ID;
        this.JOBNAME = JOBNAME;
        this.CREATE_TIME = CREATE_TIME;
        this.TABLENAME = TABLENAME;
        this.STATUS = STATUS;
        this.FHTIME = FHTIME;
        this.TIMEEXPLAIN = TIMEEXPLAIN;
        this.BZ = BZ;
    }

    public DBtimingbackup() {
        super();
    }

    public String getTIMINGBACKUP_ID() {
        return TIMINGBACKUP_ID;
    }

    public void setTIMINGBACKUP_ID(String TIMINGBACKUP_ID) {
        this.TIMINGBACKUP_ID = TIMINGBACKUP_ID == null ? null : TIMINGBACKUP_ID.trim();
    }

    public String getJOBNAME() {
        return JOBNAME;
    }

    public void setJOBNAME(String JOBNAME) {
        this.JOBNAME = JOBNAME == null ? null : JOBNAME.trim();
    }

    public String getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(String CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME == null ? null : CREATE_TIME.trim();
    }

    public String getTABLENAME() {
        return TABLENAME;
    }

    public void setTABLENAME(String TABLENAME) {
        this.TABLENAME = TABLENAME == null ? null : TABLENAME.trim();
    }

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
    }

    public String getFHTIME() {
        return FHTIME;
    }

    public void setFHTIME(String FHTIME) {
        this.FHTIME = FHTIME == null ? null : FHTIME.trim();
    }

    public String getTIMEEXPLAIN() {
        return TIMEEXPLAIN;
    }

    public void setTIMEEXPLAIN(String TIMEEXPLAIN) {
        this.TIMEEXPLAIN = TIMEEXPLAIN == null ? null : TIMEEXPLAIN.trim();
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
        sb.append(", TIMINGBACKUP_ID=").append(TIMINGBACKUP_ID);
        sb.append(", JOBNAME=").append(JOBNAME);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", TABLENAME=").append(TABLENAME);
        sb.append(", STATUS=").append(STATUS);
        sb.append(", FHTIME=").append(FHTIME);
        sb.append(", TIMEEXPLAIN=").append(TIMEEXPLAIN);
        sb.append(", BZ=").append(BZ);
        sb.append("]");
        return sb.toString();
    }
}