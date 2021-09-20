
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


--DISEASE ASTHMA
  select *  from PATIENT_MASTER where disease not like 'Asthma';

  
----Display the patient_id,patient_name, doctor_id, doctor_name, room_no, room_type and admission_date.



select doctor_name,D.doctor_id,name,P.pid,R.room_no,admission_date,RM.Room_type
 
 from  doctor_master D inner join patient_master P on 
 D.doctor_id=P.doctor_id
 inner join Room_allocation R on 
 R.pid=P.pid
 inner join Room_master RM on
 Rm.Room_no=R.Room_no;
 