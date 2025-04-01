package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @Column(nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private float quantity;

    protected Security(){}

    public void Security(Portfolio portfolio,String name,String category,String purchaseDate,float purchasePrice,float quantity){
        this.portfolio=portfolio;
        this.name=name;
        this.category=category;
        this.purchaseDate=purchaseDate;
        this.purchasePrice=purchasePrice;
    }

    public long getSecurityId(){
        return  securityId;
    }

    public void setPortfolio(Portfolio portfolio)
    {
        this.portfolio=portfolio;
    }

    public Portfolio getPortfolio(){
        return portfolio;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
}
