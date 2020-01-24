package com.example.demo.demo;

import com.example.demo.schemas.crip.TypeGetReportRequest;
import com.example.demo.schemas.crip.TypeGetReportResponse;

public class Client extends BaseClient {

    public TypeGetReportResponse getReportResponse (TypeGetReportRequest reportRequest)
    {
        Object result = callWebService(reportRequest);
        return (TypeGetReportResponse) result;
    }
}
