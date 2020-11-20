package com.example.demo.test.day10;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

/**
 * @author yanghan
 * @date 2020/10/31 11:34
 */
@ExcelTarget("teacherEntity")
@Data
public class TeacherEntity implements java.io.Serializable {
    private String id;
    /**
     * name
     */
    @Excel(name = "主讲老师_major,代课老师_absent", orderNum = "1", isImportField = "true_major,true_absent")
    private String name;
}
