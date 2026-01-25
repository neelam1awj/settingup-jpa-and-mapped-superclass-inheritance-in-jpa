# settingup-jpa-and-mapped-superclass-inheritance-in-jpa
setting up db connection in springboot project and inheritance in JPA using @Inheritance(strategy=InheritanceType.jOINED) and @MappedSuperclass annotation in base model
mysql> use uber_db_local;
show tables;
+-------------------------+
| Tables_in_uber_db_local |
+-------------------------+
| booking_review          |
| passenger_review        |
+-------------------------+
2 rows in set (0.03 sec)

mysql> desc booking_review;
+------------+--------------+------+-----+---------+----------------+
| Field      | Type         | Null | Key | Default | Extra          |
+------------+--------------+------+-----+---------+----------------+
| id         | bigint       | NO   | PRI | NULL    | auto_increment |
| created_at | datetime(6)  | NO   |     | NULL    |                |
| updated_at | datetime(6)  | NO   |     | NULL    |                |
| content    | varchar(255) | NO   |     | NULL    |                |
| rating     | double       | YES  |     | NULL    |                |
+------------+--------------+------+-----+---------+----------------+
5 rows in set (0.02 sec)

mysql> desc passenger_review;
+--------------------------+--------------+------+-----+---------+-------+
| Field                    | Type         | Null | Key | Default | Extra |
+--------------------------+--------------+------+-----+---------+-------+
| passenger_rating         | varchar(255) | YES  |     | NULL    |       |
| passenger_review_content | varchar(255) | YES  |     | NULL    |       |
| passenger_review_id      | bigint       | NO   | PRI | NULL    |       |
+--------------------------+--------------+------+-----+---------+-------+
3 rows in set (0.01 sec)
mysql>