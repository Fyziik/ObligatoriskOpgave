INSERT INTO concert (name) VALUES ('Green Day'), ('Boston'), ('Earth, Wind & Fire');

INSERT INTO customer (serial_number, CONCERT_ID) VALUES (12345, 1), (54321, 1), (22222, 2), (33333, 3);

INSERT INTO ticket (price) VALUES (200), (200), (200), (350), (500);

INSERT INTO ticket_customers (ticket_id, customers_id) VALUES (1, 1), (2, 1), (3, 2), (4, 3), (4, 4), (4, 1), (1, 4);