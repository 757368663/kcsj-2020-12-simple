package fun.eriri.service;

import cn.afterturn.easypoi.excel.entity.ExportParams;
import fun.eriri.pojo.Meterial;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface MeterialServiceCRUD {
    List<Meterial> getAllMeterial();
    Meterial getMeterialByName(String name);
    Meterial getMeterialByid(int id);



    Integer updateMeterialByid(Meterial meterial);
    Integer updateMeterialCountUseDeleteByid(int id,String count);
    Integer updateMeterialCountUseAddByid(int id,String count);

    Integer delteMeterialByid(List<Integer> id);
    Integer insertMeterial(Meterial meterial);
}
