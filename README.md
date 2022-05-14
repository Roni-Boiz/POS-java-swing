# POS-java-swing
In this repository I have build POS system by Java swing.
It have 3 main views of which customer form, item form and order form.
In each view we can create, update, delete and search customers, items and orders. Further,
I have use Jasper reports to generate invoices, customer summary reports.

## Initial Requirements
Before you run this project make sure you have satisfy following conditions,
1. Install Java version 1.8.0/(above) type `java -version` in cmd to verify
2. Install MySQL Server 8.0/(above) type `mysql -V` or `SELECT VERSION()` to verify
3. Import this [Database](/pos-database.sql) to your MySQL server
4. Update following three variables,
   - DB_NAME -> your database name `eg:- pos`
   - DB_USER -> User in MySQL server `default root`
   - DB_PASSWORD -> User password `default ""`

