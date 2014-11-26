
-- #df:changeUser(system)#
-- #df:checkUser(mainSchema, mainUser)#
create user /*$dfprop.mainUser*/ identified by /*$dfprop.mainPassword*/;

-- #df:reviveUser()#
-- #df:checkUser(grant)#
grant connect to /*$dfprop.mainUser*/;
grant resource to /*$dfprop.mainUser*/;

-- #df:backToMainUser()#
create table STATION(
    STATION_ID NUMBER(9) NOT NULL PRIMARY KEY,
    STATION_NAME VARCHAR(200) NOT NULL,
    BIRTHDATE DATE,
    FORMALIZED_DATETIME TIMESTAMP(3),
    HOME_COUNT NUMBER(9),
    WORKING_KILOMETER NUMBER(4,2)
);
