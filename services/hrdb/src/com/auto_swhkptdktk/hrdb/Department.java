/*Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.auto_swhkptdktk.hrdb;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Department generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`DEPARTMENT`", uniqueConstraints = {
        @UniqueConstraint(name = "`SYS_IDX_UK_DEPARTMENT_DEPT_CODE_10095`", columnNames = {"`DEPT_CODE`"})})
public class Department implements Serializable {

    private Integer deptId;
    private String name;
    private Integer budget;
    private Integer q1;
    private Integer q2;
    private Integer q3;
    private Integer q4;
    private String deptCode;
    private String location;
    private Integer tenantId;
    private List<Employee> employees;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`DEPT_ID`", nullable = false, scale = 0, precision = 10)
    public Integer getDeptId() {
        return this.deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Column(name = "`NAME`", nullable = true, length = 255)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "`BUDGET`", nullable = true, scale = 0, precision = 10)
    public Integer getBudget() {
        return this.budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    @Column(name = "`Q1`", nullable = true, scale = 0, precision = 10)
    public Integer getQ1() {
        return this.q1;
    }

    public void setQ1(Integer q1) {
        this.q1 = q1;
    }

    @Column(name = "`Q2`", nullable = true, scale = 0, precision = 10)
    public Integer getQ2() {
        return this.q2;
    }

    public void setQ2(Integer q2) {
        this.q2 = q2;
    }

    @Column(name = "`Q3`", nullable = true, scale = 0, precision = 10)
    public Integer getQ3() {
        return this.q3;
    }

    public void setQ3(Integer q3) {
        this.q3 = q3;
    }

    @Column(name = "`Q4`", nullable = true, scale = 0, precision = 10)
    public Integer getQ4() {
        return this.q4;
    }

    public void setQ4(Integer q4) {
        this.q4 = q4;
    }

    @Column(name = "`DEPT_CODE`", nullable = true, length = 20)
    public String getDeptCode() {
        return this.deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Column(name = "`LOCATION`", nullable = true, length = 255)
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Column(name = "`TENANT_ID`", nullable = true, scale = 0, precision = 10)
    public Integer getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    @JsonInclude(Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "department")
    public List<Employee> getEmployees() {
        return this.employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        final Department department = (Department) o;
        return Objects.equals(getDeptId(), department.getDeptId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDeptId());
    }
}

