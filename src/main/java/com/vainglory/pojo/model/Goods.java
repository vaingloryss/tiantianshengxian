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
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private Integer id;
    private String name;
    private BigDecimal price;
    private String unit;
    private Integer category;
    private String Introduction;
    private String detailInfo;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date gmt_create;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date gmt_modified;
}
