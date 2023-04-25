package br.com.labmedicine.labmedical.services;

import br.com.labmedicine.labmedical.models.Statistic;
import br.com.labmedicine.labmedical.repositories.ConsultRepository;
import br.com.labmedicine.labmedical.repositories.ExamRepository;
import br.com.labmedicine.labmedical.repositories.PatientRepository;
import br.com.labmedicine.labmedical.repositories.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static br.com.labmedicine.labmedical.models.TypeStatistic.*;

@Service
public class StatisticService {

    private final ConsultRepository consultRepository;
    private final UserRepository userRepository;
    private final PatientRepository patientRepository;
    private final ExamRepository examRepository;

    public StatisticService(ConsultRepository consultRepository, UserRepository userRepository, PatientRepository patientRepository, ExamRepository examRepository) {
        this.consultRepository = consultRepository;
        this.userRepository = userRepository;
        this.patientRepository = patientRepository;
        this.examRepository = examRepository;
    }


    public ResponseEntity<List<Statistic>> getAll()  {

        List<Statistic> statistic = new ArrayList<>();

        Date timeStamp = new Date();

        Statistic stConsult = new Statistic(CONSULT,this.consultRepository.count(), timeStamp);
        statistic.add(stConsult);

        Statistic stExam = new Statistic(EXAM,this.examRepository.count(), timeStamp);
        statistic.add(stExam);

        Statistic stPatient= new Statistic(PATIENT,this.patientRepository.count(), timeStamp);
        statistic.add(stPatient);

        Statistic stUser= new Statistic(DOCTOR,this.userRepository.count(), timeStamp);
        statistic.add(stUser);

        return ResponseEntity.status(HttpStatus.OK).body(statistic);
    }


}
