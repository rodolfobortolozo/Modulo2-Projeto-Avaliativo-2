create table address (
                         idaddress varchar2(255 char) not null,
                         zipcode varchar2(255 char),
                         city varchar2(255 char),
                         country varchar2(255 char),
                         publicplace varchar2(255 char),
                         housenumber varchar2(255 char),
                         complement varchar2(255 char),
                         district varchar2(255 char),
                         landmark varchar2(255 char),
                         primary key (idaddress)
);

create table allergy (
                         idallergy varchar2(255 char) not null,
                         idperson varchar2(255 char),
                         allergy varchar2(255 char),
                         dtacreated timestamp(6) not null,
                         dtaupdated timestamp(6) not null,
                         primary key (idallergy)
);
create table cautionlist (
                             idcautionlist varchar2(255 char) not null,
                             idperson varchar2(255 char),
                             caution varchar2(255 char),
                             dtacreated timestamp(6) not null,
                             dtaupdated timestamp(6) not null,
                             primary key (idcautionlist)
);
create table consult (
                         idconsult varchar2(255 char) not null,
                         motive varchar2(255 char),
                         dtahourconsult timestamp(6),
                         description varchar2(255 char),
                         medication varchar2(255 char),
                         precautions varchar2(255 char),
                         iduser varchar2(255 char),
                         idpatient varchar2(255 char),
                         dtacreated timestamp(6) not null,
                         dtaupdated timestamp(6) not null,
                         primary key (idconsult)
);

create table doctor (
                        idperson varchar2(255 char) not null,
                        crm varchar2(255 char) not null,
                        password varchar2(255 char),
                        primary key (idperson)
);

create table exam (
                      idexam varchar2(255 char) not null,
                      exam varchar2(255 char),
                      dtahourexam timestamp(6),
                      examtype varchar2(255 char),
                      urlfile varchar2(255 char),
                      result varchar2(255 char),
                      iduser varchar2(255 char),
                      idpatient varchar2(255 char),
                      dtacreated timestamp(6) not null,
                      dtaupdated timestamp(6) not null,
                      primary key (idexam)
);
create table medicalspecialization (
                                       iddoctor varchar2(255 char) not null,
                                       idspecialization varchar2(255 char) not null
);
create table patient (
                         idperson varchar2(255 char) not null,
                         idaddress varchar2(255 char),
                         agreement varchar2(255 char),
                         agreementnumber varchar2(255 char),
                         agreementvalidity timestamp(6),
                         phoneemergency varchar2(255 char),
                         primary key (idperson)
);
create table person (
                        idperson varchar2(255 char) not null,
                        name varchar2(255 char) not null,
                        gender varchar2(255 char),
                        birthday timestamp(6) not null,
                        cpf varchar2(255 char),
                        rg varchar2(255 char),
                        phonenumber varchar2(255 char),
                        email varchar2(255 char),
                        maritalstatus varchar2(255 char),
                        dtacreated timestamp(6) not null,
                        dtaupdated timestamp(6) not null,
                        naturalness varchar2(255 char),
                        primary key (idperson)
);
create table specialization (
                                idspecialization varchar2(255 char) not null,
                                specialization varchar2(255 char) not null,
                                dtacreated timestamp(6) not null,
                                dtaupdated timestamp(6) not null,
                                primary key (idspecialization)
)
