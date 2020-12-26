package fun.eriri.controller;


import cn.afterturn.easypoi.excel.entity.ExportParams;
import fun.eriri.common.Buffer;
import fun.eriri.pojo.Meterial;
import fun.eriri.pojo.MeterialType;
import fun.eriri.pojo.Order;
import fun.eriri.service.ExcelService;
import fun.eriri.service.MeterialServiceCRUD;
import fun.eriri.service.MeterialTypeServiceCRUD;
import fun.eriri.service.OrderServiceCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin
public class Api {

    @Autowired
    private MeterialServiceCRUD meterialServiceCRUD;

    @Autowired
    private MeterialTypeServiceCRUD meterialTypeServiceCRUD;

    @Autowired
    private OrderServiceCRUD orderServiceCRUD;

    @Autowired
    private ExcelService excelService;

    @GetMapping("getAllMeterial")
    public List<Meterial> getAllMeterial(){
         return meterialServiceCRUD.getAllMeterial();
    }

    @GetMapping("getMeterialByid")
    public Meterial getMeterialByid(int id){
        return meterialServiceCRUD.getMeterialByid(id);
    }

    @PostMapping("insertMeterial")
    public int insertMeterial(@RequestBody Meterial meterial){
        return meterialServiceCRUD.insertMeterial(meterial);
    }

    @PostMapping("deleteMeterialByid")
    public int deleteMeterialByid(@RequestBody List<Integer> id){
        return meterialServiceCRUD.delteMeterialByid(id);
    }

    @PostMapping("updateMeterial")
    public int updateMeterial(@RequestBody Meterial meterial){return meterialServiceCRUD.updateMeterialByid(meterial);}

    @GetMapping("getMeterialExcel")
    public void getMeterialExcel(HttpServletResponse response){
        List<Meterial> allMeterial =getAllMeterial();
        excelService.getExcel(new ExportParams("材料表", "材料表"),
                Meterial.class,allMeterial,response);
    }



    @GetMapping("getAllMeterialType")
    public List<MeterialType> getAllMeterialType(){
        return meterialTypeServiceCRUD.getAllMeterialType();
    }

    @GetMapping("getMeterialTypeByid")
    public Meterial getMeterialTypeByid(int id){
        return meterialTypeServiceCRUD.getMeterialTypeByid(id);
    }

    @PostMapping("insertMeterialType")
    public int insertMeterialType(@RequestBody MeterialType meterial){
        return meterialTypeServiceCRUD.insertMeterialType(meterial);
    }

    @PostMapping("deleteMeterialTypeByid")
    public int deleteMeterialTypeByid(@RequestBody List<Integer> id){
        return meterialTypeServiceCRUD.delteMeterialTypeByid(id);
    }

    @GetMapping("getMeterialTypeExcel")
    public void getMeterialTypeExcel(HttpServletResponse response){
        List<MeterialType> meterialTypes = getAllMeterialType();
        excelService.getExcel(new ExportParams("材料分类表", "材料分类表"),
                MeterialType.class,meterialTypes,response);
    }

    @PostMapping("updateMeterialType")
    public int updateMeterialTypeByid(@RequestBody MeterialType meterialType){
        return  meterialTypeServiceCRUD.updateMeterialTypeByid(meterialType);
    }



//    入出库
    @GetMapping("getAllOrder")
    public List<Order> getAllOrder(){
        return orderServiceCRUD.getAllOrder();
    }

    //入订单
    @GetMapping("getInOrder")
    public List<Order> getInOrders(){
        return orderServiceCRUD.getInOrder();
    }

    @GetMapping("getOutOrder")
    public List<Order> getOutOrders(){
        return orderServiceCRUD.getOutOrder();
    }

    @PostMapping("insertOrder")
    public Integer insertOrders(@RequestBody List<Order> orders){
        return orderServiceCRUD.insertOrder(orders);
    }

    @PostMapping("deleteOrder")
    public Integer deleteOrder(@RequestBody List<Integer> list){
       return orderServiceCRUD.deleteOrder(list);
    }

    @GetMapping("getInOrderExcel")
    public void getInOrderExcel(HttpServletResponse response){
        List<Order> inOrders = getInOrders();
        excelService.getExcel(new ExportParams("入库订单表", "入库订单表"),
                Order.class,inOrders,response);
    }
    @GetMapping("getOutOrderExcel")
    public void getOutOrderExcel(HttpServletResponse response){
        List<Order> inOrders = getOutOrders();
        excelService.getExcel(new ExportParams("出库订单表", "出库订单表"),
                Order.class,inOrders,response);
    }

}
