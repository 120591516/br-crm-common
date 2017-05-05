package br.crm.common.pojo;

import java.io.Serializable;
import java.util.List;

public class SearchResult implements Serializable {

    //对象集合
    private List<Object> objectList;

    //总记录数
    private long recordCount;

    //总页数
    private long pageCount;

    //当前页
    private long curPage;

    public List<Object> getObjectList() {
        return objectList;
    }

    public void setObjectList(List<Object> objectList) {
        this.objectList = objectList;
    }

    public long getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(long recordCount) {
        this.recordCount = recordCount;
    }

    public long getPageCount() {
        return pageCount;
    }

    public void setPageCount(long pageCount) {
        this.pageCount = pageCount;
    }

    public long getCurPage() {
        return curPage;
    }

    public void setCurPage(long curPage) {
        this.curPage = curPage;
    }

}
