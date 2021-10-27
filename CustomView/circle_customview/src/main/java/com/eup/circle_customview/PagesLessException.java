package com.eup.circle_customview;

public class PagesLessException extends Exception{
    @Override
    public String getMessage() {
        return "So luong fragment phai >=2";
    }
}
