package com.example.demo.test.day10;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.google.common.collect.Lists;
import lombok.val;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @author yanghan
 * @date 2020/10/31 11:35
 */
public class excelDemo {
    public static void main(String[] args) throws IOException {
        List<CourseEntity> entityList = Lists.newArrayList();
        List<StudentEntity> studentEntityList = Lists.newArrayList();
        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setId("1");
        teacherEntity.setName("yanghan");

        CourseEntity courseEntity = new CourseEntity();
        courseEntity.setId("1");
        courseEntity.setMathTeacher(teacherEntity);
        courseEntity.setName("yang");


        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId("1");
        studentEntity.setBirthday(new Date());
        studentEntity.setName("xls");
        studentEntity.setRegistrationDate(new Date());
        studentEntity.setSex(2);

        StudentEntity studentEntity1 = new StudentEntity();
        studentEntity1.setId("1");
        studentEntity1.setBirthday(new Date());
        studentEntity1.setName("xls");
        studentEntity1.setRegistrationDate(new Date());
        studentEntity1.setSex(2);

        studentEntityList.add(studentEntity);
        studentEntityList.add(studentEntity1);
        courseEntity.setStudents(studentEntityList);
        entityList.add(courseEntity);



        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("2412312","测试","测试"),
                CourseEntity.class, entityList);
        FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/lenovo/Desktop/aa.xls");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }

}
