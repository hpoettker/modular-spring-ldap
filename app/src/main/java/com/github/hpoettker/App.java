package com.github.hpoettker;

import org.springframework.ldap.core.LdapAttribute;

public class App {

    private final LdapAttribute ldapAttribute;

    public App() {
        ldapAttribute = new LdapAttribute("Hello World!");
    }

    public String getGreeting() {
        return ldapAttribute.getID();
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
