package cn.fan.whale.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class RoleSourceMidEntity implements Serializable {

    private Integer mId;
    private Integer roleId;
    private Integer sourceId;
    private Date ctime;
    private Date mtime;
}
