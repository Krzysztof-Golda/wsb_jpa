INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth) VALUES
(1, 'Jan', 'Kowalski', '123-456-789', 'jan.kowalski@example.com', 'P1001', '1990-08-11'),
(2, 'Anna', 'Nowak', '987-654-321', 'anna.nowak@example.com', 'P1002', '1990-07-25'),
(3, 'Piotr', 'Wiśniewski', '555-123-456', 'piotr.wis@example.com', 'P1003', '1978-11-05'),
(4, 'Katarzyna', 'Dąbrowska', '666-777-888', 'kasia.dab@example.com', 'P1004', '2000-01-30'),
(5, 'Marek', 'Wójcik', '444-555-666', 'marek.woj@example.com', 'P1005', '1995-06-14'),
(6, 'Magdalena', 'Zając', '111-222-333', 'magda.zaj@example.com', 'P1006', '1988-09-09'),
(7, 'Tomasz', 'Lewandowski', '777-888-999', 'tomasz.lew@example.com', 'P1007', '1973-12-20'),
(8, 'Barbara', 'Kamińska', '999-111-222', 'barbara.kam@example.com', 'P1008', '1999-05-02'),
(9, 'Grzegorz', 'Nowicki', '333-444-555', 'grzegorz.now@example.com', 'P1009', '1982-08-18'),
(10, 'Aleksandra', 'Lis', '222-333-444', 'aleksandra.lis@example.com', 'P1010', '2001-04-28');

INSERT INTO address (id, city, address_line1, address_line2, postal_code, patient_id, doctor_id) VALUES
(1, 'Warszawa', 'ul. Piękna 10', 'mieszkanie 5', '00-001', 1, 2),
(2, 'Kraków', 'ul. Długa 15', NULL, '31-002', 2, 3),
(3, 'Łódź', 'ul. Główna 22', 'blok 3', '90-003', 3, 4),
(4, 'Gdańsk', 'ul. Morska 5', NULL, '80-004', 4, 5),
(5, 'Poznań', 'ul. Rynek 7', 'lokal 1', '61-005', 5, 6),
(6, 'Wrocław', 'ul. Kościuszki 12', NULL, '50-006', 6, 7),
(7, 'Katowice', 'ul. Słoneczna 8', NULL, '40-007', 7, 8),
(8, 'Szczecin', 'ul. Żeglarska 3', 'dom jednorodzinny', '70-008', 8, 9),
(9, 'Lublin', 'ul. Lubelska 18', NULL, '20-009', 9, 10),
(10, 'Bydgoszcz', 'ul. Kujawska 21', 'mieszkanie 2', '85-010', 10, 1);

INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization) VALUES
(1, 'Adam', 'Kowalski', '111-222-333', 'adam.kowalski@example.com', 'D2001', 'DERMATOLOGIST'),
(2, 'Ewa', 'Nowak', '222-333-444', 'ewa.nowak@example.com', 'D2002', 'GP'),
(3, 'Michał', 'Wiśniewski', '333-444-555', 'michal.wis@example.com', 'D2003', 'OCULIST'),
(4, 'Joanna', 'Dąbrowska', '444-555-666', 'joanna.dab@example.com', 'D2004', 'DERMATOLOGIST'),
(5, 'Tomasz', 'Wójcik', '555-666-777', 'tomasz.woj@example.com', 'D2005', 'OCULIST'),
(6, 'Agnieszka', 'Zając', '666-777-888', 'agnieszka.zaj@example.com', 'D2006', 'SURGEON'),
(7, 'Piotr', 'Lewandowski', '777-888-999', 'piotr.lew@example.com', 'D2007', 'DERMATOLOGIST'),
(8, 'Karolina', 'Kamińska', '888-999-000', 'karolina.kam@example.com', 'D2008', 'SURGEON'),
(9, 'Grzegorz', 'Nowicki', '999-000-111', 'grzegorz.now@example.com', 'D2009', 'GP'),
(10, 'Paulina', 'Lis', '000-111-222', 'paulina.lis@example.com', 'D2010', 'DERMATOLOGIST');

INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES
(1, 'Kontrola ciśnienia', '2025-04-01 10:00:00', 1, 1),
(2, 'Ból głowy', '2025-04-02 11:00:00', 2, 2),
(3, 'Złamanie ręki', '2025-04-03 12:00:00', 3, 3),
(4, 'Szczepienie dziecka', '2025-04-04 13:00:00', 4, 4),
(5, 'Problemy skórne', '2025-04-05 14:00:00', 5, 5),
(6, 'Usunięcie znamienia', '2025-04-06 15:00:00', 6, 6),
(7, 'Zaburzenia hormonalne', '2025-04-07 16:00:00', 7, 7),
(8, 'Kaszel i duszności', '2025-04-08 17:00:00', 8, 8),
(9, 'Badanie wzroku', '2025-04-09 18:00:00', 9, 9),
(10, 'Ból nerek', '2025-04-10 19:00:00', 10, 10);

INSERT INTO medical_treatment (id, description, type, visit_id) VALUES
(1, 'Leki na nadciśnienie', 'EKG', 1),
(2, 'Tomografia głowy', 'RTG', 2),
(3, 'Gipsowanie ręki', 'USG', 3),
(4, 'Szczepionka MMR', 'EKG', 4),
(5, 'Maść na egzemę', 'RTG', 5),
(6, 'Laserowe usunięcie', 'EKG', 6),
(7, 'Badanie poziomu hormonów', 'USG', 7),
(8, 'Inhalacje', 'EKG', 8),
(9, 'Dobór okularów', 'RTG', 9),
(10, 'USG nerek', 'EKG', 10);