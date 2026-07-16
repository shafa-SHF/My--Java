INSERT INTO Product (id, name, description, price, stock) VALUES (1, 'Coffee Mug', 'Ceramic mug, 350ml', 8.50, 100);
INSERT INTO Product (id, name, description, price, stock) VALUES (2, 'Notebook', 'A5 dotted notebook', 5.00, 200);
INSERT INTO Product (id, name, description, price, stock) VALUES (3, 'Backpack', 'Water-resistant backpack', 45.00, 30);
INSERT INTO Product (id, name, description, price, stock) VALUES (4, 'Desk Lamp', 'LED desk lamp with USB charging', 22.99, 50);
ALTER TABLE Product ALTER COLUMN id RESTART WITH 5;
