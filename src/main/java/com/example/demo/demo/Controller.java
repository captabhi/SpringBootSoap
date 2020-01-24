package com.example.demo.demo;

import com.example.demo.schemas.crip.TypeGetReportResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crif")
public class Controller {

    @Autowired Serve service;

    @PostMapping("/getReportByCHID")
    public TypeGetReportResponse getReportByCHID(@RequestBody CHIDRequest request) {
        return service.getReport(request);

    }
}
