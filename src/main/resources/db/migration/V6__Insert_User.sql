insert into PERSON (IDPERSON, NAME, GENDER, BIRTHDAY, CPF, RG, PHONENUMBER, EMAIL, MARITALSTATUS, DTACREATED, DTAUPDATED, NATURALNESS)
values ('ba2e6008-5a56-465e-90fc-eb13295a34ca', 'Anonio Jackson Xavier', 'Masculino', '02-JAN-89 1', '52876274833', '44762158-0', '1799999999', 'antoniojacson@teste.com', 'SOLTEIRO', sysdate, sysdate, 'São Paulo');

insert into PERSON (IDPERSON, NAME, GENDER, BIRTHDAY, CPF, RG, PHONENUMBER, EMAIL, MARITALSTATUS, DTACREATED, DTAUPDATED, NATURALNESS)
values ('85fa89bb-5c21-426b-85cf-8493d9d51777', 'Alessandra Zanardi', 'Feminino', '09-NOV-80 1', '21613385609', '77542582-0', '1799999999', 'alesandra@teste.com', 'CASADO', sysdate, sysdate, 'Fernandópolis');

insert into PERSON (IDPERSON, NAME, GENDER, BIRTHDAY, CPF, RG, PHONENUMBER, EMAIL, MARITALSTATUS, DTACREATED, DTAUPDATED, NATURALNESS)
values ('377e2147-e732-4cbb-9a9f-ca7e7ae631ca', 'Rodolfo R B', 'Masculino', '03-NOV-80 1', '67558244617', '753159852-0', '1799999999', 'rodolfo@teste.com', 'CASADO', sysdate, sysdate, 'Campinas');

insert into PERSON (IDPERSON, NAME, GENDER, BIRTHDAY, CPF, RG, PHONENUMBER, EMAIL, MARITALSTATUS, DTACREATED, DTAUPDATED, NATURALNESS)
values ('f6edb4c0-76c7-4113-9ea2-83e8fb849ae8', 'Flavia Silva', 'Masculino', '03-NOV-80 1', '69215325930', '357258456-0', '1799999999', 'flavia@teste.com', 'DIVORCIADO', sysdate, sysdate, 'RIo de Janeiro');

insert into doctor (IDPERSON, CRM, PASSWORD)
values ('ba2e6008-5a56-465e-90fc-eb13295a34ca', '1234-SP', '1235#Ab!');

insert into doctor (IDPERSON, CRM, PASSWORD)
values ('85fa89bb-5c21-426b-85cf-8493d9d51777', '45678-SP', '4592#Ab!');

insert into doctor (IDPERSON, CRM, PASSWORD)
values ('377e2147-e732-4cbb-9a9f-ca7e7ae631ca', '8529-SP', '7895#Ab!');

insert into doctor (IDPERSON, CRM, PASSWORD)
values ('f6edb4c0-76c7-4113-9ea2-83e8fb849ae8', '8529-SP', 'dg13#Ab!');

insert into MEDICALSPECIALIZATION (IDDOCTOR, IDSPECIALIZATION)
values ('ba2e6008-5a56-465e-90fc-eb13295a34ca', 'cd163d41-c35f-45ff-b373-2e9c951e6852');

insert into MEDICALSPECIALIZATION (IDDOCTOR, IDSPECIALIZATION)
values ('ba2e6008-5a56-465e-90fc-eb13295a34ca', '201d5f12-fae1-40e1-b1e7-21ef11b71bac');

insert into MEDICALSPECIALIZATION (IDDOCTOR, IDSPECIALIZATION)
values ('85fa89bb-5c21-426b-85cf-8493d9d51777', '961b0015-0b63-4ce4-8417-7d952dd8fc4a');

insert into MEDICALSPECIALIZATION (IDDOCTOR, IDSPECIALIZATION)
values ('377e2147-e732-4cbb-9a9f-ca7e7ae631ca', 'da91d4b9-c92b-44c6-b09e-b3a6cab0ec1c');

insert into MEDICALSPECIALIZATION (IDDOCTOR, IDSPECIALIZATION)
values ('f6edb4c0-76c7-4113-9ea2-83e8fb849ae8', 'f9efa743-27a0-44d0-a099-0559f81958ee');

insert into MEDICALSPECIALIZATION (IDDOCTOR, IDSPECIALIZATION)
values ('f6edb4c0-76c7-4113-9ea2-83e8fb849ae8', 'b7cfb890-c6ab-42d6-8798-239e39e4ffe5');