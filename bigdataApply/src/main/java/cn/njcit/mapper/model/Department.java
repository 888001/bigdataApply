package cn.njcit.mapper.model;

import java.util.Date;

public class Department {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.department_id
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private Integer departmentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.department_name
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private String departmentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.department_status
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private Integer departmentStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.create_time
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.update_time
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.department_id
     *
     * @return the value of department.department_id
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.department_id
     *
     * @param departmentId the value for department.department_id
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.department_name
     *
     * @return the value of department.department_name
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.department_name
     *
     * @param departmentName the value for department.department_name
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.department_status
     *
     * @return the value of department.department_status
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public Integer getDepartmentStatus() {
        return departmentStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.department_status
     *
     * @param departmentStatus the value for department.department_status
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setDepartmentStatus(Integer departmentStatus) {
        this.departmentStatus = departmentStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.create_time
     *
     * @return the value of department.create_time
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.create_time
     *
     * @param createTime the value for department.create_time
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.update_time
     *
     * @return the value of department.update_time
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.update_time
     *
     * @param updateTime the value for department.update_time
     *
     * @mbggenerated Sun Jan 21 01:25:58 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}