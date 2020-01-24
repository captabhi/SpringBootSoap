package com.example.demo.demo;

import com.example.demo.schemas.crip.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Serve {

    @Autowired
    private Client client;

    public TypeGetReportResponse getReport(CHIDRequest request){

        TypeGetReportRequest xmlRequest = new TypeGetReportRequest();

        IdentityDescriptor identityDescriptor = new IdentityDescriptor();
        identityDescriptor.setUserName("CRS_SHARD_GROUP_AG");
        identityDescriptor.setPassword("V!y$@aL6XNkV");
        xmlRequest.setIdentityDescriptor(identityDescriptor);

        xmlRequest.setTargetReportFormat(TargetReportFormat.NONE);
        xmlRequest.setReportType("CREDIT_CHECK_BUSINESS");

        xmlRequest.setReferenceNumber("12345");

        Control control = new Control();
        control.setMajorVersion(1);
        control.setMinorVersion(0);
        xmlRequest.setControl(control);

        Identifier identifier = new Identifier();
        identifier.setIdentifierType(IdentifierType.CH_UID);
        identifier.setIdentifierText("CH02030445415");
        xmlRequest.setIdentifier(identifier);

        System.out.println("Running1");

        TypeGetReportResponse response = client.getReportResponse(xmlRequest);
        System.out.println(response.getReport());

        return response;


    }
}
