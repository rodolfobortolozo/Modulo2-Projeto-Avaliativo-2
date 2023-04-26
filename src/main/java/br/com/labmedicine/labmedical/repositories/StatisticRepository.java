package br.com.labmedicine.labmedical.repositories;

import br.com.labmedicine.labmedical.models.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatisticRepository extends JpaRepository<Statistic, String> {


}
