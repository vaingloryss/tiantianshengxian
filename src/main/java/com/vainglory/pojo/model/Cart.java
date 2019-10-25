package com.vainglory.pojo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author vaingloryss
 * @date 2019/10/25 0025 上午 8:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    private Integer id;
    private Integer goodsId;
    private Integer goodsNum;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date gmt_create;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date gmt_modified;
    private Integer userId;
}
