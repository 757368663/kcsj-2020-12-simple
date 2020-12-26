package fun.eriri.service.serviceimp;

import fun.eriri.dao.MeterialCRUD;
import fun.eriri.dao.OrderCrud;
import fun.eriri.pojo.Order;
import fun.eriri.service.MeterialServiceCRUD;
import fun.eriri.service.OrderServiceCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderServiceImpCRUD implements OrderServiceCRUD {

    @Autowired
    private OrderCrud orderCrud;
    @Autowired
    private MeterialServiceCRUD meterialServiceCRUD;

    @Override
    public List<Order> getAllOrder() {
        return orderCrud.getAllOrder();
    }

    @Override
    public List<Order> getInOrder() {
        return orderCrud.getInOrder();
    }

    @Override
    public List<Order> getOutOrder() {
        return orderCrud.getOutOrder();
    }

    @Override
    public Integer deleteOrder(List<Integer> list) {
        return orderCrud.deleteOrder(list);
    }

    @Override
    public Integer insertOrder(List<Order> list) {
        for (Order order:
             list) {
            if (order.isInb()){
                meterialServiceCRUD.updateMeterialCountUseAddByid(order.getMeterial_id(),order.getCount());
            }else {
                Integer integer = meterialServiceCRUD.updateMeterialCountUseDeleteByid(order.getMeterial_id(), order.getCount());
                if (integer!=null&& integer == 0){
                    return 0;
                }
            }
        }
        return orderCrud.insertOrder(list);
    }
}
