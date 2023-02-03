package com.choucair.userinterfaces.AddProdut;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NorthwindProductPage {
    public static  final Target MODULE=Target.the("Click in northwind module ").locatedBy("//span[contains(text(),'Northwind')]");
    public static  final Target SECTION=Target.the("Click in product section").located(By.xpath("//ul[@id='nav_menu1_2_1']//li[3]"));
    public static  final Target NEWPRODUCT=Target.the("Click in new product button").located(By.xpath("//*[@id='GridDiv']/div[2]/div[2]/div/div[1]/div[1]/div/span"));
    public static  final Target NAMEPRODUCT=Target.the("add product name").located(By.id("Serenity_Demo_Northwind_ProductDialog9_ProductName"));

    public static  final Target SUPPLIER=Target.the("Click in suppliter").located(By.id("s2id_Serenity_Demo_Northwind_ProductDialog9_SupplierID"));

    public static  final Target CHOOSESUPPLIER=Target.the("Choosesupliter").located(By.xpath("//*[@id='s2id_autogen4_search']"));
    public static  final Target CATEGORY=Target.the("Click in category").located(By.id("s2id_Serenity_Demo_Northwind_ProductDialog9_CategoryID"));

    public static  final Target SELECTCATEGORY=Target.the("select category").located(By.xpath("//*[@id='s2id_autogen5_search']"));
    public static  final Target QUENTYPER=Target.the("add quantity per unit").located(By.id("Serenity_Demo_Northwind_ProductDialog9_QuantityPerUnit"));
    public static  final Target UNITPRICE=Target.the("enter unit value of the product").located(By.id("Serenity_Demo_Northwind_ProductDialog9_UnitPrice"));
    public static  final Target UNITSSTOCK=Target.the("units that are available").located(By.id("Serenity_Demo_Northwind_ProductDialog9_UnitsInStock"));
    public static  final Target UNITEORDER=Target.the("units that on request").located(By.id("Serenity_Demo_Northwind_ProductDialog9_UnitsOnOrder"));
    public static  final Target REORDER=Target.the("units in reorder").located(By.id("Serenity_Demo_Northwind_ProductDialog9_ReorderLevel"));

    public static  final Target SAVEBUTTON=Target.the("save product").located(By.xpath("//*[@id='Serenity_Demo_Northwind_ProductDialog9_Toolbar']/div/div/div/div[1]/div/span"));

}
