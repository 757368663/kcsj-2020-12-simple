package fun.eriri.service.serviceimp;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import fun.eriri.dao.MeterialTypeCURD;
import fun.eriri.pojo.Meterial;
import fun.eriri.pojo.MeterialType;
import fun.eriri.service.MeterialTypeServiceCRUD;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Service
public class MeterialTypeServiceImpCRUD implements MeterialTypeServiceCRUD {

    @Autowired
    private MeterialTypeCURD meterialTypeCURD;

    @Override
    public List<MeterialType> getAllMeterialType() {
        return meterialTypeCURD.getAllMeterialType();
    }

    @Override
    public Meterial getMeterialTypeByName(String name) {
        return null;
    }

    @Override
    public Meterial getMeterialTypeByid(int id) {
        return meterialTypeCURD.getMeterialTypeByid(id);
    }


    @Override
    public Integer updateMeterialTypeByid(MeterialType meterial) {
        return meterialTypeCURD.updateMeterialTypeByid(meterial);

    }

    @Override
    public Integer delteMeterialTypeByid(List<Integer> id) {
        return meterialTypeCURD.delteMeterialTypeByid(id);
    }

    @Override
    public Integer insertMeterialType(MeterialType meterial) {
        return meterialTypeCURD.insertMeterialType(meterial);
    }
}
