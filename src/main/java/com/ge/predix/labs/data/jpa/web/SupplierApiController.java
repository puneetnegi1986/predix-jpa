package com.ge.predix.labs.data.jpa.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ge.predix.labs.data.jpa.domain.ProductData;
import com.ge.predix.labs.data.jpa.service.ProductService;

@ComponentScan
@RestController
public class SupplierApiController {

    @Autowired  private ProductService productDataService;

    public static final String PRODUCTDATA = "/productData";
    public static final String SEARCH_PRODUCTDATA = "/searchProductData";



    @RequestMapping(value = PRODUCTDATA, method = RequestMethod.GET)
    public Collection<ProductData> productData() throws Exception {
        Collection<ProductData> productData = productDataService.getAllProduct();
        return productData;
    }

}