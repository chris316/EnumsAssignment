package com.itlize.EnumsPractice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Yang on 02/4/20.
 */
public class DuongXinyuEnumTest {
    @Test
    public void testDuongName() {
        // Given
        DuongXinyuEnum Duong = DuongXinyuEnum.Duong;
        String expected = "Duong";

        // When
        String actual = Duong.name();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDuongName1()
    {
        //Given
        String expected="Test";

        //When
        String actual=DuongXinyuEnum.Duong.name();

        //Then
        Assert.assertNotEquals(expected,actual);
    }


    @Test
    public void testXinyuName() {
        // Given
        DuongXinyuEnum Xinyu = DuongXinyuEnum.Xinyu;
        String expected = "Xinyu";

        // When
        String actual = Xinyu.name();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testXinyuName1()
    {
        //Given
        String expected="Chris";

        //When
        String actual=DuongXinyuEnum.Xinyu.name();

        //Then
        Assert.assertNotEquals(expected,actual);
    }



    @Test
    public void testDuongCatchPhrase() {
        // Given
        DuongXinyuEnum Duong = DuongXinyuEnum.Duong;
        String expected = "Hey, my name is Duong!";

        // When
        String actual = Duong.getCatchPhrase();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDuongCatchPhrase1()
    {
        //Given
        String expected="Hello!";

        //When
        String actual=DuongXinyuEnum.Duong.getCatchPhrase();

        //Then
        Assert.assertNotEquals(expected,actual);
    }


    @Test
    public void testXinyuCatchPhrase() {
        // Given
        DuongXinyuEnum Xinyu = DuongXinyuEnum.Xinyu;
        String expected = "Hey, my name is Xinyu!";

        // When
        String actual = Xinyu.getCatchPhrase();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testXinyuCatchPhrase1()
    {
        //Given
        String expected="This is Xinyu's CatchPhrase!";

        //when
        String actual=DuongXinyuEnum.Xinyu.getCatchPhrase();

        //Then
        Assert.assertNotEquals(expected,actual);
    }

    @Test
    public void testDuongIsDuong() {
        // Given
        DuongXinyuEnum Duong = DuongXinyuEnum.Duong;

        // When
        boolean outcome = Duong.isDuong();

        // Then
        Assert.assertTrue(outcome);
    }


    @Test
    public void testDuongIsXinyu() {
        // Given
        DuongXinyuEnum Duong = DuongXinyuEnum.Duong;

        // When
        boolean outcome = Duong.isXinyu();

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void testXinyuIsXinyu() {
        // Given
        DuongXinyuEnum Xinyu = DuongXinyuEnum.Xinyu;

        // When
        boolean outcome = Xinyu.isXinyu();

        // Then
        Assert.assertTrue(outcome);
    }


    @Test
    public void testXinyuIsDuong() {
        // Given
        DuongXinyuEnum Xinyu = DuongXinyuEnum.Xinyu;

        // When
        boolean outcome = Xinyu.isDuong();

        // Then
        Assert.assertFalse(outcome);
    }


}
