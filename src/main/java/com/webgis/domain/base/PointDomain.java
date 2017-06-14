package com.webgis.domain.base;

import com.webgis.enums.StatusEnum;
import com.webgis.utils.DateUtil;

import java.util.Date;
import java.util.List;

/**
 * Created by Justin on 2017/3/14.
 *
 * 点模型domain
 *
 */

public class PointDomain {

    private String url;
    private String id;
    private Long specialId;

    private double x;
    private double y;
    private double z;
    private StatusEnum status;

    private List<String> repairIds;

    public PointDomain() {
    }

    public PointDomain(double x, double y, double z, StatusEnum status, String url) {
        this.url = url;
        id = "";
        this.x = x;
        this.y = y;
        this.z = z;
        this.status = status;
        this.specialId = new Date().getTime();
    }

    public List<String> getRepairIds() {
        return repairIds;
    }

    public void setRepairIds(List<String> repairIds) {
        this.repairIds = repairIds;
    }

    public Long getSpecialId() {
        return specialId;
    }

    public void setSpecialId(Long specialId) {
        this.specialId = specialId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {return url;}

    public void setUrl(String url) {
        this.url = url;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PointDomain{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", status=" + status +
                '}';
    }
}
