package cn.fan.whale.mapper;

import cn.fan.whale.entity.RoleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {

    RoleEntity selectByPrimaryKey(Integer roleId);

    List<RoleEntity> selectBySelective(RoleEntity record);

    void updateByPrimaryKeySelective(RoleEntity record);

    void deleteByPrimaryKey(Integer roleId);
}
