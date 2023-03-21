package cn.fan.whale.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserEntity implements Serializable {
    private Integer userId;
    private String username;
    private String password;
    private String nickName;
    private String mail;
    private String phone;
    private Integer state;
    private Integer roleId;
    private String avatarPath;
    private Date ctime;
    private Date mtime;
    private Date lastLoginTime;
    private RoleEntity roleEntity;
}
