package com.hsbc.chatbot.vo;

/**
 * Created by nicole on 2019/5/8.
 */
public class PolicyVO {
    private String chdrnum;
    private String contractType;
    private double premium;
    private String policyOwner;
    private String beneficiary;
    private String description;
    private double cashValue = 0;

    public PolicyVO(String chdrnum) {
        this.initChdrnum(chdrnum);
        this.chdrnum = chdrnum;
    }

    public PolicyVO() {
        init();
    }

    private void initChdrnum(String chdrnum) {
        this.init();
        this.chdrnum = chdrnum;
    }

    private void init() {
        this.chdrnum = "23658563";
        this.contractType = "LT6";
        this.premium = 1360;
        this.policyOwner = "Nicole Cao";
        this.beneficiary = "Nicole Cao";
        this.description = "policy detail...";
        this.cashValue = this.getCashValue();
    }

    public double getCashValue() {
        return this.premium * 0.8;
    }


    public String getChdrnum() {
        return chdrnum;
    }

    public void setChdrnum(String chdrnum) {
        this.chdrnum = chdrnum;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public String getPolicyOwner() {
        return policyOwner;
    }

    public void setPolicyOwner(String policyOwner) {
        this.policyOwner = policyOwner;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
    }
}
