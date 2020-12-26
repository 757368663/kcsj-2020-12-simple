package fun.eriri.dao;

import fun.eriri.pojo.Meterial;
import fun.eriri.pojo.MeterialType;

import java.util.List;

public interface MeterialTypeCURD {
    List<MeterialType> getAllMeterialType();
    Meterial getMeterialTypeByName(String name);
    Meterial getMeterialTypeByid(int id);

    Integer updateMeterialTypeByid(MeterialType meterial);
    Integer delteMeterialTypeByid(List<Integer> list);
    Integer insertMeterialType(MeterialType meterial);
}
