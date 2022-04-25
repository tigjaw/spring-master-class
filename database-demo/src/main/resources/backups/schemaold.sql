/*hibernate creates embedded database automatically*/

create table person
(
   id integer not null,
   name varchar(255) not null,
   location varchar(255),
   birth_date timestamp,
   primary key(id)
);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10001,  'Ross', 'Hyderabad', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10002,  'Rachel', 'New York', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10003,  'Pheobe', 'Amsterdam', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10004,  'Chandler', 'London', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10005,  'Joey', 'Rome', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10006,  'Monica', 'Cairo', sysdate());