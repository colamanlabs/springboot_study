package com.colamanlabs.springbootstudy.s0017;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class MyPassTasklet implements Tasklet
{
    
    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception
    {
        // TODO Auto-generated method stub
        // return RepeatStatus.FINISHED;
        throw new RuntimeException("Causing a failure");
    }
    
}
