package edu.fdzc.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 商品DTO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    /**
     * 商品id
     */
    private String id;
    /**
     * 分类ID
     */
    private String categoryId;
    /**
     * 分类名称
     */
    private String categoryName;
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
