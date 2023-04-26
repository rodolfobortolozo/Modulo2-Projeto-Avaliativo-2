package br.com.labmedicine.labmedical.services;

import br.com.labmedicine.labmedical.models.Statistic;
import br.com.labmedicine.labmedical.repositories.StatisticRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisticService {

    private final StatisticRepository statisticRepository;

    public StatisticService(StatisticRepository statisticRepository) {

        this.statisticRepository = statisticRepository;
    }


    public ResponseEntity<List<Statistic>> getAll()  {

        List<Statistic> statistic = statisticRepository.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(statistic);
    }


}
