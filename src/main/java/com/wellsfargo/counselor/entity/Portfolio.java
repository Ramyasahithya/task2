package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import javax.sound.sampled.Port;
import java.sql.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @Column(nullable = false)
    private Client client;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio(){}

    public Portfolio(Client client,String creationDate){
        this.client=client;
        this.creationDate=creationDate;

    }

    public long getPortfolioId(){
        return portfolioId;
    }
    public void setCreationDate(String creationDate){
        this.creationDate=creationDate;
    }

    public String getCreationDate(){
        return creationDate;
    }

    public Client getClient()
    {
        return client;
    }

    public void setClient(Client client){
        this.client=client;
    }

}
