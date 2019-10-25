package com.vainglory.pojo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author vaingloryss
 * @date 2019/10/23 0023 下午 3:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryModel {
    private Integer id;
    private String modelTitle;
    private String childCategory;
    private Integer modelCover;
}
