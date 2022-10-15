package com.example.springboothello.List;

import lombok.Data;
public class Candidate {
    private String orgId;//我的目的是以这个orgId分类
    private String orgName;
    private String candidateId;

    public Candidate(){

    }

    public Candidate(String orgId, String candidateId, String orgName) {
        super();
        this.candidateId = candidateId;
        this.orgId = orgId;
        this.orgName = orgName;
    }


    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;

    }
}
