//eager-loading: Hibernate: select d1_0.id,d1_0.created_at,d1_0.license_number,d1_0.name,d1_0.updated_at,b1_0.driver_id,b1_0.id,b1_0.total_distance,b1_0.booking_status,b1_0.created_at,dr1_0.id,case when dr1_1.driver_review_id is not null then 1 when dr1_2.passenger_review_id is not null then 2 when dr1_0.id is not null then 0 end,dr1_0.content,dr1_0.created_at,dr1_0.rating,dr1_0.updated_at,dr1_1.driver_review_content,dr1_2.passenger_review_content,b1_0.end_time,p1_0.id,p1_0.created_at,p1_0.name,p1_0.updated_at,b1_0.start_time,b1_0.updated_at from driver d1_0 left join booking b1_0 on d1_0.id=b1_0.driver_id left join bookingreview dr1_0 on dr1_0.id=b1_0.driver_review_id left join driver_review dr1_1 on dr1_0.id=dr1_1.driver_review_id left join passenger_review dr1_2 on dr1_0.id=dr1_2.passenger_review_id left join passenger p1_0 on p1_0.id=b1_0.passenger_id where d1_0.id=?

one to many -->default fetch type is LAZY
one to one -->default fetch type is EAGER
many to one -->default fetch type is EAGER
many to many -->default fetch type is LAZY
