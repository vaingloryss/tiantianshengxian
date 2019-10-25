package com.vainglory.pojo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author vaingloryss
 * @date 2019/10/23 0023 下午 3:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Picture {
    private Integer id;
    private Integer goodsId;
    private String pathName;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date gmt_create;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date gmt_modified;
}
