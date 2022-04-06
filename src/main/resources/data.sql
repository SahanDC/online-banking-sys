delete from users_roles;
delete from role;
delete from user;

INSERT INTO role(id, name)
VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_ACTUATOR'),
(3, 'ROLE_USER'),
(4, 'ROLE_VIEWER');

INSERT INTO user (id, email, first_name, last_name, password)
VALUES
(1, 'bodaragamadb.office@gmail.com', 'Bimsara', 'Bodaragama', '$2a$10$s3WZpdg3jTTDWuXvfW5dvO0loovVQ58g8fUMAf09nqlw022WVHn9a'),
(2, 'bimsarabodaragama@gmail.com', 'Dinuka', 'Bodaragama', '$2a$10$s3WZpdg3jTTDWuXvfW5dvO0loovVQ58g8fUMAf09nqlw022WVHn9a'),
(3, 'group03admin@gmail.com', 'Group03', 'Admin', '$2a$10$s3WZpdg3jTTDWuXvfW5dvO0loovVQ58g8fUMAf09nqlw022WVHn9a'),
(4, 'group03actuator@gmail.com', 'Group03', 'Actuator', '$2a$10$s3WZpdg3jTTDWuXvfW5dvO0loovVQ58g8fUMAf09nqlw022WVHn9a'),
(5, 'group03viewer@gmail.com','Group03','Viewer','$2a$10$s3WZpdg3jTTDWuXvfW5dvO0loovVQ58g8fUMAf09nqlw022WVHn9a');


INSERT INTO users_roles(user_id, role_id)
VALUES
(1, 1),
(2, 2),
(3, 1),
(4, 4),
(5, 2);
