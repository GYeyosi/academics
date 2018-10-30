/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soelab1;

/**
 *
 * @author lab
 */
public class Data {
    private int teamnum;
    private int batchyear;
    private String perftype;
    private int id;
    private int marks1;
    private int marks2;
    private int marks3;
    
    Data(int teamnum, int batchyear, String perftype, int id, int marks1, int marks2, int marks3)
    {
        this.teamnum = teamnum;
        this.batchyear = batchyear;
        this.perftype = perftype;
        this.id = id;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    
    public int getTeamNum()
    {
        return teamnum;
    }
    
    public int getBatchYear()
    {
        return batchyear;
    }
    
    public String getPerf()
    {
        return perftype;
    }
    
    public int getId()
    {
        return id;
    }
    
    public int getMarks1()
    {
        return marks1;
    }
    
    public int getMarks2()
    {
        return marks2;
    }
    
    public int getMarks3()
    {
        return marks3;
    }
}
