package cn.njcit.mapper.model;

import java.util.Date;

public class GroupTeacherRel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_teacher_rel.group_teacher_rel_id
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private Integer groupTeacherRelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_teacher_rel.group_id
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_teacher_rel.teacher_id
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private Integer teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_teacher_rel.STATUS
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_teacher_rel.create_time
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_teacher_rel.update_time
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_teacher_rel.group_teacher_rel_id
     *
     * @return the value of group_teacher_rel.group_teacher_rel_id
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public Integer getGroupTeacherRelId() {
        return groupTeacherRelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_teacher_rel.group_teacher_rel_id
     *
     * @param groupTeacherRelId the value for group_teacher_rel.group_teacher_rel_id
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setGroupTeacherRelId(Integer groupTeacherRelId) {
        this.groupTeacherRelId = groupTeacherRelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_teacher_rel.group_id
     *
     * @return the value of group_teacher_rel.group_id
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_teacher_rel.group_id
     *
     * @param groupId the value for group_teacher_rel.group_id
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_teacher_rel.teacher_id
     *
     * @return the value of group_teacher_rel.teacher_id
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_teacher_rel.teacher_id
     *
     * @param teacherId the value for group_teacher_rel.teacher_id
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_teacher_rel.STATUS
     *
     * @return the value of group_teacher_rel.STATUS
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_teacher_rel.STATUS
     *
     * @param status the value for group_teacher_rel.STATUS
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_teacher_rel.create_time
     *
     * @return the value of group_teacher_rel.create_time
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_teacher_rel.create_time
     *
     * @param createTime the value for group_teacher_rel.create_time
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_teacher_rel.update_time
     *
     * @return the value of group_teacher_rel.update_time
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_teacher_rel.update_time
     *
     * @param updateTime the value for group_teacher_rel.update_time
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}