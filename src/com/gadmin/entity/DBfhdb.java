package com.gadmin.entity;

public class DBfhdb {
    private String FHDB_ID;

    private String USERNAME;

    private String BACKUP_TIME;

    private String TABLENAME;

    private String SQLPATH;

    private Integer TYPE;

    private String DBSIZE;

    private String BZ;

    public DBfhdb(String FHDB_ID, String USERNAME, String BACKUP_TIME, String TABLENAME, String SQLPATH, Integer TYPE, String DBSIZE, String BZ) {
        this.FHDB_ID = FHDB_ID;
        this.USERNAME = USERNAME;
        this.BACKUP_TIME = BACKUP_TIME;
        this.TABLENAME = TABLENAME;
        this.SQLPATH = SQLPATH;
        this.TYPE = TYPE;
        this.DBSIZE = DBSIZE;
        this.BZ = BZ;
    }

    public DBfhdb() {
        super();
    }

    public String getFHDB_ID() {
        return FHDB_ID;
    }

    public void setFHDB_ID(String FHDB_ID) {
        this.FHDB_ID = FHDB_ID == null ? null : FHDB_ID.trim();
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME == null ? null : USERNAME.trim();
    }

    public String getBACKUP_TIME() {
        return BACKUP_TIME;
    }

    public void setBACKUP_TIME(String BACKUP_TIME) {
        this.BACKUP_TIME = BACKUP_TIME == null ? null : BACKUP_TIME.trim();
    }

    public String getTABLENAME() {
        return TABLENAME;
    }

    public void setTABLENAME(String TABLENAME) {
        this.TABLENAME = TABLENAME == null ? null : TABLENAME.trim();
    }

    public String getSQLPATH() {
        return SQLPATH;
    }

    public void setSQLPATH(String SQLPATH) {
        this.SQLPATH = SQLPATH == null ? null : SQLPATH.trim();
    }

    public Integer getTYPE() {
        return TYPE;
    }

    public void setTYPE(Integer TYPE) {
        this.TYPE = TYPE;
    }

    public String getDBSIZE() {
        return DBSIZE;
    }

    public void setDBSIZE(String DBSIZE) {
        this.DBSIZE = DBSIZE == null ? null : DBSIZE.trim();
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
        sb.append(", FHDB_ID=").append(FHDB_ID);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append(", BACKUP_TIME=").append(BACKUP_TIME);
        sb.append(", TABLENAME=").append(TABLENAME);
        sb.append(", SQLPATH=").append(SQLPATH);
        sb.append(", TYPE=").append(TYPE);
        sb.append(", DBSIZE=").append(DBSIZE);
        sb.append(", BZ=").append(BZ);
        sb.append("]");
        return sb.toString();
    }
}