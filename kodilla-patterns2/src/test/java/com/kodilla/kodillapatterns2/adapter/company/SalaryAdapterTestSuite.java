package com.kodilla.kodillapatterns2.adapter.company;

import com.kodilla.kodillapatterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
public class SalaryAdapterTestSuite {
    @Test
    public void testTotalSalar(){
        //given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();
        //when
        double totalSalary = salaryAdapter.TotalSalary(workers.getWorkers(),workers.getSalaries());
        //then
        System.out.println(totalSalary);
        Assert.assertEquals(totalSalary,28250,0);
    }
}
