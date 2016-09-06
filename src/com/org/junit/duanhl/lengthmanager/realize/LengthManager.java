package com.org.junit.duanhl.lengthmanager.realize;


/**
 * 长度管理实现
 * @author duanhl
 *
 */
public class LengthManager {

    private static final String UNIT_M = "m";
    private static final String UNIT_CM = "cm";
    private static final int CHANGE_M_AND_MM = 1000;
    private static final int CHANGE_CM_AND_MM = 10;

    private static final int FINAL_M = 1;
    private static final int FINAL_M_DIV = 4;
    private static final int FINAL_CM = 10;
    private static final int FINAL_CM_MUL = 3;
    private static final int FINAL_MM = 5;
    
    /**
     * LengthManager 计算中心
     * @param unit
     * @return
     */
    public String calculationLength(String unit) {
       return formatUnitForResult((formatUnitFromMToMM(FINAL_M)/FINAL_M_DIV + formatUnitFromCMToMM(FINAL_CM)*FINAL_CM_MUL-FINAL_MM),unit);
    }
    
    /**
     * 米转毫米
     * @des M --> MM
     * @param length
     * @return
     */
    private double formatUnitFromMToMM(double length){
        return length*CHANGE_M_AND_MM;
    }
    
    /**
     * 厘米转毫米
     * @des CM --> MM
     * @param length
     * @return
     */
    private double formatUnitFromCMToMM(double length){
        return length*CHANGE_CM_AND_MM;
    }
    
    /**
     * @des 单位换算 MM -?
     * @param length
     * @param unit
     * @return
     */
    private String formatUnitForResult(double length,String unit){
        return (UNIT_CM.equalsIgnoreCase(unit)?length/CHANGE_CM_AND_MM:UNIT_M.equalsIgnoreCase(unit)?length/CHANGE_M_AND_MM:length)+unit;
    }
}
