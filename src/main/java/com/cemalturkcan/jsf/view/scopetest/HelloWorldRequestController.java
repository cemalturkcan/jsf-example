package com.cemalturkcan.jsf.view.scopetest;

import jakarta.inject.Named;
import lombok.Data;
import org.springframework.web.context.annotation.RequestScope;

import java.io.Serial;
import java.io.Serializable;

@Data
@Named("helloWorldRequest")
@RequestScope
public class HelloWorldRequestController implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String message = "Hello, World! RequestScoped!";

    public void changeMessage() {
        message = "RequestScoped message changed!";
    }
}
