package com.cai.entity;

import java.sql.Timestamp;

public class LeaseUser {
    private String user_id;
    private String user_name;
    private String password;
    private Timestamp login_date;
    private String branch_code;
    private String active_branches;
    private String dept_id;
    private String case_no;
    private String phone_no;
    private String initial_flg;
    private Timestamp password_set_date;
    private Timestamp apply_start_dt;
    private Timestamp apply_end_dt;
    private String lock_flag;
    private String delete_flg;
    private String modify_user;
    private Timestamp modify_date;
    private String wrong_pwd_count;
    private Timestamp last_locked_date;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getLogin_date() {
        return login_date;
    }

    public void setLogin_date(Timestamp login_date) {
        this.login_date = login_date;
    }

    public String getBranch_code() {
        return branch_code;
    }

    public void setBranch_code(String branch_code) {
        this.branch_code = branch_code;
    }

    public String getActive_branches() {
        return active_branches;
    }

    public void setActive_branches(String active_branches) {
        this.active_branches = active_branches;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getCase_no() {
        return case_no;
    }

    public void setCase_no(String case_no) {
        this.case_no = case_no;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getInitial_flg() {
        return initial_flg;
    }

    public void setInitial_flg(String initial_flg) {
        this.initial_flg = initial_flg;
    }

    public Timestamp getPassword_set_date() {
        return password_set_date;
    }

    public void setPassword_set_date(Timestamp password_set_date) {
        this.password_set_date = password_set_date;
    }

    public Timestamp getApply_start_dt() {
        return apply_start_dt;
    }

    public void setApply_start_dt(Timestamp apply_start_dt) {
        this.apply_start_dt = apply_start_dt;
    }

    public Timestamp getApply_end_dt() {
        return apply_end_dt;
    }

    public void setApply_end_dt(Timestamp apply_end_dt) {
        this.apply_end_dt = apply_end_dt;
    }

    public String getLock_flag() {
        return lock_flag;
    }

    public void setLock_flag(String lock_flag) {
        this.lock_flag = lock_flag;
    }

    public String getDelete_flg() {
        return delete_flg;
    }

    public void setDelete_flg(String delete_flg) {
        this.delete_flg = delete_flg;
    }

    public String getModify_user() {
        return modify_user;
    }

    public void setModify_user(String modify_user) {
        this.modify_user = modify_user;
    }

    public Timestamp getModify_date() {
        return modify_date;
    }

    public void setModify_date(Timestamp modify_date) {
        this.modify_date = modify_date;
    }

    public String getWrong_pwd_count() {
        return wrong_pwd_count;
    }

    public void setWrong_pwd_count(String wrong_pwd_count) {
        this.wrong_pwd_count = wrong_pwd_count;
    }

    public Timestamp getLast_locked_date() {
        return last_locked_date;
    }

    public void setLast_locked_date(Timestamp last_locked_date) {
        this.last_locked_date = last_locked_date;
    }

    @Override
    public String toString() {
        return "LeaseUser{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                '}';
    }
}
