package com.example.architecture.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * @author lichanglai
 * @date 2019/7/29 17:21
 */
@Data
public class UserRequest implements Serializable {

    private int id;
    private String username;
    private int age;
    private Date ctm;
}
