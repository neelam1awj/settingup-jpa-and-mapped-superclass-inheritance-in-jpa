desc passenger;
+------------+--------------+------+-----+---------+----------------+
| Field      | Type         | Null | Key | Default | Extra          |
+------------+--------------+------+-----+---------+----------------+
| id         | bigint       | NO   | PRI | NULL    | auto_increment |
| created_at | datetime(6)  | NO   |     | NULL    |                |
| updated_at | datetime(6)  | NO   |     | NULL    |                |
| name       | varchar(255) | YES  |     | NULL    |                |
+------------+--------------+------+-----+---------+----------------+
4 rows in set (0.20 sec)

mysql> desc booking;
+------------------+-----------------------------------------------------------------------------------------------------------------------+------+-----+---------+----------------+
| Field            | Type                                                                                                                  | Null | Key | Default | Extra          |
+------------------+-----------------------------------------------------------------------------------------------------------------------+------+-----+---------+----------------+
| id               | bigint                                                                                                                | NO   | PRI | NULL    | auto_increment |
| created_at       | datetime(6)                                                                                                           | NO   |     | NULL    |                |
| updated_at       | datetime(6)                                                                                                           | NO   |     | NULL    |                |
| total_distance   | bigint                                                                                                                | YES  |     | NULL    |                |
| booking_status   | enum('ASSIGNED','ASSIGNING_DRIVER','CAB_ARRIVED','CANCELLED','COMPLETED','CONFIRMED','IN_RIDE','PENDING','SCHEDULED') | YES  |     | NULL    |                |
| end_time         | datetime(6)                                                                                                           | YES  |     | NULL    |                |
| start_time       | datetime(6)                                                                                                           | YES  |     | NULL    |                |
| driver_id        | bigint                                                                                                                | YES  | MUL | NULL    |                |
| driver_review_id | bigint                                                                                                                | YES  | UNI | NULL    |                |
| passenger_id     | bigint                                                                                                                | YES  | MUL | NULL    |                |
+------------------+-----------------------------------------------------------------------------------------------------------------------+------+-----+---------+----------------+
10 rows in set (0.01 sec)

mysql> desc driver;
+----------------+--------------+------+-----+---------+----------------+
| Field          | Type         | Null | Key | Default | Extra          |
+----------------+--------------+------+-----+---------+----------------+
| id             | bigint       | NO   | PRI | NULL    | auto_increment |
| created_at     | datetime(6)  | NO   |     | NULL    |                |
| updated_at     | datetime(6)  | NO   |     | NULL    |                |
| license_number | varchar(255) | NO   | UNI | NULL    |                |
| name           | varchar(255) | YES  |     | NULL    |                |
+----------------+--------------+------+-----+---------+----------------+
5 rows in set (0.01 sec)
