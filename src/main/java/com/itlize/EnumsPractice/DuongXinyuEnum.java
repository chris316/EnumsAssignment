package com.itlize.EnumsPractice;

public enum DuongXinyuEnum {
Duong("Duong","Hey, my name is Duong!"),
    Xinyu("Xinyu","Hey, my name is Xinyu!");

public final String name;
public final String catchphrase;

private DuongXinyuEnum(String name,String catchphrase)
{
    this.name=name;
    this.catchphrase=catchphrase;
}

public String getCatchPhrase()
{
    return this.catchphrase;
}

public Boolean isDuong()
{
    if(this.name.equals("Duong"))
        return true;
    else
        return false;
}

public Boolean isXinyu()
{
    if(this.name.equalsIgnoreCase("Xinyu"))
        return true;
    else
        return false;
}



}
