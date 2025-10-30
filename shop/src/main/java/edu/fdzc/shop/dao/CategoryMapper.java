package edu.fdzc.shop.dao;

import edu.fdzc.shop.entity.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {
    /**
     * 新增商品分类
     * @param category
     * @return
     */
    int insert(Category category);

    /**
     * 修改商品分类
     * @param category
     * @return
     */
    int update(Category category);

    /**
     * 根据id获取分类信息
     * @param categoryId
     * @return
     */
    Category findById(String categoryId);

    /**
     * 根据id删除分类信息
     * @param categoryId
     * @return
     */
    int deleteById(String categoryId);
}
