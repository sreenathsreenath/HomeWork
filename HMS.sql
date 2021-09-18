
-- find no male and female

select gender ,count('M'),count('F')
from PATIENT_MASTER; 


-- admitted in jan month

select * from ROOM_ALLOCATION; 
select* from ROOM_ALLOCATION where monthname(admission_date)='December'; 

-- never alloted to any patient 

select room_no 
from ROOM_ALLOCATION 
group by room_no 
having count(room_no)>1; 


--Allocated  more than once 

SELECT room_no,room_type
from ROOM_MASTER
where room_no in( select room_no from room_allocation group by room_no HAVING count(room_no)>1);