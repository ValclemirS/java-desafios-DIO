package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(unique = true)
    private String dateExpire;

    @Column(unique = true)
    private String securityCode;



    @Column(name = "available_limit", precision = 13, scale = 2)
    private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber(String number) {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getsecurityCode() {
        return securityCode;
    }

    public void setsecurityCode(String securityCode) {
        this.number = securityCode;
    }

      public String getdateExpire(String dateExpire) {
        return number;
    }

    public void setdateExpire(String dateExpire) {
        this.number = dateExpire;
    }




    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

}