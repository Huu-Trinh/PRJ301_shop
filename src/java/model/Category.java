package model;

/**
 *
 * @author HuuTrinh
 */
public class Category {
    private int cateID;
    private String cateName;
    private int status;

    public Category(int cateID, String cateName, int status) {
        this.cateID = cateID;
        this.cateName = cateName;
        this.status = status;
    }

    public Category() {
    }

    public int getCateID() {
        return cateID;
    }

    public void setCateID(int cateID) {
        this.cateID = cateID;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Category{" + "cateID=" + cateID + ", cateName=" + cateName + ", status=" + status + '}';
    }
    
}
