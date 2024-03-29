package com.lnsoft.bd.fk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lnsoft.bd.fk.po.TXczyZylc;
import com.lnsoft.bd.fk.po.TXczyZylcExample;

public interface TXczyZylcMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    int countByExample(TXczyZylcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    int deleteByExample(TXczyZylcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    int deleteByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    int insert(TXczyZylc record);

    int batchinsert(List<TXczyZylc> records);
    
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    int insertSelective(TXczyZylc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    List<TXczyZylc> selectByExample(TXczyZylcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    TXczyZylc selectByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    int updateByExampleSelective(@Param("record") TXczyZylc record, @Param("example") TXczyZylcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    int updateByExample(@Param("record") TXczyZylc record, @Param("example") TXczyZylcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    int updateByPrimaryKeySelective(TXczyZylc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    int updateByPrimaryKey(TXczyZylc record);
}