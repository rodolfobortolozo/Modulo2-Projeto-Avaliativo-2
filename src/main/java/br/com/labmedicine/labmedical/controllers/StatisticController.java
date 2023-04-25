package br.com.labmedicine.labmedical.controllers;

import br.com.labmedicine.labmedical.models.Statistic;
import br.com.labmedicine.labmedical.services.StatisticService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/estatisticas","/statistic"})
public class StatisticController {

  private final StatisticService statisticService;

  public StatisticController(StatisticService statisticService) {
    this.statisticService = statisticService;
  }

  @GetMapping
  public ResponseEntity<List<Statistic>> getAll(){

    return this.statisticService.getAll();
  }

}
