package cn.fan.whale.mapper;

import cn.fan.whale.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    UserEntity selectByPrimaryKey(Integer userId);

    List<UserEntity> selectBySelective(UserEntity record);

    void updateByPrimaryKeySelective(UserEntity record);

    void deleteByPrimaryKey(Integer userId);
}
