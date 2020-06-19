package com.lupawktu.possqlite.reponse;

import com.lupawktu.possqlite.productcategory.*;

import java.util.ArrayList;

/**
 * Created by Mind on 5/30/2017.
 */

public class ResponseModel {
    private ArrayList < String > data;
    private String pesan;
    private int code;

    public String getPesan ( ) {
        return pesan;
    }

    public void setPesan ( String pesan ) {
        this.pesan = pesan;
    }

    public int getCode ( ) {
        return code;
    }

    public void setCode ( int code ) {
        this.code = code;
    }

    public ArrayList < String > getData ( ) {
        return data;
    }

    public void setData ( ArrayList < CategoryModel > data ) {
        this.data = data;
    }
}
