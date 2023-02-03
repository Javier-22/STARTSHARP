package com.choucair.models.addproduct;

public class DataModelAddProducts {

    public String getStrProductName() {
        return strProductName;
    }

    public void setStrProductName(String strProductName) {
        this.strProductName = strProductName;
    }
    public String getStrUnitPrice() {
        return strUnitPrice;
    }

    public void setStrUnitPrice(String strUnitPrice) {
        this.strUnitPrice = strUnitPrice;
    }
    public String getStrUnitsInStock() {
        return strUnitsInStock;
    }

    public void setStrUnitsInStock(String strUnitsInStock) {
        this.strUnitsInStock = strUnitsInStock;
    }
    public String getStrUnitsOnOrder() {
        return strUnitsOnOrder;
    }

    public void setStrUnitsOnOrder(String strUnitsOnOrder) {
        this.strUnitsOnOrder = strUnitsOnOrder;
    }






    public String getStrReorderLevel() {
        return strReorderLevel;
    }

    public void setStrReorderLevel(String strReorderLevel) {
        this.strReorderLevel = strReorderLevel;
    }



    public String getStrQuantityPerU() {return strQuantityPerU;}

    public void setStrQuantityPerU(String strQuantityPerU) {this.strQuantityPerU = strQuantityPerU;}

    private   String strProductName;

    private   String strQuantityPerU;
    private   String strUnitPrice;
    private   String strUnitsInStock;
    private   String strUnitsOnOrder;
    private   String strReorderLevel;

    public String getStrSupplier() {
        return strSupplier;
    }

    public void setStrSupplier(String strSupplier) {
        this.strSupplier = strSupplier;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public void setStrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    private   String  strSupplier ;
    private   String strCategory;



}
