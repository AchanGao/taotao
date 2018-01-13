package com.taotao.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.taotao.manager.mapper.ItemCatMapper;
import com.taotao.manager.pojo.ItemCat;
import com.taotao.manager.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gyx
 * @version 1.0
 * @description com.taotao.manager.service.impl
 * @date 2018/1/12
 */
@Service
public class ItemCatServiceImpl extends BaseServiceImpl<ItemCat> implements ItemCatService{

    /**
     * 查询类目 的ID 传值
     * @param
     * @return
     */
    @Override
    public List<ItemCat> queryItemCatByParentId(Long parentId) {
        ItemCat itemCat = new ItemCat();
        itemCat.setParentId(parentId);

        List<ItemCat> list = super.queryListByWhere(itemCat);
        return list;
    }


  /*  @Autowired
    private ItemCatMapper itemCatMapper;

    @Override
    public List<ItemCat> pageQuery(Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        List<ItemCat> list = itemCatMapper.select(null);
        return list;
    }*/
}
