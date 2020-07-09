package com.ruoyi;


import com.ruoyi.project.data.cases.domain.CleanResidenceRentAggregationCase;
import com.ruoyi.project.data.cases.domain.OfficeAggregationCase;
import com.ruoyi.project.data.cases.domain.OriginalNewHouseCase;
import com.ruoyi.project.data.cases.domain.OriginalResidenceRentClosingCase;
import com.ruoyi.project.data.price.domain.ComputeResidenceSaleBasePrice;
import com.ruoyi.project.data.price.domain.UltimateOfficeBasePrice;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Stream;

public class GenerateTableTests {

    @Test
    public void getELTableColumn() {
        Class<?> targetClass = ComputeResidenceSaleBasePrice.class;

        Stream.of(targetClass.getDeclaredFields()).forEach(x -> {
            if (x.isAnnotationPresent(com.ruoyi.framework.aspectj.lang.annotation.Excel.class)) {
                com.ruoyi.framework.aspectj.lang.annotation.Excel excel =
                        x.getAnnotation(com.ruoyi.framework.aspectj.lang.annotation.Excel.class);
                System.out.println(String.format("<el-table-column label=\"%s\" align=\"center\" " +
                        "prop=\"%s\" />", excel.name(), x.getName()));
            }
        });
    }

    @Test
    public void generateUserTableType() {
        Class<?> targetClass = ComputeResidenceSaleBasePrice.class;
        Stream.of(targetClass.getDeclaredFields()).forEach(x -> {
            if (x.isAnnotationPresent(com.ruoyi.framework.aspectj.lang.annotation.Excel.class)) {
                if ("java.lang.String".equals(x.getType().getName()))
                    System.out.println(String.format("sourceDataTable.addColumnMetadata(\"%s\", java.sql.Types" +
                            ".NVARCHAR);", x.getName()));
                else if ("java.lang.Integer".equals(x.getType().getName()))
                    System.out.println(String.format("sourceDataTable.addColumnMetadata(\"%s\", java.sql.Types" +
                            ".INT);", x.getName()));
                else if ("java.math.BigDecimal".equals(x.getType().getName()))
                    System.out.println(String.format("sourceDataTable.addColumnMetadata(\"%s\", java.sql.Types" +
                            ".DECIMAL);", x.getName()));
                else if ("java.util.Date".equals(x.getType().getName()))
                    System.out.println(String.format("sourceDataTable.addColumnMetadata(\"%s\", java.sql.Types" +
                            ".DATE);", x.getName()));
            }
        });
    }

    @Test
    public void generateUserTableScript() {
        Class<?> targetClass = ComputeResidenceSaleBasePrice.class;
        Stream.of(targetClass.getDeclaredFields()).forEach(x -> {
            if (x.isAnnotationPresent(com.ruoyi.framework.aspectj.lang.annotation.Excel.class)) {
                System.out.println(x.getName() + ",");
//                System.out.println(x.getName() + " nvarchar(200) null ,");
//                if ("java.lang.String".equals(x.getType().getName()))
//                    System.out.println(String.format("sourceDataTable.addColumnMetadata(\"%s\", java.sql.Types" +
//                            ".NVARCHAR);", x.getName()));
//                else if ("java.lang.Integer".equals(x.getType().getName()))
//                    System.out.println(String.format("sourceDataTable.addColumnMetadata(\"%s\", java.sql.Types" +
//                            ".INT);", x.getName()));
//                else if ("java.math.BigDecimal".equals(x.getType().getName()))
//                    System.out.println(String.format("sourceDataTable.addColumnMetadata(\"%s\", java.sql.Types" +
//                            ".DECIMAL);", x.getName()));
//                else if ("java.util.Date".equals(x.getType().getName()))
//                    System.out.println(String.format("sourceDataTable.addColumnMetadata(\"%s\", java.sql.Types" +
//                            ".DATE);", x.getName()));
            }
        });
    }

    @Test
    public void generateBatchInsertSqL() {
        Class targetClass = OriginalResidenceRentClosingCase.class;

        List<Field> fieldList = new ArrayList<>();
        while (targetClass != null) {
            fieldList.addAll(new ArrayList<>(Arrays.asList(targetClass.getDeclaredFields())));
            targetClass = targetClass.getSuperclass();
        }
        Field[] fields = new Field[fieldList.size()];
        fieldList.toArray(fields);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            sb.append(":");
            sb.append(fields[i].getName());
            sb.append(",");
        }
        System.out.println(sb.toString());
    }

    @Test
    public void generateBatchGuoHaoInsertSqL() {
        Class targetClass = OriginalNewHouseCase.class;

        List<Field> fieldList = new ArrayList<>();
        while (targetClass != null) {
            fieldList.addAll(new ArrayList<>(Arrays.asList(targetClass.getDeclaredFields())));
            targetClass = targetClass.getSuperclass();
        }
        Field[] fields = new Field[fieldList.size()];
        fieldList.toArray(fields);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            sb.append("#{" + fields[i].getName() + "},");
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    @Test
    public void testContains() {
        OriginalNewHouseCase originalNewHouseCase = new OriginalNewHouseCase();
        originalNewHouseCase.setCaseAddress("明兴路18弄124号地下1层车位288室");
        if (originalNewHouseCase.getCaseAddress().contains("地下")) {
            originalNewHouseCase.setCaseLabel("车位");
        }

        Assert.assertTrue(Objects.equals("车位",originalNewHouseCase.getCaseLabel()));
    }

    @Test
    public void printLoop() {
        OriginalNewHouseCase  originalNewHouseCase = new OriginalNewHouseCase();
        originalNewHouseCase.setCaseCounty("浦东");
        originalNewHouseCase.setCaseAddress("昌邑路55弄164室");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2005,10,16);
        originalNewHouseCase.setCaseSigningDate(calendar.getTime());
        Assert.assertEquals("4868c51874ba68c7fa2c96eeac02cde7",originalNewHouseCase.getCaseId());
    }



}
