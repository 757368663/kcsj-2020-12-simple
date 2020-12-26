package fun.eriri.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import fun.eriri.pojo.Meterial;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MeterialCRUD extends BaseMapper<Meterial> {
    List<Meterial> getAllMeterial();
    Meterial getMeterialByName(String name);
    Meterial getMeterialByid(int id);

    Integer updateMeterialByid(Meterial meterial);
    Integer updateMeteriaCountlByid(@Param("id") int id,@Param("count") String count);

    Integer delteMeterialByid(List<Integer> id);
    Integer insertMeterial(Meterial meterial);

}
