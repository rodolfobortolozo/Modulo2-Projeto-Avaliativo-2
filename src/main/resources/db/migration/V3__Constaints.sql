alter table allergy
    add constraint fk_patient_allergy
        foreign key (idperson)
            references patient
;

alter table cautionlist
    add constraint fk_patient_idperson
        foreign key (idperson)
            references patient
;

alter table consult
    add constraint fk_patient_idpatient
        foreign key (idpatient)
            references patient
;

alter table consult
    add constraint fk_doctor_iduser
        foreign key (iduser)
            references doctor
;

alter table doctor
    add constraint fk_person_idperson
        foreign key (idperson)
            references person
;

alter table exam
    add constraint fk_patient_exam
        foreign key (idpatient)
            references patient
;

alter table exam
    add constraint fk_doctor_exam
        foreign key (iduser)
            references doctor
;

alter table medicalspecialization
    add constraint fk_specialization_specialization
        foreign key (idspecialization)
            references specialization
;

alter table medicalspecialization
    add constraint fk_doctor_medicalspecialization
        foreign key (iddoctor)
            references doctor
;

alter table patient
    add constraint fk_address_idaddress
        foreign key (idaddress)
            references address
;

alter table patient
    add constraint fk_person_patient
        foreign key (idperson)
            references person