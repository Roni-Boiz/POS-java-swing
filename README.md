# POS-java-swing
In this repository I have build POS system by Java swing.
It have 3 main views of which customer form, item form and order form.
In each view we can create, update, delete and search customers, items and orders. Further,
I have use Jasper reports to generate invoices, customer summary reports.

### Setup your environment 🛠
Before you run this project make sure you have satisfy following conditions,
1. Install Java version 1.8.0/(above) type `java -version` in cmd to verify
2. Install MySQL Server version 8.0.15/(above) type `mysql -V` or `SELECT VERSION()` to verify
3. Import this [Database](/pos-database.sql) to your MySQL server (after import no need to keep that file in your project directory)
4. Try to open the project in your favourite text editor `eg:- NetBeans IDE`, if you don't see any warning or errors your are good to go
5. Update following three variables in following java [file](/src/db/DBConnection.java), Row 24 of **/src/db/DBConnection.java**
   - DB_NAME -> your database name `eg:- pos`
   - DB_USER -> User in MySQL server `default root`
   - DB_PASSWORD -> User password `default ""`

### Run and test project 
Since you do not have any data in your database you need to add some customers and items to database.
1. Open **src/view/customerForm.java** and run this file (press `Shift + F6`) then add some customers.
2. Open **src/view/itemForm.java** and run this file (press `Shift + F6`) then add some items.
3. Then open **src/view/orderFormNew.java** and run this file (press `Shift + F6`) then try to add some orders. From this form, you can also access previous forms as well.

### Special Points 
♦ In Each form after filling one feild pressing enter key will go to next feild.<br>
♦ Selecting row in the table will load data back to specified feilds.<br>
♦ To search any customer or item you can use `customerId` or `itemCode` feild respectively.<br>

