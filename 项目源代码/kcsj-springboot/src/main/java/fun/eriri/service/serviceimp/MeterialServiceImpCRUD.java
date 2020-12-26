package fun.eriri.service.serviceimp;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import fun.eriri.dao.MeterialCRUD;
import fun.eriri.pojo.Meterial;
import fun.eriri.service.MeterialServiceCRUD;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Service
@Transactional
public class MeterialServiceImpCRUD implements MeterialServiceCRUD {

    @Autowired
    private MeterialCRUD meterialCRUD;

    @Override
    public List<Meterial> getAllMeterial() {
        List<Meterial> allMeterial = meterialCRUD.getAllMeterial();
        for (Meterial m :
                allMeterial) {

            int count = Integer.parseInt(m.getCount());
            int inspectCount = Integer.parseInt(m.getInspectCount());

            if (count<inspectCount){
                if (count == 0){
                    m.setState_c("无库存！");
                }else {
                    m.setState_c("库存不足！");
                }
            }else {
                m.setState_c("库存充足！");
            }

        }
        return allMeterial;
    }

    @Override
    public Meterial getMeterialByName(String name) {
        return null;
    }

    @Override
    public Meterial getMeterialByid(int id) {
        return meterialCRUD.getMeterialByid(id);
    }



    @Override
    public Integer updateMeterialByid(Meterial meterial) {
        return meterialCRUD.updateMeterialByid(meterial);
    }

    @Override
    public Integer updateMeterialCountUseDeleteByid(int id, String count) {
        Meterial meterialByid = getMeterialByid(id);
        int m = Integer.parseInt(meterialByid.getCount());
        int d = Integer.parseInt(count);
        if (m < d){
            return 0;
        }
        int currentCount = m-d;

        return meterialCRUD.updateMeteriaCountlByid(id, Integer.toString(currentCount));
    }

    @Override
    public Integer updateMeterialCountUseAddByid(int id, String count) {
        Meterial meterialByid = getMeterialByid(id);
        int currentCount = Integer.parseInt(meterialByid.getCount())+Integer.parseInt(count);
        return meterialCRUD.updateMeteriaCountlByid(id, Integer.toString(currentCount));
    }

    @Override
    public Integer delteMeterialByid(List<Integer> id) {
        return meterialCRUD.delteMeterialByid(id);
    }

    @Override
    public Integer insertMeterial(Meterial meterial) {
        return meterialCRUD.insertMeterial(meterial);
    }
}
