package com.lupawktu.possqlite.reponse;

import com.lupawktu.possqlite.productcategory.*;
import com.lupawktu.possqlite.store.*;

import java.util.ArrayList;

/**
 * Created by Mind on 5/30/2017.
 */

public class ResponseModel {
    private ArrayList < CategoryModel > data;
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

    public ArrayList < CategoryModel > getData ( ) {
        return data;
    }

    public void setData ( ArrayList < CategoryModel > data ) {
        this.data = data;
    }
}
