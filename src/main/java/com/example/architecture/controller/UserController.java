package com.example.architecture.controller;

import com.example.architecture.request.UserRequest;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lichanglai
 * @date 2019/7/29 17:20
 */
@RestController
public class UserController {

    // 创建线程安全的Map
    static Map<Integer, UserRequest> users = Collections.synchronizedMap(new HashMap<Integer, UserRequest>());
}
