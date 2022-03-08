package model;

/**
 *
 * @author HuuTrinh
 */
public class Size {
    private int sizeID;
    private String sname;

    public Size() {
    }

    public Size(int sizeID, String sname) {
        this.sizeID = sizeID;
        this.sname = sname;
    }

    public int getSizeID() {
        return sizeID;
    }

    public void setSizeID(int sizeID) {
        this.sizeID = sizeID;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Size{" + "sizeID=" + sizeID + ", sname=" + sname + '}';
    }
    
}
