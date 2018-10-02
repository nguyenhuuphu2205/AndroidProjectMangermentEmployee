package phunhb.managermentemployee.model;

import java.io.Serializable;

/**
 * Created by phunhb on 02-Oct-18.
 */

public class Info implements Serializable {
    private String code;
    private String name;
    public Info(String code,String name){
        this.code=code;
        this.name = name;
    }
    public Info(){

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return code + " - " + name;
    }
}
