package edu.fdzc.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 商品实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product extends AbstractEntity{
    /**
     * 分类ID
     */
    private String categoryId;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品描述
     */
    private String description;
    /**
     * 商品详情
     */
    private String detail;
    /**
     * 商品价格
     */
    private BigDecimal price;
    /**
     * 库存数量
     */
    private Long stockCount;

}
