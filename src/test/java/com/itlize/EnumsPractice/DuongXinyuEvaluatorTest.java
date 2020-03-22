package com.itlize.EnumsPractice;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yang on 02/03/20.
 */
public class DuongXinyuEvaluatorTest {
    @Test
    public void testChris() {
        // Given
        String input = "chris";
        DuongXinyuEvaluator abc = new DuongXinyuEvaluator(input);

        // When
        boolean isDuong = abc.isDuong();
        boolean isXinyu = abc.isXinyu();

        // Then
        Assert.assertFalse(isDuong);
        Assert.assertFalse(isXinyu);
    }

    @Test
    public void testDan() {
        // Given
        String input = "dan";
        DuongXinyuEvaluator abc = new DuongXinyuEvaluator(input);

        // When
        boolean isDuong = abc.isDuong();
        boolean isXinyu = abc.isXinyu();

        // Then
        Assert.assertFalse(isDuong);
        Assert.assertFalse(isXinyu);
    }

    @Test
    public void testxinyu() {
        // Given
        String input = "xinyu";
        DuongXinyuEvaluator abc = new DuongXinyuEvaluator(input);

        // When
        boolean isDuong = abc.isDuong();
        boolean isXinyu = abc.isXinyu();

        // Then
        Assert.assertFalse(isDuong);
        Assert.assertTrue(isXinyu);
    }

    @Test
    public void testXinyu1()
    {
        //given
        String input="Xinyu";
        DuongXinyuEvaluator abc=new DuongXinyuEvaluator(input);

        //When
        boolean isDuong=abc.isDuong();
        boolean isXinyu=abc.isXinyu();

        //Then
        Assert.assertFalse(isDuong);
        Assert.assertTrue(isXinyu);
    }


    @Test
    public void testDuong() {
        // Given
        String input = "Duong";
        DuongXinyuEvaluator abc = new DuongXinyuEvaluator(input);

        // When
        boolean isDuong = abc.isDuong();
        boolean isXinyu = abc.isXinyu();

        // Then
        Assert.assertTrue(isDuong);
        Assert.assertFalse(isXinyu);
    }

    @Test
    public void testDuong1()
    {
        //given
        String input="duong";
        DuongXinyuEvaluator abc=new DuongXinyuEvaluator(input);

        //when
        boolean isDuong=abc.isDuong();
        boolean isXinyu=abc.isXinyu();

        //Then
        Assert.assertTrue(isDuong);
        Assert.assertFalse(isXinyu);
    }
}
