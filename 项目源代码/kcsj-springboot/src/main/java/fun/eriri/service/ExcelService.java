package fun.eriri.service;

import cn.afterturn.easypoi.excel.entity.ExportParams;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface ExcelService {
    public <T> void getExcel(ExportParams exportParams, Class<T> t, List<T> list, HttpServletResponse response) ;
}
