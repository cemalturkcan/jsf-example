package com.cemalturkcan.jsf.view.scopetest;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Named("helloWorldView2")
@ViewScoped
public class HelloWorldView2Controller implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String message = "Hello, World! 2";

    public void changeMessage() {
        message = "ViewScoped Changed! 2";
    }
}
