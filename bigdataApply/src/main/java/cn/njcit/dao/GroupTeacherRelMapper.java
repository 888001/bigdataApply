package cn.njcit.dao;

import cn.njcit.mapper.model.GroupTeacherRel;
import cn.njcit.mapper.model.GroupTeacherRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupTeacherRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_teacher_rel
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    int countByExample(GroupTeacherRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_teacher_rel
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    int deleteByExample(GroupTeacherRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_teacher_rel
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    int deleteByPrimaryKey(Integer groupTeacherRelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_teacher_rel
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    int insert(GroupTeacherRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_teacher_rel
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    int insertSelective(GroupTeacherRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_teacher_rel
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    List<GroupTeacherRel> selectByExample(GroupTeacherRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_teacher_rel
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    GroupTeacherRel selectByPrimaryKey(Integer groupTeacherRelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_teacher_rel
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    int updateByExampleSelective(@Param("record") GroupTeacherRel record, @Param("example") GroupTeacherRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_teacher_rel
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    int updateByExample(@Param("record") GroupTeacherRel record, @Param("example") GroupTeacherRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_teacher_rel
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    int updateByPrimaryKeySelective(GroupTeacherRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group_teacher_rel
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    int updateByPrimaryKey(GroupTeacherRel record);
}