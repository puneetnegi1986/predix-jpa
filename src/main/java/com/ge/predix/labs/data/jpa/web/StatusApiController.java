package com.ge.predix.labs.data.jpa.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ge.predix.labs.data.jpa.domain.Status;
import com.ge.predix.labs.data.jpa.service.StatusService;

@ComponentScan
@RestController
public class StatusApiController {

    @Autowired  private StatusService statusService;

    public static final String STATUS = "/status";
    public static final String SEARCH_STATUS = "/searchStatus";



    @RequestMapping(value = STATUS, method = RequestMethod.GET)
    public Collection<Status> status() throws Exception {
        Collection<Status> status = statusService.getAllStatus();
        return status;
    }

}