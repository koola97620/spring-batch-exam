package me.jdragon.springbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author choijaeyong on 2020/01/08.
 * @project springbatch
 * @description
 */
@Configuration
@EnableBatchProcessing
public class HelloWorld {

  private JobBuilderFactory jobBuilderFactory;
  private StepBuilderFactory stepBuilderFactory;

}
