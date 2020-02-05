package com.lancer.Interface;

import com.lancer.bean.SysLog;
import com.lancer.bean.SysLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@Mapper
public interface SysLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSLOG
     *
     * @mbggenerated Sat Oct 26 20:21:26 CST 2019
     */
    int countByExample(SysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSLOG
     *
     * @mbggenerated Sat Oct 26 20:21:26 CST 2019
     */
    int deleteByExample(SysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSLOG
     *
     * @mbggenerated Sat Oct 26 20:21:26 CST 2019
     */
    int insert(SysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSLOG
     *
     * @mbggenerated Sat Oct 26 20:21:26 CST 2019
     */
    int insertSelective(SysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSLOG
     *
     * @mbggenerated Sat Oct 26 20:21:26 CST 2019
     */
    List<SysLog> selectByExample(SysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSLOG
     *
     * @mbggenerated Sat Oct 26 20:21:26 CST 2019
     */
    int updateByExampleSelective(@Param("record") SysLog record, @Param("example") SysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSLOG
     *
     * @mbggenerated Sat Oct 26 20:21:26 CST 2019
     */
    int updateByExample(@Param("record") SysLog record, @Param("example") SysLogExample example);
}