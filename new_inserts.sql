-------------------
--  ADMIN INSERT --
-------------------

Insert into ADMIN 
values (100000001, 'Vijay Shankar', 'vshanker123', NULL);

Insert into ADMIN 
values (100000002, 'Vishal Shankar', 'password123', NULL);

-- for now we manually assign the images, still need to figure out a way to automatically assign profile picture and store it in SQLdev directory (instead of local)
-- for now we have the password stored as plaintext, will change to MD5 hash (will probably require the field to also be 32bits)
select * from ADMIN;
------------------------------------------------------------------------------------------------------------------

-------------------
--  AGENT INSERT --
-------------------

Insert into AGENT
values (200000001, 'Edward Donne', 0, 'Donne001', 10000, NULL);

Insert into AGENT
values (200000002, 'Bill John', 0, 'John002', 10000, NULL);

Insert into AGENT
values (200000003, 'Jack Mason', 0, 'Mason003', 12000, NULL);

Insert into AGENT
values (200000004, 'Aidan Flemmings', 0, 'Flemmings004', 8000, NULL);

-- for now we manually assign the images, still need to figure out a way to automatically assign profile picture and store it in SQLdev directory (instead of local)
-- for now we hardcode ID while also using it for matching it for COMMISSION attribute, but this will need to be changed for java
-- for now we have the password stored as plaintext, will change to MD5 hash (will probably require the field to also be 32bits)
-- have to add a AED at the start of commission and salary
select * from AGENT;
------------------------------------------------------------------------------------------------------------------

----------------------
--  PROPERTY INSERT --
----------------------

-- Townhouse or Villa that can be owned --

Insert into PROPERTY
values (800000001, '2 BEDROOMS, 2 BATHROOMS, 1600SQFT', 900000, 'TOWNHOUSE', 'T_O_TOWNH_0001', 'THE_OASIS');

Insert into PROPERTY
values (800000002, '4 BEDROOMS, 3 BATHROOMS, 3700SQFT', 1900000, 'VILLA', 'T_O_VILLA_0002', 'THE_OASIS');

Insert into PROPERTY
values (800000003, '5 BEDROOMS, 5 BATHROOMS, 4800SQFT', 2800000, 'VILLA', 'T_O_VILLA_0003', 'THE_OASIS');

Insert into PROPERTY
values (800000008, '6 BEDROOMS, 5 BATHROOMS, 5500SQFT', 3200000, 'VILLA', 'T_O_VILLA_0004', 'THE_OASIS');

Insert into PROPERTY
values (800000009, '4 BEDROOMS, 3 BATHROOMS, 4000SQFT', 2100000, 'VILLA', 'T_O_VILLA_0005', 'THE_OASIS');

Insert into PROPERTY
values (800000010, '3 BEDROOMS, 3 BATHROOMS, 2500SQFT', 1300000, 'TOWNHOUSE', 'T_O_TOWNH_0002', 'THE_OASIS');

Insert into PROPERTY
values (800000011, '6 BEDROOMS, 5 BATHROOMS, 5300SQFT', 3000000, 'VILLA', 'T_O_VILLA_0006', 'THE_OASIS');

Insert into PROPERTY
values (800000012, '4 BEDROOMS, 5 BATHROOMS, 3900SQFT', 2100000, 'VILLA', 'T_O_VILLA_0007', 'THE_OASIS');

-- Apartments that can be rented --

Insert into PROPERTY
values (800000004, '2 BEDROOMS, 2 BATHROOM, 800SQM ', 800000, 'APARTMENT', 'CLEOPATRA_A_0001', 'THE_OASIS');

Insert into PROPERTY
values (800000005, '3 BEDROOMS, 2 BATHROOMS, 1400SQM ', 1300000, 'APARTMENT', 'CLEOPATRA_A_0002', 'THE_OASIS');

Insert into PROPERTY
values (800000006, '2 BEDROOMS, 2 BATHROOMS, 900SQM ', 800000, 'APARTMENT', 'CLEOPATRA_B_0001', 'THE_OASIS');

Insert into PROPERTY
values (800000007, '3 BEDROOMS, 3 BATHROOMS, 1600SQM ', 1600000, 'APARTMENT', 'CLEOPATRA_B_0002', 'THE_OASIS');


select * from PROPERTY;
------------------------------------------------------------------------------------------------------------------

-------------------
--  OWNER INSERT --
-------------------

Insert into OWNER
values (300000001, 'BASHA REAL ESTATE', 971551234567, '1234');

Insert into OWNER
values (300000002, 'IBRAHIM AL INKIN', 971555050505, '1234');

Insert into OWNER
values (300000003, 'LEONARDO AL VINCI', 971553141592, '1234');

-- have to add a AED at the start of price
select * from OWNER;
------------------------------------------------------------------------------------------------------------------

--------------------
--  RENTER INSERT --
--------------------

Insert into RENTER
values (400000001, 'ABDULLAH ZAHID', 971552422311, '1234');

Insert into RENTER
values (400000002, 'YOUSSED ELMADANY', 971501112222, '1234');

Insert into RENTER
values (400000003, 'ABDULLA USMANI', 971566969696, '1234');

Insert into RENTER
values (400000004, 'LAYTH ALKHAIRULLA', 971554204200, '1234');

select * from RENTER;
------------------------------------------------------------------------------------------------------------------

---------------------------
--  RENT_CONTRACT INSERT --
---------------------------

Insert into RENT_CONTRACT
values (900000001, '40000', '31-AUG-2022', '31-AUG-2023', 400000001);

Insert into RENT_CONTRACT
values (900000002, '75000', '31-JUL-2022', '31-JUL-2023', 400000002);

Insert into RENT_CONTRACT
values (900000003, '50000', '02-JUL-2022', '02-JUL-2023', 400000003);

Insert into RENT_CONTRACT
values (900000004, '90000', '30-OCT-2022', '30-OCT-2023', 400000004);

-- Date default format is 'DD-MON-YY', can be changed using:
-- ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY-MM-DD';
-- etc.
select * from RENT_CONTRACT;
------------------------------------------------------------------------------------------------------------------

-----------------------
--  RENTED_BY INSERT --
-----------------------

Insert into RENTED_BY
values (800000004, 400000001);

Insert into RENTED_BY
values (800000005, 400000002);

Insert into RENTED_BY
values (800000006, 400000003);

Insert into RENTED_BY
values (800000002, 400000004);

--
select * from RENTED_BY;
------------------------------------------------------------------------------------------------------------------

----------------------
--  OWNED_BY INSERT --
----------------------

Insert into OWNED_BY
values (800000001, 300000003, '01-JUL-2022'); -- not owned by company, sold by agent 1

Insert into OWNED_BY
values (800000002, 300000002, '01-AUG-2022'); -- not owned by comapny, sold by agent 2

Insert into OWNED_BY
values (800000003, 300000002, '31-JUL-2022'); -- not owned by company, trying to sell (A2, A3, A4)

Insert into OWNED_BY
values (800000008, 300000001, '01-JUL-2022'); -- owned by company, trying to sell (A1, A2, A4)

Insert into OWNED_BY
values (800000009, 300000001, '31-AUG-2022'); -- owned by company, trying to sell (A1, A3)

Insert into OWNED_BY
values (800000010, 300000002, '31-JUL-2022'); -- not owned by comapny, sold by agent 3

Insert into OWNED_BY
values (800000011, 300000003, '02-JUL-2022'); -- not owned by company, sold by agent 4

Insert into OWNED_BY
values (800000012, 300000003, '01-JUL-2022'); -- not owned by company, sold by agent 1

-- Apartments

Insert into OWNED_BY
values (800000004, 300000001, '01-JUL-2022');

Insert into OWNED_BY
values (800000005, 300000001, '01-JUL-2022');

Insert into OWNED_BY
values (800000006, 300000001, '01-JUL-2022');

Insert into OWNED_BY
values (800000007, 300000001, '01-JUL-2022');


--
select * from OWNED_BY;
------------------------------------------------------------------------------------------------------------------

-----------------------------
--  RESPONSIBLE FOR INSERT --
-----------------------------

-- Properties that have been sold

Insert into RESPONSIBLE_FOR
values (200000001, 800000001, (select 0.05*property.price from PROPERTY where property.property_id = 800000001));

Insert into RESPONSIBLE_FOR
values (200000001, 800000012, (select 0.05*property.price from PROPERTY where property.property_id = 800000001));

Insert into RESPONSIBLE_FOR
values (200000002, 800000002, (select 0.05*property.price from PROPERTY where property.property_id = 800000002));

Insert into RESPONSIBLE_FOR
values (200000003, 800000010, (select 0.05*property.price from PROPERTY where property.property_id = 800000010));

Insert into RESPONSIBLE_FOR
values (200000004, 800000011, (select 0.05*property.price from PROPERTY where property.property_id = 800000011));


-- Properties that are trying to be sold

Insert into RESPONSIBLE_FOR
values (200000002, 800000003, NULL);

Insert into RESPONSIBLE_FOR
values (200000003, 800000003, NULL);

Insert into RESPONSIBLE_FOR
values (200000004, 800000003, NULL);

-- 

Insert into RESPONSIBLE_FOR
values (200000001, 800000008, NULL);

Insert into RESPONSIBLE_FOR
values (200000002, 800000008, NULL);

Insert into RESPONSIBLE_FOR
values (200000004, 800000008, NULL);

--

Insert into RESPONSIBLE_FOR
values (200000001, 800000009, NULL);

Insert into RESPONSIBLE_FOR
values (200000004, 800000009, NULL);


select * from RESPONSIBLE_FOR;
------------------------------------------------------------------------------------------------------------------

--------------------------
--  IN_CHARGE_OF INSERT --
--------------------------

Insert into IN_CHARGE_OF 
values (100000001, 200000001);

Insert into IN_CHARGE_OF 
values (100000001, 200000002);

Insert into IN_CHARGE_OF 
values (100000001, 200000003);

Insert into IN_CHARGE_OF 
values (100000001, 200000004);

------------------------------
Insert into IN_CHARGE_OF 
values (100000002, 200000001);

Insert into IN_CHARGE_OF 
values (100000002, 200000002);

Insert into IN_CHARGE_OF 
values (100000002, 200000003);

Insert into IN_CHARGE_OF 
values (100000002, 200000004);


select * from IN_CHARGE_OF;
------------------------------------------------------------------------------------------------------------------

UPDATE AGENT
SET COMMISSION = (select SUM(comm_if) from RESPONSIBLE_FOR where responsible_for.agent_agent_id = 200000001)
WHERE AGENT_ID = 200000001;

UPDATE AGENT
SET COMMISSION = (select SUM(comm_if) from RESPONSIBLE_FOR where responsible_for.agent_agent_id = 200000002)
WHERE AGENT_ID = 200000002;

UPDATE AGENT
SET COMMISSION = (select SUM(comm_if) from RESPONSIBLE_FOR where responsible_for.agent_agent_id = 200000003)
WHERE AGENT_ID = 200000003;

UPDATE AGENT
SET COMMISSION = (select SUM(comm_if) from RESPONSIBLE_FOR where responsible_for.agent_agent_id = 200000004)
WHERE AGENT_ID = 200000004;

select * from agent;


--select property_id,description,price,type,p_name,location from property, responsible_for where property.property_id = responsible_for.property_property_id and responsible_for.agent_agent_id=200000001;
--select O.owner_id, p.property_id,p.description,p.price,p.type,p.p_name,p.location from Owner O, Owned_by OB,property p where o.owner_id=ob.owner_owner_id and OB.property_property_id in (select p.property_id from  responsible_for where p.property_id = responsible_for.property_property_id and responsible_for.agent_agent_id=200000003 and responsible_for.comm_if is null);
--commit;

