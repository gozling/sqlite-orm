package com.gaozl.sqlite;

/**
 * @author gaozl Create by 2017/12/18
 */
public class DataConnException extends Exception {

    public DataConnException(String string) {
        super(string);
    }

    public DataConnException(String string, Throwable e) {
        super(string, e);
    }

    private static final long serialVersionUID = -8783760761696466541L;

}