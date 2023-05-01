insert into PERSON (IDPERSON, NAME, GENDER, BIRTHDAY, CPF, RG, PHONENUMBER, EMAIL, MARITALSTATUS, DTACREATED, DTAUPDATED, NATURALNESS)
values ('136d511b-8641-4e57-bcfa-9bc1351cd025', 'Jose da Silva', 'Masculino', '03-JAN-89 1', '77784671350', '99999999', '13385646847', 'josedasilva@teste.com', 'CASADO', sysdate, sysdate, 'Jales');

insert into PERSON (IDPERSON, NAME, GENDER, BIRTHDAY, CPF, RG, PHONENUMBER, EMAIL, MARITALSTATUS, DTACREATED, DTAUPDATED, NATURALNESS)
values ('e78b4a10-6b18-43c1-8e49-76d74950ff6a', 'Antonio da Silva', 'Masculino', '01-JAN-20 1', '57985883355', '888888888', '13385646847', 'antoniodasilva@teste.com', 'SOLTEIRO', sysdate, sysdate, 'Mesópolis');

insert into PERSON (IDPERSON, NAME, GENDER, BIRTHDAY, CPF, RG, PHONENUMBER, EMAIL, MARITALSTATUS, DTACREATED, DTAUPDATED, NATURALNESS)
values ('20ce79f3-0be1-4599-8b16-aa25a07bb9d9', 'Paty Jess Pink', 'Feminino', '01-NOV-00 1', '15805160846', '888888888', '13385646847', 'antoniodasilva@teste.com', 'SOLTEIRO', sysdate, sysdate, 'Mesópolis');

insert into PERSON (IDPERSON, NAME, GENDER, BIRTHDAY, CPF, RG, PHONENUMBER, EMAIL, MARITALSTATUS, DTACREATED, DTAUPDATED, NATURALNESS)
values ('5b9717a5-4774-4b9b-bdde-bf742343d831', 'Lorena Poli', 'Feminino', '15-MAR-15 1', '74841186301', '852963741', '13385646847', 'antoniodasilva@teste.com', 'SOLTEIRO', sysdate, sysdate, 'Fernandópolis');

insert into ADDRESS (IDADDRESS, ZIPCODE, CITY, COUNTRY, PUBLICPLACE, HOUSENUMBER, COMPLEMENT, DISTRICT, LANDMARK)
values ('8663a6db-629f-4051-bba7-a4269edaa0ff', '15600000', 'Fernandópolis', 'Brasil', 'Rua Pernanbuco', '0011', 'apto 2', 'centro', 'Edificio Atlantis');

insert into ADDRESS (IDADDRESS, ZIPCODE, CITY, COUNTRY, PUBLICPLACE, HOUSENUMBER, COMPLEMENT, DISTRICT, LANDMARK)
values ('1655f492-48a6-4c38-b354-cf1006550b41', '15748000', 'Mesópolis', 'Brasil', 'Rua 3', '0011', 'casa verde', 'centro', null);

insert into ADDRESS (IDADDRESS, ZIPCODE, CITY, COUNTRY, PUBLICPLACE, HOUSENUMBER, COMPLEMENT, DISTRICT, LANDMARK)
values ('672f5fa4-d6ce-4445-9cdf-7c6e4ad91f5a', '15748000', 'Mesópolis', 'Brasil', 'Rua 3', '0011', 'casa verde', 'centro', null);

insert into ADDRESS (IDADDRESS, ZIPCODE, CITY, COUNTRY, PUBLICPLACE, HOUSENUMBER, COMPLEMENT, DISTRICT, LANDMARK)
values ('6ec676ed-e4a9-4f1b-9d1a-8322f949070d', '15748000', 'Fernandópolis', 'Brasil', 'Rua 3', '0011', 'casa verde', 'centro', null);

insert into ADDRESS (IDADDRESS, ZIPCODE, CITY, COUNTRY, PUBLICPLACE, HOUSENUMBER, COMPLEMENT, DISTRICT, LANDMARK)
values ('7f85e3c9-4538-4c9a-8895-11211b10e35d', '15600076', 'Fernandópolis', 'Brasil', 'Rua 3', '0011', 'casa verde', 'centro', 'Edificio parati');

insert into patient (IDPERSON, IDADDRESS, AGREEMENT, AGREEMENTNUMBER, AGREEMENTVALIDITY, PHONEEMERGENCY)
values ('136d511b-8641-4e57-bcfa-9bc1351cd025', '8663a6db-629f-4051-bba7-a4269edaa0ff', 'unimed', '656552', sysdate+350, '179999999');

insert into patient (IDPERSON, IDADDRESS, AGREEMENT, AGREEMENTNUMBER, AGREEMENTVALIDITY, PHONEEMERGENCY)
values ('e78b4a10-6b18-43c1-8e49-76d74950ff6a', '672f5fa4-d6ce-4445-9cdf-7c6e4ad91f5a', 'PREVER', '561546', sysdate+380, '179999999');

insert into patient (IDPERSON, IDADDRESS, AGREEMENT, AGREEMENTNUMBER, AGREEMENTVALIDITY, PHONEEMERGENCY)
values ('20ce79f3-0be1-4599-8b16-aa25a07bb9d9', '1655f492-48a6-4c38-b354-cf1006550b41', 'PREVER', '654164515', sysdate+400, '179999999');

insert into patient (IDPERSON, IDADDRESS, AGREEMENT, AGREEMENTNUMBER, AGREEMENTVALIDITY, PHONEEMERGENCY)
values ('5b9717a5-4774-4b9b-bdde-bf742343d831', '6ec676ed-e4a9-4f1b-9d1a-8322f949070d', 'UNIMED', '12888', sysdate+350, '179999999');

insert into ALLERGY (IDALLERGY, IDPERSON, ALLERGY, DTACREATED, DTAUPDATED)
values ('ad2ec56f-f5ab-4724-a824-afd1d271525c', '136d511b-8641-4e57-bcfa-9bc1351cd025', 'Leite', sysdate, sysdate);

insert into ALLERGY (IDALLERGY, IDPERSON, ALLERGY, DTACREATED, DTAUPDATED)
values ('f39df852-42b8-48ad-8515-b5f2a53a44a1', 'e78b4a10-6b18-43c1-8e49-76d74950ff6a', 'Leite', sysdate, sysdate);

insert into ALLERGY (IDALLERGY, IDPERSON, ALLERGY, DTACREATED, DTAUPDATED)
values ('77217f73-a044-4431-9534-6be2d54fc232', '20ce79f3-0be1-4599-8b16-aa25a07bb9d9', 'Soja', sysdate, sysdate);

insert into ALLERGY (IDALLERGY, IDPERSON, ALLERGY, DTACREATED, DTAUPDATED)
values ('0c02c5fd-c2f8-4373-ba91-682420f89e73', '5b9717a5-4774-4b9b-bdde-bf742343d831', 'Soja', sysdate, sysdate);


insert into CAUTIONLIST (IDCAUTIONLIST, IDPERSON, CAUTION, DTACREATED, DTAUPDATED)
values ('a2f6257e-0a8b-4cef-b528-6180a5ff070b', '136d511b-8641-4e57-bcfa-9bc1351cd025', 'Repouso', sysdate, sysdate);

insert into CAUTIONLIST (IDCAUTIONLIST, IDPERSON, CAUTION, DTACREATED, DTAUPDATED)
values ('0000790d-0e9f-44fe-bde6-4d58eddc1bfe', 'e78b4a10-6b18-43c1-8e49-76d74950ff6a', 'Muita Agua', sysdate, sysdate);

insert into CAUTIONLIST (IDCAUTIONLIST, IDPERSON, CAUTION, DTACREATED, DTAUPDATED)
values ('39e796d1-6fe0-44ad-a6fb-abbca3076b3d', '20ce79f3-0be1-4599-8b16-aa25a07bb9d9', 'Dormir', sysdate, sysdate);

insert into CAUTIONLIST (IDCAUTIONLIST, IDPERSON, CAUTION, DTACREATED, DTAUPDATED)
values ('2796d652-7c8d-4462-93d8-6a6ade15d380', '5b9717a5-4774-4b9b-bdde-bf742343d831', 'Exercicios Fisicos', sysdate, sysdate);

