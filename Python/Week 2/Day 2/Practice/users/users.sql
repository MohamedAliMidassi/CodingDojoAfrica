SELECT * FROM users_schema.users;

insert into users (first_name,last_name,email)
values ('jane','doe','jane@gamil.com'),('joe','doe','joe@gmail'),('josh','doe','josh@gmail.com');
update users
set email='joe@gmail.com'
where id=2;

select email from users
limit 1;

select id from users
order by id DESC
limit 1;

update users
set last_name=Pancakes
where id=3;

SET SQL_SAFE_UPDATES = 0;

delete from users
where id=2;

select * from users
order by first_name ;

select * from users
order by first_name DESC;

