package br.crm.common.pojo;

import java.io.Serializable;
import java.util.List;

public class PageBean implements Serializable {

    // 响应业务状态
    private Integer code;

    // 响应消息
    private String message;

    // 响应中的数据
    private List<BusinessResult> data;

    private Integer pageNo;

    private Integer pageTotal;

    private Integer pageCount;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<BusinessResult> getData() {
        return data;
    }

    public void setData(List<BusinessResult> data) {
        this.data = data;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }


    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

}
