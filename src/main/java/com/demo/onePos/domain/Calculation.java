package com.demo.onePos.domain;

import java.util.Date;

import javax.persistence.*;

import javax.persistence.Id;


@Entity
public class Calculation {

    @Id @GeneratedValue
    int payNumber;
    
    int orderNumber;
    String storeNm;
    int price;
    int storeId;
    String payTool;
    Date payDate;
    CalculationStatus status ;
    int tableNm;

    public int getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getStoreNm() {
        return storeNm;
    }
    public void setStoreNm(String storeNm) {
        this.storeNm = storeNm;
    }

    public int getTableNm() {
        return tableNm;
    }
    public void setTableNm(int tableNm) {
        this.tableNm = tableNm;
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

    public CalculationStatus getStatus() {
        return status;
    }
    public void setStatus(CalculationStatus status) {
        this.status = status;
    }

    public String getPayTool() {
        return payTool;
    }
    public void setPayTool(String payTool) {
        this.payTool = payTool;
    }
    public Date getpayDate() {
        return payDate;
    }
    public void setpayDate(Date payDate) {
        this.payDate = payDate;
    }

    
}
