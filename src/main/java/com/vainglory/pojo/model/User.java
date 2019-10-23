package com.vainglory.pojo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author vaingloryss
 * @date 2019/10/21 0021 下午 8:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date gmtCreate;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date gmtModified;
    private String salt;
}
