package com.lixiaoxin.enity;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName books
 */
@Data
public class Books implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String types;

    /**
     * 
     */
    private String shelf;

    /**
     * 
     */
    private String author;

    /**
     * 
     */
    private Integer hasnum;

    /**
     * 
     */
    private Integer borrow;

    /**
     * 
     */
    private String isbn;

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
        Books other = (Books) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTypes() == null ? other.getTypes() == null : this.getTypes().equals(other.getTypes()))
            && (this.getShelf() == null ? other.getShelf() == null : this.getShelf().equals(other.getShelf()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getHasnum() == null ? other.getHasnum() == null : this.getHasnum().equals(other.getHasnum()))
            && (this.getBorrow() == null ? other.getBorrow() == null : this.getBorrow().equals(other.getBorrow()))
            && (this.getIsbn() == null ? other.getIsbn() == null : this.getIsbn().equals(other.getIsbn()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTypes() == null) ? 0 : getTypes().hashCode());
        result = prime * result + ((getShelf() == null) ? 0 : getShelf().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getHasnum() == null) ? 0 : getHasnum().hashCode());
        result = prime * result + ((getBorrow() == null) ? 0 : getBorrow().hashCode());
        result = prime * result + ((getIsbn() == null) ? 0 : getIsbn().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", types=").append(types);
        sb.append(", shelf=").append(shelf);
        sb.append(", author=").append(author);
        sb.append(", hasnum=").append(hasnum);
        sb.append(", borrow=").append(borrow);
        sb.append(", isbn=").append(isbn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}