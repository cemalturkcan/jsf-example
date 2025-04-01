package com.cemalturkcan.jsf.view.formtest;

import jakarta.inject.Named;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.faces.context.FacesContext;
import lombok.Data;
import org.springframework.web.context.annotation.RequestScope;

import java.io.Serial;
import java.io.Serializable;

@Data
@Named("formExample")
@RequestScope
public class FormExampleController implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private String email;

    public String submit() {
        System.out.println("Submitted Data: Name = " + name + ", Email = " + email);

        FacesContext facesContext = FacesContext.getCurrentInstance();
        HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();
        Cookie nameCookie = new Cookie("userName", name);
        nameCookie.setMaxAge(3600); // 1 saat geçerli
        nameCookie.setPath("/");
        response.addCookie(nameCookie);

        return "success?faces-redirect=true";
    }
}
