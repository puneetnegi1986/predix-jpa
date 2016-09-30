package com.ge.predix.labs.data.jpa.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ge.predix.labs.data.jpa.domain.Invioce;
import com.ge.predix.labs.data.jpa.service.InvioceService;

@ComponentScan
@RestController
public class InvioceApiController {

    @Autowired  private InvioceService invoiceService;

    public static final String INVIOCE = "/invioce";
    public static final String SEARCH_INVOICE = "/searchInvioce";

    @RequestMapping(value = INVIOCE, method = RequestMethod.GET)
    public Collection<Invioce> invoice() throws Exception {
        Collection<Invioce> invioce = invoiceService.getAllInvioce();
        return invioce;
    }

}