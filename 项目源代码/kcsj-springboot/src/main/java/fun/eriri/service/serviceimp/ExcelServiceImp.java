package fun.eriri.service.serviceimp;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import fun.eriri.service.ExcelService;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Service
public class ExcelServiceImp implements ExcelService {
    @Override
    public <T> void getExcel(ExportParams exportParams, Class<T> t, List<T> list, HttpServletResponse response) {
        Workbook sheets = ExcelExportUtil.exportExcel(exportParams, t, list);
        try {
            response.setContentType("application/vnd.ms-excel;charset=utf-8");
            response.setHeader("Content-disposition","attachment;filename=材料.xls");
            sheets.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
