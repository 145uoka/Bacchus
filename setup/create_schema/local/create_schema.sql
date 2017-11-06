-- Role: Bacchus

-- DROP ROLE Bacchus;

CREATE ROLE bacchus LOGIN
PASSWORD 'bacchus'
NOSUPERUSER INHERIT NOCREATEDB NOCREATEROLE NOREPLICATION;


-- Schema: Bacchus

-- DROP SCHEMA Bacchus;

CREATE SCHEMA bacchus
AUTHORIZATION bacchus;

GRANT ALL ON SCHEMA bacchus TO bacchus;
GRANT ALL ON SCHEMA bacchus TO public;
