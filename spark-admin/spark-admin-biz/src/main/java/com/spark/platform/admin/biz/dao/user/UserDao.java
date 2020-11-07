package com.spark.platform.admin.biz.dao.user;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.spark.platform.admin.api.entity.user.User;
import com.spark.platform.admin.api.vo.UserExcelVo;
import com.spark.platform.admin.api.vo.UserVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: wangdingfeng
 * @ProjectName: spark-platform
 * @Package: com.spark.platform.adminbiz.dao.user
 * @ClassName: UserDao
 * @Description:
 * @Version: 1.0
 */
public interface UserDao extends BaseMapper<User> {

    /**
     * 根据用户名称查询用户
     * @param username 用户名称
     * @return User
     */
    UserVo findByUserName(@Param(value = "username") String username);

    /**
     * 根据用户id查询用户
     * @param userId 用户id
     * @return User
     */
    User findByUserId(@Param(value = "userId") Long userId);

    /**
     * 通过角色id查询用户
     * @return
     */
    @Select("SELECT u.* FROM sys_user u JOIN sys_user_role ur ON u.id=ur.user_id WHERE ur.role_id=#{roleId}")
    List<User> findUsersByRoleId(@Param(value = "roleId")Long roleId);

    /**
     * 导出excel
     * @param wrapper 查询条件
     * @return
     */
    List<UserExcelVo> export(@Param(Constants.WRAPPER) Wrapper wrapper);
}
