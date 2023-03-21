package cn.fan.whale.mapper;

import cn.fan.whale.entity.RoleSourceMidEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleSourceMidMapper {

    void insertBatch(List<RoleSourceMidEntity> records);

    void deleteByRoleId(Integer roleId);

}
