package cn.fan.whale.mapper;

import cn.fan.whale.entity.SourceEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SourceMapper {

    SourceEntity selectByPrimaryKey(Integer sourceId);

    List<SourceEntity> selectBySelective(SourceEntity record);

    List<SourceEntity> selectByRoleId(Integer roleId);

    void insert(SourceEntity record);

    void updateByPrimaryKeySelective(SourceEntity record);

    void deleteByPrimaryKey(Integer sourceId);
}
