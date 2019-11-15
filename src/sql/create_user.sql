CREATE USER 'hbemployee'@'localhost' IDENTIFIED BY 'hbemployee';

GRANT ALL PRIVILEGES ON * . * TO 'hbemployee'@'localhost';

ALTER USER 'hbemployee'@'localhost' IDENTIFIED WITH mysql_native_password BY 'hbemployee';