package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator {
    public enum DuongXinyu{
        Duong("Duong"),Xinyu("Xinyu");

        private String name;

        private DuongXinyu(String name)
        {
            this.name=name;
        }
    }

    private String name;

    public DuongXinyuEvaluator(String name)
    {
        this.name=name;
    }

    public Boolean isDuong()
    {
        if(this.name.equalsIgnoreCase(DuongXinyu.Duong.name))
            return true;
        else
            return false;
    }

    public Boolean isXinyu()
    {
        if(this.name.equalsIgnoreCase(DuongXinyu.Xinyu.name))
            return true;
        else
            return false;
    }
}
