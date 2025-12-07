package com.vipul.telegraf;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "newendpoint")
public class NewEndPoint {

    @ReadOperation
    public String getEndPointDetails() {
        return "Access New Provided Endpoint";
    }
}
