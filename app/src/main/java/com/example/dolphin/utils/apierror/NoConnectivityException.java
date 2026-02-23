package com.example.dolphin.utils.apierror;
import java.io.*;
public class NoConnectivityException extends IOException {

    @Override
    public String getMessage() {
        return "No Internet Connection";
    }
}
