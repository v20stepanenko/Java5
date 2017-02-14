
CREATE TABLE companies (
  id_company INT NOT NULL AUTO_INCREMENT,
  company varchar(50) UNIQUE NOT NULL ,
  PRIMARY KEY (id_company)
);

CREATE TABLE developers (
  id_dev INT NOT NULL AUTO_INCREMENT,
  developer varchar(50) NOT NULL ,
  id_company INT NOT NULL ,
  PRIMARY KEY (id_dev),
  FOREIGN KEY (id_company)
    REFERENCES companies(id_company)
    ON DELETE SET NULL);

CREATE TABLE developer_skills (
  id_dev INT NOT NULL AUTO_INCREMENT,
  skills varchar(15) NOT NULL,
  FOREIGN KEY (id_dev)
    REFERENCES developers(id_dev)
    ON DELETE SET NULL );

CREATE TABLE orders (
  project varchar(25) NOT NULL ,
  customers varchar(50) NOT NULL ,
  id_project INT NOT NULL AUTO_INCREMENT,
  id_company INT NOT NULL ,
  PRIMARY KEY (id_project),
  FOREIGN KEY (id_company)
   REFERENCES companies(id_company)
   ON DELETE SET NULL);

CREATE TABLE tasks (
  id_dev INT UNIQUE  NOT NULL ,
  id_project INT UNIQUE NOT NULL,
  FOREIGN KEY (id_project)
   REFERENCES orders(id_project)
   ON DELETE SET NULL,
  FOREIGN KEY (id_dev)
   REFERENCES developers(id_dev)
   ON DELETE  SET NULL);




