package com.restEasy3.test;

import java.io.Serializable;

/**
 *
 * @author alexvfornazieri
 */
public class Hello implements Serializable{
    
    String message = "Hello Word! I am REST resource";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
