package com.loic.bootcamp.entity;

public class Country {

    private String name;
    private String capital;
    private int population;
    private Currency currency;

    public Country() {

    };

    public Country(String name, String capital, int population, Currency currency) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
