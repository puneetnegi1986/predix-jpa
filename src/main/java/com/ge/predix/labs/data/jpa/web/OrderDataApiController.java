package com.ge.predix.labs.data.jpa.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ge.predix.labs.data.jpa.domain.OrderData;
import com.ge.predix.labs.data.jpa.service.OrderDataService;

@ComponentScan
@RestController
public class OrderDataApiController {

    @Autowired  private OrderDataService orderDataService;

    public static final String ORDERDATA = "/OrderData";
    public static final String SEARCH_ORDERDATA = "/searchOrderData";

    @RequestMapping(value = SEARCH_ORDERDATA, method = RequestMethod.GET)
    public Collection<OrderData> orderData() throws Exception {
        Collection<OrderData> orderData = orderDataService.getAllOrderDatas();
        return orderData;
    }

}