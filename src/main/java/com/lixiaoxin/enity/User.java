package com.lixiaoxin.enity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(User)实体类
 *
 * @author makejava
 * @since 2019-09-03 15:06:48
 */
@TableName(value = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User implements Serializable {
    private static final long serialVersionUID = 915478504870211231L;
    @TableId
    private Integer id;
    //账号
//    private String account;
    //用户名
    private String username;
    //用户密码
    private String password;
    //上一次登录时间
//    private Date lastLoginTime;
//    //账号是否可用。默认为1（可用）
//    private Boolean enabled;
//    //是否过期。默认为1（没有过期）
//    private Boolean accountNonExpired;
//    //账号是否锁定。默认为1（没有锁定）
//    private Boolean accountNonLocked;
//    //证书（密码）是否过期。默认为1（没有过期）
//    private Boolean credentialsNonExpired;
//    //创建时间
//    private Date createTime;
//    //修改时间
//    private Date updateTime;
//    //创建人
//    private Integer createUser;
//    //修改人
//    private Integer updateUser;

}