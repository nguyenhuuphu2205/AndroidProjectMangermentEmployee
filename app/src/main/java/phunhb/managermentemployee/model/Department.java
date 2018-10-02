package phunhb.managermentemployee.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by phunhb on 02-Oct-18.
 */

public class Department extends Info implements Serializable {
    private ArrayList<Employee> listEmployees;

    public Department(String code, String name, ArrayList<Employee> listEmployees) {
        super(code, name);
        this.listEmployees = listEmployees;
    }

    public Department(String code, String name) {
        super(code, name);
        listEmployees = new ArrayList<>();
    }

    public ArrayList<Employee> getListEmployees() {
        return listEmployees;
    }

    public void setListEmployees(ArrayList<Employee> listEmployees) {
        this.listEmployees = listEmployees;
    }
    public void addEmployee(Employee employee){
        int index = hasEmployee(employee.getCode());
        if(index !=-1){
            listEmployees.set(index,employee);
        }else{
            listEmployees.add(employee);
        }
    }
    //Ham kiem tra xem co nhan vien trong danh sach nhan vien khong
    public int hasEmployee(String code){
        int index = -1;
        for(int i =0 ;i<listEmployees.size();i++){
            if(listEmployees.get(i).getCode().equals(code)){
                index = i;
            }
        }
        return index;
    }
    //Ham xoa 1 nhan vien neu ton tai nhan vien do trong danh sach.
    public boolean deleteEmployee(String code){
        int index = -1;
        for (int i=0;i<listEmployees.size();i++){
            if(listEmployees.get(i).getCode().equals(code)){
                index=i;
                break;
            }
        }
        if(index != -1){
            listEmployees.remove(index);
            return true;
        }else
            return false;
    }
    //Ham lay ra truong phong
    public Employee getLeader(){
        Employee leader=null;
        for(int i=0;i<listEmployees.size();i++){
            if (listEmployees.get(i).getChucVu() == ChucVu.TruongPhong){
                leader=listEmployees.get(i);
                break;
            }
        }
        return leader;
    }
    //Ham lay ra danh sach pho phong
    public ArrayList<Employee> getListSecondLead(){
        ArrayList<Employee> list = new ArrayList<>();
        for(int i=0;i<listEmployees.size();i++){
            if(listEmployees.get(i).getChucVu()==ChucVu.PhoPhong){
                list.add(listEmployees.get(i));
            }
        }
        return list;
    }
    //Ham set chuc vu cho nhan vien trong phong
    public boolean setRoleEmployee(Employee e, ChucVu chucVu){
        Employee employee=e;
        e.setChucVu(chucVu);
        if (chucVu == ChucVu.TruongPhong){
            if(getLeader() !=null){
                listEmployees.set(findEmployee(e.getCode()),employee);
                return true;
            }else return false;
        }else{
            listEmployees.set(findEmployee(e.getCode()),employee);
            return true;

        }

    }
    public int findEmployee(String code){
        int index =-1;
        for (int i=0;i<listEmployees.size();i++){
            if (listEmployees.get(i).getCode().equals(code)){
                index=i;
                break;
            }
        }
        return index;
    }
}
