package com.dkd.app.domain.vo;

import lombok.Data;

@Data
public class LoginVo {
    private Integer userId;  //用户id
    private String userName; //用户名
    private String roleCode; //角色编码
    private String token; //jwt令牌
    private boolean success=false;  //是否成功
    private String regionId; //地域id
    private String msg; //返回信息
    /**
     * 是否是运维人员
     */
    private boolean isRepair; //是否是运维人员
}
