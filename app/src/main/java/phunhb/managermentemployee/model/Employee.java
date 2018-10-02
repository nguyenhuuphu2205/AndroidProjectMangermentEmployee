package phunhb.managermentemployee.model;

import java.io.Serializable;

/**
 * Created by phunhb on 02-Oct-18.
 */

public class Employee extends Info implements Serializable {
    private Department department;
    private ChucVu chucVu;
    private boolean gender;

    public Employee(String code,String name,Department department, ChucVu chucVu, boolean gender) {
        super(code,name);
        this.department = department;
        this.chucVu = chucVu;
        this.gender = gender;
    }
    public Employee(){

    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

}
