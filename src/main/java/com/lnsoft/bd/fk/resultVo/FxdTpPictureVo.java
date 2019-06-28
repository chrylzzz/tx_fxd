package com.lnsoft.bd.fk.resultVo;

import java.util.Date;

public class FxdTpPictureVo {


        private String fxid;
        private String tpName;
        private String wjms;
        private Date sj;
        private String sfdc;
        private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFxid() {
        return fxid;
    }

    public void setFxid(String fxid) {
        this.fxid = fxid;
    }

    public String getTpName() {
        return tpName;
    }

    public void setTpName(String tpName) {
        this.tpName = tpName;
    }

    public String getWjms() {
        return wjms;
    }

    public void setWjms(String wjms) {
        this.wjms = wjms;
    }

    public Date getSj() {
        return sj;
    }

    public void setSj(Date sj) {
        this.sj = sj;
    }

    public String getSfdc() {
        return sfdc;
    }

    public void setSfdc(String sfdc) {
        this.sfdc = sfdc;
    }
}
