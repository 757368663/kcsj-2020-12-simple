package fun.eriri.controller;

import fun.eriri.dao.system.DepartmentCrud;
import fun.eriri.dao.system.PersonnelCurd;
import fun.eriri.dao.system.SystemInfoCrud;
import fun.eriri.dao.system.SystemUserCrud;
import fun.eriri.pojo.System.Department;
import fun.eriri.pojo.System.Personnel;
import fun.eriri.pojo.System.System;
import fun.eriri.pojo.System.SystemUser;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api")
@Api("system")
public class SystemApi {

    @Autowired
    private SystemInfoCrud systemInfoCrud;
    @Autowired
    private DepartmentCrud departmentCrud;
    @Autowired
    private SystemUserCrud systemUserCrud;
    @Autowired
    private PersonnelCurd personnelCurd;

    @GetMapping("getSystemInfo")
    public List<System> getSystemInfo(){
        return systemInfoCrud.selectList(null);
    }
    @PostMapping("updateSystemInfo")
    public Integer updateSystemInfo(@RequestBody System system){
        return systemInfoCrud.updateById(system);
    }
    @PostMapping("insertSystemInfo")
    public Integer insertSystemInfo(@RequestBody System system){
       return systemInfoCrud.insert(system);
    }



    @GetMapping("getDepartment")
    public List<Department> getDepartment(){
        return departmentCrud.selectList(null);
    }
    @PostMapping("updateDepartment")
    public Integer updateDepartment(@RequestBody Department department){
        return departmentCrud.updateById(department);
    }
    @PostMapping("deleteDepartment")
    public Integer deleteDepartment(@RequestBody List<Integer> integers){
        return departmentCrud.deleteBatchIds(integers);
    }
    @PostMapping("insertDepartment")
    public Integer insertDepartment(@RequestBody Department department){
        return departmentCrud.insert(department);
    }

    @GetMapping("getPersonnel")
    public List<Personnel> getPersonnel(){
        return personnelCurd.selectList(null);
    }
    @PostMapping("updatePersonnel")
    public Integer updatePersonnel(@RequestBody Personnel personnel){
        return personnelCurd.updateById(personnel);
    }
    @PostMapping("deletePersonnel")
    public Integer deletePersonnel(@RequestBody List<Integer> integers){
        return personnelCurd.deleteBatchIds(integers);
    }
    @PostMapping("insertPersonnel")
    public Integer insertDepartment(@RequestBody Personnel personnel){
        return personnelCurd.insert(personnel);
    }


    @GetMapping("getSystemUser")
    public List<SystemUser> getSystemUser(){
        return systemUserCrud.selectList(null);
    }
    @PostMapping("updateSystemUser")
    public Integer updateSystemUser(@RequestBody SystemUser user){
        return systemUserCrud.updateById(user);
    }
    @PostMapping("deleteSystemUser")
    public Integer deleteSystemUser(@RequestBody List<Integer> integers){
        return systemUserCrud.deleteBatchIds(integers);
    }
    @PostMapping("insertSystemUser")
    public Integer insertSystemUser(@RequestBody SystemUser systemUser){
        return systemUserCrud.insert(systemUser);
    }



}
