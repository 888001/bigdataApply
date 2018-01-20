package cn.njcit.mapper.model;

import java.util.Date;

public class Teacher {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_id
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private Integer teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_name
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private String teacherName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_status
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private Integer teacherStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.department_id
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private Integer departmentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_phone
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private String teacherPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_email
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private String teacherEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_QQ
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private String teacherQq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.create_time
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.update_time
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_id
     *
     * @return the value of teacher.teacher_id
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_id
     *
     * @param teacherId the value for teacher.teacher_id
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_name
     *
     * @return the value of teacher.teacher_name
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_name
     *
     * @param teacherName the value for teacher.teacher_name
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_status
     *
     * @return the value of teacher.teacher_status
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public Integer getTeacherStatus() {
        return teacherStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_status
     *
     * @param teacherStatus the value for teacher.teacher_status
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setTeacherStatus(Integer teacherStatus) {
        this.teacherStatus = teacherStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.department_id
     *
     * @return the value of teacher.department_id
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.department_id
     *
     * @param departmentId the value for teacher.department_id
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_phone
     *
     * @return the value of teacher.teacher_phone
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public String getTeacherPhone() {
        return teacherPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_phone
     *
     * @param teacherPhone the value for teacher.teacher_phone
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_email
     *
     * @return the value of teacher.teacher_email
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public String getTeacherEmail() {
        return teacherEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_email
     *
     * @param teacherEmail the value for teacher.teacher_email
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_QQ
     *
     * @return the value of teacher.teacher_QQ
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public String getTeacherQq() {
        return teacherQq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_QQ
     *
     * @param teacherQq the value for teacher.teacher_QQ
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setTeacherQq(String teacherQq) {
        this.teacherQq = teacherQq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.create_time
     *
     * @return the value of teacher.create_time
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.create_time
     *
     * @param createTime the value for teacher.create_time
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.update_time
     *
     * @return the value of teacher.update_time
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.update_time
     *
     * @param updateTime the value for teacher.update_time
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}