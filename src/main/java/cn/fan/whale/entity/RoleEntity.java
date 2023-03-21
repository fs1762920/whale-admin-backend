package cn.fan.whale.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class RoleEntity implements Serializable {

    private Integer roleId;
    private String roleName;
    private String roleCode;
    private Integer state;
    private Date ctime;
    private Date mtime;
    private List<SourceEntity> sourceEntityList;
}
