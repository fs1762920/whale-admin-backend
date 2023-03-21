package cn.fan.whale.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResourceInfoEntity implements Serializable {

    private Integer infoId;

    private Double cpuRate;

    private Double memoRate;
}
