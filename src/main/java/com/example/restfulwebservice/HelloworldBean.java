package com.example.restfulwebservice;

public class HelloworldBean {
     private String message;
    public HelloworldBean(String messsage) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloworldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
