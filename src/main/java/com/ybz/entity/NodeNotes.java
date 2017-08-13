package com.ybz.entity;

import java.io.Serializable;

/**
 * 所有记事字段
 *
 * @author zhangybt
 * @create 2017年08月13日 15:53
 **/
public class NodeNotes implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tenantId;

    private Integer travel;

    private Integer eating;

    private Integer gather;

    private Integer hotel;

    private Integer other;

    private Double travelMoney;

    private Double eatingMoney;

    private Double gatherMoney;

    private Double hotelMoney;

    private Double otherMoney;

    private Double totalMoney;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getTravel() {
        return travel;
    }

    public void setTravel(Integer travel) {
        this.travel = travel;
    }

    public Integer getEating() {
        return eating;
    }

    public void setEating(Integer eating) {
        this.eating = eating;
    }

    public Integer getGather() {
        return gather;
    }

    public void setGather(Integer gather) {
        this.gather = gather;
    }

    public Integer getHotel() {
        return hotel;
    }

    public void setHotel(Integer hotel) {
        this.hotel = hotel;
    }

    public Integer getOther() {
        return other;
    }

    public void setOther(Integer other) {
        this.other = other;
    }

    public Double getTravelMoney() {
        return travelMoney;
    }

    public void setTravelMoney(Double travelMoney) {
        this.travelMoney = travelMoney;
    }

    public Double getEatingMoney() {
        return eatingMoney;
    }

    public void setEatingMoney(Double eatingMoney) {
        this.eatingMoney = eatingMoney;
    }

    public Double getGatherMoney() {
        return gatherMoney;
    }

    public void setGatherMoney(Double gatherMoney) {
        this.gatherMoney = gatherMoney;
    }

    public Double getHotelMoney() {
        return hotelMoney;
    }

    public void setHotelMoney(Double hotelMoney) {
        this.hotelMoney = hotelMoney;
    }

    public Double getOtherMoney() {
        return otherMoney;
    }

    public void setOtherMoney(Double otherMoney) {
        this.otherMoney = otherMoney;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "NodeNotes{" +
                "tenantId='" + tenantId + '\'' +
                ", travel=" + travel +
                ", eating=" + eating +
                ", gather=" + gather +
                ", hotel=" + hotel +
                ", other=" + other +
                ", travelMoney=" + travelMoney +
                ", eatingMoney=" + eatingMoney +
                ", gatherMoney=" + gatherMoney +
                ", hotelMoney=" + hotelMoney +
                ", otherMoney=" + otherMoney +
                ", totalMoney=" + totalMoney +
                '}';
    }
}
