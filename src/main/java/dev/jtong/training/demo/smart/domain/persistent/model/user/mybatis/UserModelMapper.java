package dev.jtong.training.demo.smart.domain.persistent.model.user.mybatis;

import dev.jtong.training.demo.smart.domain.persistent.support.mybatis.IdHolder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserModelMapper {

    void insertUser(@Param("holder") IdHolder id, @Param("user") User user);

    User findUserById(String id);

    void deleteUserById(@Param("id")String id);

    List<User> findUsersAgeBiggerThan(@Param("from") int from,
                                      @Param("size") int size,
                                      @Param("ageBar") int ageBar);

    void updateUser( @Param("user")User user);

}
