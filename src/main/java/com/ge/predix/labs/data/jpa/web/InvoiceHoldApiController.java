package com.ge.predix.labs.data.jpa.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ge.predix.labs.data.jpa.domain.InvoiceHold;
import com.ge.predix.labs.data.jpa.service.InvoiceHoldService;

@ComponentScan
@RestController
public class InvoiceHoldApiController {

    @Autowired  private InvoiceHoldService invoiceHoldService;

    public static final String INVOICEHOLD = "/invoiceHold";
    public static final String SEARCH_INVOICEHOLD = "/searchInvoiceHold";



    @RequestMapping(value = INVOICEHOLD, method = RequestMethod.GET)
    public Collection<InvoiceHold> invoiceHold() throws Exception {
        Collection<InvoiceHold> invoiceHold = invoiceHoldService.getAllInvoiceHold();
        return invoiceHold;
    }

}