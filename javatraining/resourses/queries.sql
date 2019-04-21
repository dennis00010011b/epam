// CREATING queries

CREATE TABLE places (
place VARCHAR PRIMARY KEY)

create table showplaces (
showplace VARCHAR PRIMARY KEY,
place VARCHAR REFERENCES places
)

CREATE TABLE shops(
shop VARCHAR PRIMARY KEY,
place VARCHAR REFERENCES places)

CREATE TABLE tours (
Name VARCHAR PRIMARY KEY,
price float,
startDate date,
endDate date,
rating integer,
isHot boolean)

CREATE TABLE excursiontours (
tour VARCHAR REFERENCES tours,
showplace1 VARCHAR REFERENCES showplaces,
showplace2 VARCHAR REFERENCES showplaces,
showplace3 VARCHAR REFERENCES showplaces,
showplace4 VARCHAR REFERENCES showplaces,
showplace5 VARCHAR REFERENCES showplaces
)

CREATE TABLE shoppingtours (
tour VARCHAR REFERENCES tours,
shop VARCHAR REFERENCES shops
)

CREATE TABLE resorttours (
tour VARCHAR REFERENCES tours,
place VARCHAR REFERENCES places
)

CREATE TABLE travelagencies(
name VARCHAR PRIMARY KEY)

CREATE TABLE persons
(   phonenumber VARCHAR(15) PRIMARY KEY,
    firstname VARCHAR,
    lastname VARCHAR
)

CREATE TABLE agents(
person VARCHAR REFERENCES persons,
bankaccount VARCHAR,
travelagency VARCHAR REFERENCES travelagencies)

CREATE TABLE customers(
person VARCHAR REFERENCES persons,
tour1 VARCHAR REFERENCES tours,
tour2 VARCHAR REFERENCES tours,
tour3 VARCHAR REFERENCES tours,
tour4 VARCHAR REFERENCES tours,
tour5 VARCHAR REFERENCES tours,
isRegular boolean,
discount float)


// CRUD queries

//CREATE queries

INSERT INTO persons (phonenumber,firstname,lastname)
VALUES ('+321', 'Griboedov', 'Ivan')

INSERT INTO showplaces
VALUES('Eifel Tower','Paris')

INSERT INTO shops
VALUES ('Fish market')

INSERT INTO tours
VALUES('Gold ring of Homel',50.4,'2019-05-03','2020-09-08',5,true)

INSERT INTO excursiontours(tour,showplace1,showplace2,showplace3)
VALUES(	'Gold ring of Homel'','Eifel Tower','Space needle','Bazar')

INSERT INTO resorttours
VALUES('Gold sand','Homel')

INSERT INTO shops
VALUES('Walmart','1st Ave S Kirkland')

INSERT INTO travelagencies
VALUES ('TravelWorld')

INSERT INTO agents
VALUES ('+321' ,'12345678987','TravelWorld')

INSERT INTO customers(person,tour1,tour2,isRegular,discount)
VALUES ('+375298887766','Elbrus','Elbrus',true,0.75)


// READ queries

SELECT * FROM persons
WHERE phonenumber='+375298712874'

SELECT firstname FROM persons
WHERE phonenumber='+375298712874'

SELECT * FROM tours,resorttours
WHERE tour='Gold sand' AND tours.name='Gold sand'

SELECT * FROM tours,excursiontours
WHERE tours.name='Elbrus' AND excursiontours.tour='Elbrus'

SELECT * FROM tours,shoppingtours
WHERE tours.name='Elbrus' AND shoppingtours.tour='Elbrus'

SELECT * FROM agents,persons
WHERE person='+321'

SELECT * FROM customers,persons
WHERE person='+321'

// UPDATE queries

ALTER TABLE public.agents
    ADD CONSTRAINT agents_person_fkey FOREIGN KEY (person)
    REFERENCES public.persons (phonenumber) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE

ALTER TABLE public.customers
    ADD CONSTRAINT customers_person_fkey FOREIGN KEY (person)
    REFERENCES public.persons (phonenumber) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE

ALTER TABLE public.excursiontours
    ADD CONSTRAINT excursiontours_showplace1_fkey FOREIGN KEY (showplace1)
    REFERENCES public.showplaces (showplace) MATCH SIMPLE
    ON UPDATE CASCADE
    ON DELETE CASCADE

UPDATE persons
SET phonenumber='+375290001122'
WHERE firstname='Griboedov'

UPDATE agents
SET bankaccount='131313
WHERE person='1'

UPDATE customers
SET tour3='Gold sand'
WHERE person='3'

UPDATE tours
SET name='Terskol'
WHERE name = 'Elbrus'

UPDATE excursiontours
SET showplace1='Luvr'
WHERE showplace1 = 'NotrDame'

UPDATE shoopingtours
SET shop1='Almi'
WHERE shop1 = 'Walmart'

UPDATE resorttours
SET tour='Nalchik'
WHERE tour = 'Minvody'

UPDATE places
SET place='Seattle'
WHERE place = 'NewYork'

UPDATE shops
SET shop='Fredmeyer'
WHERE shop = 'Walmart'

UPDATE showplaces
SET showplace='NotrDame'
WHERE showplace = 'Luvr'

// DELETE  queries

DELETE FROM persons
WHERE firstname='Griboedov'

DELETE FROM agents
WHERE person='1'

DELETE FROM customers
WHERE tour3='Gold sand'

DELETE FROM tours
WHERE name = 'Elbrus'

DELETE FROM excursiontours
WHERE showplace1 = 'NotrDame'

DELETE FROM shoopingtours
WHERE shop1 = 'Walmart'

DELETE FROM resorttours
WHERE tour = 'Minvody'

DELETE FROM places
WHERE place = 'NewYork'

DELETE FROM shops
WHERE shop = 'Walmart'

DELETE FROM showplaces
WHERE showplace = 'Luvr'

