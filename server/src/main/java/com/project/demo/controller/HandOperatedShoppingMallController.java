package com.project.demo.controller;

import com.project.demo.entity.HandOperatedShoppingMall;
import com.project.demo.service.HandOperatedShoppingMallService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;


/**
 * 手办商城：(HandOperatedShoppingMall)表控制层
 *
 */
@RestController
@RequestMapping("/hand_operated_shopping_mall")
public class HandOperatedShoppingMallController extends BaseController<HandOperatedShoppingMall, HandOperatedShoppingMallService> {

    /**
     * 手办商城对象
     */
    @Autowired
    public HandOperatedShoppingMallController(HandOperatedShoppingMallService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
