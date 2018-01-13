package com.taotao.manager.controller;

import com.taotao.manager.pojo.ItemCat;
import com.taotao.manager.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author gyx
 * @version 1.0
 * @description com.taotao.manager.controller
 * @date 2018/1/11
 */

@Controller
@RequestMapping("item/cat")
public class ItemCatController {

    @Autowired
    private ItemCatService itemCatService;

    /**
     * 分页查询商品类目  测试  访问路径是：http://localhost:8080/rest/query?page=1&rows=10   &&   http://manager.taotao.com/rest/query?page=1&rows=10
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("query")
    @ResponseBody
    public List<ItemCat> queryItemCatByPage(Integer page, Integer rows) {
        List<ItemCat> list = this.itemCatService.queryByPage(page, rows);
        return list;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<ItemCat> queryItemCatByParentId(@RequestParam(value = "id",defaultValue = "0") Long parentId){
        List<ItemCat> list = itemCatService.queryItemCatByParentId(parentId);
        return list;
    }

}
