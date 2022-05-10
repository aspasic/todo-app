INSERT INTO users (id, email, username, password, name, last_name, role)
              VALUES (1,'miroslav@maildrop.cc','miroslav','$2y$12$NH2KM2BJaBl.ik90Z1YqAOjoPgSd0ns/bF.7WedMxZ54OhWQNNnh6','Miroslav','Simic','ADMIN');
INSERT INTO users (id, email, username, password, name, last_name, role)
              VALUES (2,'tamara@maildrop.cc','tamara','$2y$12$DRhCpltZygkA7EZ2WeWIbewWBjLE0KYiUO.tHDUaJNMpsHxXEw9Ky','Tamara','Milosavljevic','KORISNIK');
INSERT INTO users (id, email, username, password, name, last_name, role)
              VALUES (3,'petar@maildrop.cc','petar','$2y$12$i6/mU4w0HhG8RQRXHjNCa.tG2OwGSVXb0GYUnf8MZUdeadE4voHbC','Petar','Jovic','KORISNIK');

INSERT INTO project (id, name, project_owner_id) VALUES (1, "Projekat 1", 1);
INSERT INTO project (id, name, project_owner_id) VALUES (2, "Projekat 2", 1);
INSERT INTO project (id, name, project_owner_id) VALUES (3, "Projekat 3", 2);
INSERT INTO project (id, name, project_owner_id) VALUES (4, "Projekat 4", 3);

INSERT INTO task (id, name, project_id, description, due_date, completed) 
					VALUES(1, 'Task 1', 1, 'Task 1 Description', '2022-04-07', FALSE);
INSERT INTO task (id, name, project_id, description, due_date, completed) 
					VALUES(2, 'Task 2', 1, 'Task 2 Description', '2022-05-07', FALSE);
INSERT INTO task (id, name, project_id, description, due_date, completed) 
					VALUES(3, 'Task 3', 2, 'Task 3 Description', '2022-06-07', FALSE);
INSERT INTO task (id, name, project_id, description, due_date, completed) 
					VALUES(4, 'Task 4', 3, 'Task 4 Description', '2022-08-07', FALSE);
					
INSERT INTO label (id, name, user_id) VALUES (1, 'To do', 1);
INSERT INTO label (id, name, user_id) VALUES (2, 'In Progress', 1);
INSERT INTO label (id, name, user_id) VALUES (3, 'Done', 1);
INSERT INTO label (id, name, user_id) VALUES (4, 'Kill', 1);

INSERT INTO task_label(task_id, label_id) VALUES (1, 1);
INSERT INTO task_label(task_id, label_id) VALUES (1, 2);
INSERT INTO task_label(task_id, label_id) VALUES (1, 3);
INSERT INTO task_label(task_id, label_id) VALUES (1, 4);
