package com.taotao.manager.service;

import com.taotao.manager.pojo.ItemCat;

import java.util.List;


/**
 * 分页工具
 */
public interface ItemCatService extends BaseService<ItemCat>{


    /**
     * 商品类目的查询
     * @param parentId
     * @return
     */
    List<ItemCat> queryItemCatByParentId(Long parentId);
}
