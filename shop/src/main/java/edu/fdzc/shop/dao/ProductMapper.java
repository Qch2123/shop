package edu.fdzc.shop.dao;

import edu.fdzc.shop.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 商品Mapper
 */
@Mapper
public interface ProductMapper {
    /**
     * 插入商品
     * @param product
     * @return
     */
    int insert(Product product);

    /**
     * 查询商品
     * @param product
     * @return
     */
    List<Product> filter(Product product);

    /**
     * 根据id查询商品
     * @param productId
     * @return
     */
    Product findById(String productId);

    /**
     * 更新商品
     * @param product
     * @return
     */
    int update(Product product);


    /**
     * 删除商品
     * @param productId
     * @return
     */
    int delete(String productId);
}
