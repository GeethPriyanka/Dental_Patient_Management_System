package com.doerit.dao;

import com.doerit.model.PatientVisit;
import com.doerit.model.PatientVisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface PatientVisitMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_visit
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    int countByExample(PatientVisitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_visit
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    int deleteByExample(PatientVisitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_visit
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_visit
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    int insert(PatientVisit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_visit
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    int insertSelective(PatientVisit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_visit
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    List<PatientVisit> selectByExample(PatientVisitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_visit
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    PatientVisit selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_visit
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    int updateByExampleSelective(@Param("record") PatientVisit record, @Param("example") PatientVisitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_visit
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    int updateByExample(@Param("record") PatientVisit record, @Param("example") PatientVisitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_visit
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    int updateByPrimaryKeySelective(PatientVisit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_visit
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    int updateByPrimaryKey(PatientVisit record);

    
    @Select("SELECT * FROM tbl_patient_visit WHERE STATUS = #{status}")
    @ResultMap("BaseResultMap")
	List<PatientVisit> findAllActive(@Param("status")byte databaseValue);
    
    @Select("SELECT a.PATIENT_ID, (SELECT b.NAME FROM tbl_department b WHERE a.DEPARTMENT_ID=b.ID ) AS DEPARTMENT, a.COMMENT, a.INSERT_DATETIME FROM tbl_patient_visit a WHERE a.PATIENT_ID = #{id}")
    @ResultMap("relationResultMap")
	List<PatientVisit> findByIdWithDepartment(@Param("id")String patientID);

}