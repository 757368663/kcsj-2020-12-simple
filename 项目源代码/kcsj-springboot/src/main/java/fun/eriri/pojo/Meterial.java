package fun.eriri.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@ExcelTarget("材料")
public class Meterial implements Serializable {
    @Excel(name="材料id")
    private int id;
    @Excel(name="材料名称")
    private String name;
    @Excel(name="录入人")
    private String person;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间",format = "yyyy-MM-dd")
    private Date create_date;
    @Excel(name = "材料数量")
    private String count;

    @Excel(name = "库存监控")
    private String inspectCount;

    private int type; // type-id
    @Excel(name = "材料类型")
    private String type_name;
    @Excel(name = "备注")
    private String remark;
    private String phoneNumber;

    @Excel(name="库存状态")
    private String state_c;  //库存状态

    public Meterial() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getState_c() {
        return state_c;
    }

    public void setState_c(String state) {
        this.state_c = state;
    }

    public String getInspectCount() {
        return inspectCount;
    }

    public void setInspectCount(String inspectCount) {
        this.inspectCount = inspectCount;
    }

}
