package edu.fdzc.shop.controller;

import edu.fdzc.shop.dto.ProductDto;
import edu.fdzc.shop.service.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Resource
    private ProductService productService;

    @GetMapping("/detail/{productId}")
    public ProductDto detail(@PathVariable("productId") String productId) {
        return productService.getProductById(productId);
    }

    @PostMapping("/add")
    public Boolean add(@RequestBody ProductDto productDto) {
        return productService.saveProduct(productDto);
    }

    @GetMapping("/search")
    public List<ProductDto> search(@RequestBody ProductDto productDto) {
        return productService.search(productDto);
    }

    @DeleteMapping("/delete/{productId}")
    public Boolean delete(@PathVariable("productId") String productId) {
        return productService.delete(productId);
    }
}
