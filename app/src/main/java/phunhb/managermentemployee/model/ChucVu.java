package phunhb.managermentemployee.model;

/**
 * Created by phunhb on 02-Oct-18.
 */

public enum ChucVu {
    TruongPhong("Trưởng Phòng"),
    PhoPhong("Phó Phòng"),
    NhanVien("Nhân Viên");
    private String chucvu;
    private ChucVu(String cv){
        chucvu=cv;
    }
    public String getChucvu(){
        return chucvu;
    }
}
