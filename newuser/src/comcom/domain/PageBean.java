package comcom.domain;

import java.util.List;

//分页对象
public class PageBean<T>
{//总记录条数
    private int totalCount;
    //总页数
    private int tatalPage;
    //每页记录数
    private int rows;
    //每页的数据
    private List<T> list;
    ///当前页码
    private int currentPage;

    public int getTotalCount()
    {
        return totalCount;
    }

    public void setTotalCount(int totalCount)
    {
        this.totalCount = totalCount;
    }

    public int getTatalPage()
    {
        return tatalPage;
    }

    public void setTatalPage(int tatalPage)
    {
        this.tatalPage = tatalPage;
    }

    public int getRows()
    {
        return rows;
    }

    public void setRows(int rows)
    {
        this.rows = rows;
    }

    public List<T> getList()
    {
        return list;
    }

    public void setList(List<T> list)
    {
        this.list = list;
    }

    public int getCurrentPage()
    {
        return currentPage;
    }

    public void setCurrentPage(int currentPage)
    {
        this.currentPage = currentPage;
    }
}
