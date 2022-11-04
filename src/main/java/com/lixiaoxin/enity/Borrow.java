package com.lixiaoxin.enity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName borrow
 */
@Data
public class Borrow implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer bookid;

    /**
     * 
     */
    private String userid;

    /**
     * 
     */
    private Date brrowtime;

    /**
     * 
     */
    private Integer days;

    /**
     * 
     */
    private Date backtime;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Borrow other = (Borrow) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBookid() == null ? other.getBookid() == null : this.getBookid().equals(other.getBookid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getBrrowtime() == null ? other.getBrrowtime() == null : this.getBrrowtime().equals(other.getBrrowtime()))
            && (this.getDays() == null ? other.getDays() == null : this.getDays().equals(other.getDays()))
            && (this.getBacktime() == null ? other.getBacktime() == null : this.getBacktime().equals(other.getBacktime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBookid() == null) ? 0 : getBookid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getBrrowtime() == null) ? 0 : getBrrowtime().hashCode());
        result = prime * result + ((getDays() == null) ? 0 : getDays().hashCode());
        result = prime * result + ((getBacktime() == null) ? 0 : getBacktime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bookid=").append(bookid);
        sb.append(", userid=").append(userid);
        sb.append(", brrowtime=").append(brrowtime);
        sb.append(", days=").append(days);
        sb.append(", backtime=").append(backtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}