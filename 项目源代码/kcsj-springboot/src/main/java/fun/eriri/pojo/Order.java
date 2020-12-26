package fun.eriri.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

import java.util.Date;

@ExcelTarget("订单表")
public class Order {
    @Excel(name = "订单id")
    private int id;
    @Excel(name = "材料名称")
    private String name;
    @Excel(name = "材料id")
    private int meterial_id;
    @Excel(name = "操作数量")
    private String count;
    @Excel(name = "办理人")
    private String person;
    @Excel(name = "办理人电话")
    private String phone;
    @Excel(name = "操作原因")
    private String reason;
    @Excel(name = "是否入库")
    private boolean inb;
    @Excel(name = "操作时间",format = "yyyy-MM-dd")
    private Date create_date;

    public Order() {
    }

    public Order(int id, String count, String person, String phone, String reason, Date create_date) {
        this.id = id;
        this.count = count;
        this.person = person;
        this.phone = phone;
        this.reason = reason;
        this.create_date = create_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public boolean isInb() {
        return inb;
    }

    public void setInb(boolean inb) {
        this.inb = inb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMeterial_id() {
        return meterial_id;
    }

    public void setMeterial_id(int meterial_id) {
        this.meterial_id = meterial_id;
    }
}
