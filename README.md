# settingup-jpa-and-mapped-superclass-inheritance-in-jpa
setting up db connection in springboot project and inheritance in JPA using @Inheritance(strategy=InheritanceType.jOINED) and @MappedSuperclass annotation in base model
mysql> use uber_db_local;
show tables;
+-------------------------+
| Tables_in_uber_db_local |
+-------------------------+
| bookingreview           |
| driver_review           |
| hibernate_sequences     |
| passenger_review        |
+-------------------------+
4 rows in set (0.01 sec)

mysql> desc bookingreview;
+------------+--------------+------+-----+---------+-------+
| Field      | Type         | Null | Key | Default | Extra |
+------------+--------------+------+-----+---------+-------+
| id         | bigint       | NO   | PRI | NULL    |       |
| created_at | datetime(6)  | NO   |     | NULL    |       |
| updated_at | datetime(6)  | NO   |     | NULL    |       |
| content    | varchar(255) | NO   |     | NULL    |       |
| rating     | double       | YES  |     | NULL    |       |
+------------+--------------+------+-----+---------+-------+
5 rows in set (0.01 sec)

mysql> desc driver_review;
+-----------------------+--------------+------+-----+---------+-------+
| Field                 | Type         | Null | Key | Default | Extra |
+-----------------------+--------------+------+-----+---------+-------+
| driver_review_content | varchar(255) | YES  |     | NULL    |       |
| driver_review_id      | bigint       | NO   | PRI | NULL    |       |
+-----------------------+--------------+------+-----+---------+-------+
2 rows in set (0.00 sec)

mysql> desc driver_review;
+-----------------------+--------------+------+-----+---------+-------+
| Field                 | Type         | Null | Key | Default | Extra |
+-----------------------+--------------+------+-----+---------+-------+
| driver_review_content | varchar(255) | YES  |     | NULL    |       |
| driver_review_id      | bigint       | NO   | PRI | NULL    |       |
+-----------------------+--------------+------+-----+---------+-------+
2 rows in set (0.00 sec)

mysql>