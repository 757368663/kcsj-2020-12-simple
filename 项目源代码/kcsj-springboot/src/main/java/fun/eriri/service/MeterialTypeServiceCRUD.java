package fun.eriri.service;

import cn.afterturn.easypoi.excel.entity.ExportParams;
import fun.eriri.pojo.Meterial;
import fun.eriri.pojo.MeterialType;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface MeterialTypeServiceCRUD {
    List<MeterialType> getAllMeterialType();
    Meterial getMeterialTypeByName(String name);
    Meterial getMeterialTypeByid(int id);


    Integer updateMeterialTypeByid(MeterialType meterial);
    Integer delteMeterialTypeByid(List<Integer> id);
    Integer insertMeterialType(MeterialType meterial);
}
