package com.ssm.blog.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 二级域名
 * @author: kangyong
 * @date: 2019/7/28 18:25
 * @version: v1.0
 */
@Data
public class DomainSecond {
    private Long id;

    private String domainName;

    private Long firstDomainId;

    private Integer isUsed;

    private Date createTime;

    private Date updateTime;

}