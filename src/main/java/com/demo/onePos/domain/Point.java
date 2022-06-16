package com.demo.onePos.domain;

import java.util.Date;

import javax.persistence.*;

import javax.persistence.Id;

@Entity
public class Point {

    @Id @GeneratedValue
    int pointId;

    int price ;
    int storeId;
    String storeNm;
    String customerPhoneNumber;
    Date sysDate;

    public int getPointId() {
        return pointId;
    }
    public void setPointId(int pointId) {
        this.pointId = pointId;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getStoreId() {
        return storeId;
    }
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
    public String getStoreNm() {
        return storeNm;
    }
    public void setStoreNm(String storeNm) {
        this.storeNm = storeNm;
    }
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public Date getSysDate() {
        return sysDate;
    }
    public void setSysDate(Date sysDate) {
        this.sysDate = sysDate;
    }

    
}
