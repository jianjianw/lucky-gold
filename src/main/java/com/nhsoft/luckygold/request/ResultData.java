package com.nhsoft.luckygold.request;

import java.io.Serializable;

public class ResultData implements Serializable {
    private static final long serialVersionUID = 4932507523807497697L;

    private String result;

    public ResultData() {
    }

    public ResultData(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
