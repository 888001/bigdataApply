package cn.njcit.dao;

import cn.njcit.mapper.model.Groups;
import cn.njcit.mapper.model.GroupsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    int countByExample(GroupsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    int deleteByExample(GroupsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    int deleteByPrimaryKey(Integer groupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    int insert(Groups record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    int insertSelective(Groups record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    List<Groups> selectByExample(GroupsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    Groups selectByPrimaryKey(Integer groupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    int updateByExampleSelective(@Param("record") Groups record, @Param("example") GroupsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    int updateByExample(@Param("record") Groups record, @Param("example") GroupsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    int updateByPrimaryKeySelective(Groups record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    int updateByPrimaryKey(Groups record);
}