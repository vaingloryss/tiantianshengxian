package com.vainglory.pojo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author vaingloryss
 * @date 2019/10/23 0023 上午 11:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private Integer id;
    private String name;
    private String model;
    private String popClass;
}
