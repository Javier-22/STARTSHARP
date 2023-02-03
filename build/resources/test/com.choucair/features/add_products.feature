#Automator:Javier Alberto Romero Oviedo
#Page:startSharp
#Module:Northwind
#Section:Products

Feature: perform the tests on the start sharp portal
 and verify the different quality attributes

 As a user,
 I want to add new products,
 for sale


 @RegressionNorthwind @AddProduct
 Scenario Outline: add a new product
 Given the user has been sent to the Test page
 When I find the page I enter my credentials
  |strUserName    |strpassword  |
  |<strUserName> |<strpassword> |

And he user clicks on the Northwind module, register the products
  |strProductName  |strSupplier  |strCategory|strQuantityPerU   | strUnitPrice    |strUnitsInStock   | strUnitsOnOrder    |strReorderLevel  |
  |<strProductName>| <strSupplier> | <strCategory>|<strQuantityPerU> | <strUnitPrice> |<strUnitsInStock> |<strUnitsOnOrder>   |<strReorderLevel>|

Examples:
 |strUserName    |strpassword  |strProductName  |strSupplier               |strCategory       |strQuantityPerU    | strUnitPrice    |strUnitsInStock | strUnitsOnOrder    |strReorderLevel|
 |admin          | serenity    |     yuca       | Formaggi Fortini s.r.l.  |  produce         | 15 - 300 g rounds |     150         |   100          |       20           |  10           |

