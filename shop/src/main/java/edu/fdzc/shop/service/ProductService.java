package edu.fdzc.shop.service;


import edu.fdzc.shop.dao.ProductMapper;
import edu.fdzc.shop.dto.CategoryDto;
import edu.fdzc.shop.dto.ProductDto;
import edu.fdzc.shop.entity.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private CategoryService categoryService;

    public boolean saveProduct(ProductDto productDto) {
        Product product = new Product();
        BeanUtils.copyProperties(productDto,product);
        product.setUpdateTime(new Date());
        return productMapper.insert(product)>0;
    }

    public List<ProductDto> search(ProductDto productDto) {
        Product product = new Product();
        BeanUtils.copyProperties(productDto,product);
        List<Product> productList = productMapper.filter(product);

        return productList.stream()
                .map(ProductService::convertDto)
                .collect(Collectors.toList());
    }

    public static ProductDto convertDto(Product product) {
        if(product != null) {
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(product,productDto);
            return productDto;
        }
        return null;
    }

    public ProductDto getProductById(String productId) {
        Product product = productMapper.findById(productId);
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product,productDto);
        CategoryDto categoryDto = categoryService.getCategoryById(productDto.getCategoryId());
        productDto.setCategoryName(categoryDto.getCategoryName());
        return productDto;
    }

    public boolean updateProduct(ProductDto productDto) {
        Product product = new Product();
        BeanUtils.copyProperties(productDto,product);
        product.setUpdateTime(new Date());
        return productMapper.update(product)>0;
    }

    public boolean delete(String productId) {
        return productMapper.delete(productId)>0;
    }
}
