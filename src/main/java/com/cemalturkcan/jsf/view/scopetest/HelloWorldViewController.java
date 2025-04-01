package com.cemalturkcan.jsf.view.scopetest;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Named("helloWorldView")
@ViewScoped
public class HelloWorldViewController implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String message = "Hello, World!";

    public void changeMessage() {
        message = "ViewScoped Changed!";
    }
}
