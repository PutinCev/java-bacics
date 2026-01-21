package org.itmo.lab3;

import java.time.LocalDate;

public class House {

    private Integer floors;
    private Integer yearBuilt;
    private String name;

    public House(){

    }
    public House(Integer floors,Integer yearBuilt,String name){
        this.floors = floors;
        this.yearBuilt = yearBuilt;
        this.name = name;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public void setYearBuilt(Integer yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFloors() {
        return floors;
    }

    public Integer getYearBuilt() {
        return yearBuilt;
    }

    public String getName() {
        return name;
    }

    public Integer getYearAfterBuilt() {
        int getYearNow = LocalDate.now().getYear();
        int yearAfterBuilt = getYearNow - yearBuilt;
        return yearAfterBuilt;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", yearBuilt=" + yearBuilt +
                ", name='" + name + '\'' +
                ", Количество лет после постройки ='" + getYearAfterBuilt() + '\'' +
                '}';
    }
}
