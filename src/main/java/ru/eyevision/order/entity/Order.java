package ru.eyevision.order.entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "order", schema="pa_schema")
public class Order {

    @Id
    @GeneratedValue
    @Column(name="number")
    private int id;
    @Column(name="order_date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Nullable
    private LocalDate orderDate;
    @Column(name="last_name")
    @Nullable
    private String lastName;
    @Column(name="name")
    @Nullable
    private String name;
    @Column(name="patronymic")
    @Nullable
    private String patronymic;
    @Column(name="phone_number")
    @Nullable
    private String phone_number;
    @Column(name="dal_od")
    @Nullable
    private String dal_od;
    @Column(name="dal_cyl_od")
    @Nullable
    private String dal_cyl_od;
    @Column(name="dal_ax_od")
    @Nullable
    private String dal_ax_od;
    @Column(name="dal_os")
    @Nullable
    private String dal_os;
    @Column(name="dal_cyl_os")
    @Nullable
    private String dal_cyl_os;
    @Column(name="dal_ax_os")
    @Nullable
    private String dal_ax_os;
    @Column(name="bliz_od")
    @Nullable
    private String bliz_od;
    @Column(name="bliz_os")
    @Nullable
    private String bliz_os;
    @Column(name="srednee_os")
    @Nullable
    private String srednee_os;
    @Column(name="srednee_od")
    @Nullable
    private String srednee_od;
    @Column(name="rasst_dal")
    @Nullable
    private String rasst_dal;
    @Column(name="orders")
    @Nullable
    private String orders;
    @Column(name="comment")
    @Nullable
    private String comment;
    @Column(name="birthday")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Nullable
    private LocalDate birthday;
    @Column(name="bliz_cyl_od")
    @Nullable
    private String bliz_cyl_od;
    @Column(name="bliz_ax_od")
    @Nullable
    private String bliz_ax_od;
    @Column(name="bliz_cyl_os")
    @Nullable
    private String bliz_cyl_os;
    @Column(name="bliz_ax_os")
    @Nullable
    private String bliz_ax_os;
    @Column(name="rasst_bliz")
    @Nullable
    private String rasst_bliz;
    @Column(name="srednee_cyl_od")
    @Nullable
    private String srednee_cyl_od;
    @Column(name="srednee_ax_od")
    @Nullable
    private String srednee_ax_od;
    @Column(name="srednee_cyl_os")
    @Nullable
    private String srednee_cyl_os;
    @Column(name="srednee_ax_os")
    @Nullable
    private String srednee_ax_os;
    @Column(name="rasst_srednee")
    @Nullable
    private String rasst_srednee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Nullable
    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(@Nullable LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    @Nullable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(@Nullable String lastName) {
        this.lastName = lastName;
    }

    @Nullable
    public String getName() {
        return name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    @Nullable
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(@Nullable String patronymic) {
        this.patronymic = patronymic;
    }

    @Nullable
    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(@Nullable String phone_number) {
        this.phone_number = phone_number;
    }

    @Nullable
    public String getDal_od() {
        return dal_od;
    }

    public void setDal_od(@Nullable String dal_od) {
        this.dal_od = dal_od;
    }

    @Nullable
    public String getDal_cyl_od() {
        return dal_cyl_od;
    }

    public void setDal_cyl_od(@Nullable String dal_cyl) {
        this.dal_cyl_od = dal_cyl;
    }

    @Nullable
    public String getDal_ax_od() {
        return dal_ax_od;
    }

    public void setDal_ax_od(@Nullable String dal_ax) {
        this.dal_ax_od = dal_ax;
    }

    @Nullable
    public String getDal_os() {
        return dal_os;
    }

    public void setDal_os(@Nullable String dal_os) {
        this.dal_os = dal_os;
    }

    @Nullable
    public String getDal_cyl_os() {
        return dal_cyl_os;
    }

    public void setDal_cyl_os(@Nullable String dal_cyl_os) {
        this.dal_cyl_os = dal_cyl_os;
    }

    @Nullable
    public String getDal_ax_os() {
        return dal_ax_os;
    }

    public void setDal_ax_os(@Nullable String dal_ax_os) {
        this.dal_ax_os = dal_ax_os;
    }

    @Nullable
    public String getBliz_od() {
        return bliz_od;
    }

    public void setBliz_od(@Nullable String bliz_od) {
        this.bliz_od = bliz_od;
    }

    @Nullable
    public String getBliz_os() {
        return bliz_os;
    }

    public void setBliz_os(@Nullable String bliz_os) {
        this.bliz_os = bliz_os;
    }

    @Nullable
    public String getSrednee_os() {
        return srednee_os;
    }

    public void setSrednee_os(@Nullable String srednee_os) {
        this.srednee_os = srednee_os;
    }

    @Nullable
    public String getSrednee_od() {
        return srednee_od;
    }

    public void setSrednee_od(@Nullable String srednee_od) {
        this.srednee_od = srednee_od;
    }

    @Nullable
    public String getRasst_dal() {
        return rasst_dal;
    }

    public void setRasst_dal(@Nullable String rasst_dal) {
        this.rasst_dal = rasst_dal;
    }

    @Nullable
    public String getOrders() {
        return orders;
    }

    public void setOrders(@Nullable String orders) {
        this.orders = orders;
    }

    @Nullable
    public String getComment() {
        return comment;
    }

    public void setComment(@Nullable String comment) {
        this.comment = comment;
    }

    @Nullable
    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(@Nullable LocalDate birthday) {
        this.birthday = birthday;
    }

    @Nullable
    public String getBliz_cyl_od() {
        return bliz_cyl_od;
    }

    public void setBliz_cyl_od(@Nullable String bliz_cyl_od) {
        this.bliz_cyl_od = bliz_cyl_od;
    }

    @Nullable
    public String getBliz_ax_od() {
        return bliz_ax_od;
    }

    public void setBliz_ax_od(@Nullable String bliz_ax_od) {
        this.bliz_ax_od = bliz_ax_od;
    }

    @Nullable
    public String getBliz_cyl_os() {
        return bliz_cyl_os;
    }

    public void setBliz_cyl_os(@Nullable String bliz_cyl_os) {
        this.bliz_cyl_os = bliz_cyl_os;
    }

    @Nullable
    public String getBliz_ax_os() {
        return bliz_ax_os;
    }

    public void setBliz_ax_os(@Nullable String bliz_ax_os) {
        this.bliz_ax_os = bliz_ax_os;
    }

    @Nullable
    public String getRasst_bliz() {
        return rasst_bliz;
    }

    public void setRasst_bliz(@Nullable String rasst_bliz) {
        this.rasst_bliz = rasst_bliz;
    }

    @Nullable
    public String getSrednee_cyl_od() {
        return srednee_cyl_od;
    }

    public void setSrednee_cyl_od(@Nullable String srednee_cyl_od) {
        this.srednee_cyl_od = srednee_cyl_od;
    }

    @Nullable
    public String getSrednee_ax_od() {
        return srednee_ax_od;
    }

    public void setSrednee_ax_od(@Nullable String srednee_ax_od) {
        this.srednee_ax_od = srednee_ax_od;
    }

    @Nullable
    public String getSrednee_cyl_os() {
        return srednee_cyl_os;
    }

    public void setSrednee_cyl_os(@Nullable String srednee_cyl_os) {
        this.srednee_cyl_os = srednee_cyl_os;
    }

    @Nullable
    public String getSrednee_ax_os() {
        return srednee_ax_os;
    }

    public void setSrednee_ax_os(@Nullable String srednee_ax_os) {
        this.srednee_ax_os = srednee_ax_os;
    }

    @Nullable
    public String getRasst_srednee() {
        return rasst_srednee;
    }

    public void setRasst_srednee(@Nullable String rasst_srednee) {
        this.rasst_srednee = rasst_srednee;
    }
}
