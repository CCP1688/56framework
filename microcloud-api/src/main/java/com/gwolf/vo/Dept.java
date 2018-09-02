package com.gwolf.vo;

public class Dept implements  java.io.Serializable {
    public Status getStatus() {
        return status;
    }

    public Dept setStatus(Status status) {
        this.status = status;
        return this;
    }

    private Status status;

    public Dept(Status status, Long deptno, String dname, String loc) {
        this.status = status;
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public enum  Status {
        FREE,
        BUSY,
        VOCATION;
        
        public String getName() {
            return "11";
        }
    }
    public Dept(Long deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    private Long deptno;
    private String dname;
    private String loc;
    
    public Dept() {
        
    }
    
    public Dept(Long deptno) {
        this.deptno = deptno;
    }

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dept dept = (Dept) o;

        if (deptno != null ? !deptno.equals(dept.deptno) : dept.deptno != null) return false;
        if (dname != null ? !dname.equals(dept.dname) : dept.dname != null) return false;
        return loc != null ? loc.equals(dept.loc) : dept.loc == null;
    }

    @Override
    public int hashCode() {
        int result = deptno != null ? deptno.hashCode() : 0;
        result = 31 * result + (dname != null ? dname.hashCode() : 0);
        result = 31 * result + (loc != null ? loc.hashCode() : 0);
        return result;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
