package com.ge.predix.labs.data.jpa.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ge.predix.labs.data.jpa.domain.Po;

@ComponentScan
@RestController
public class PoApiController {

    @Autowired  private com.ge.predix.labs.data.jpa.service.PoService poService;

    public static final String PO = "/po";
    public static final String SEARCH_PO = "/searchPo";



    @RequestMapping(value = PO, method = RequestMethod.GET)
    public Collection<Po> suppliers() throws Exception {
        Collection<Po> po = poService.getAllPos();
        return po;
    }

}