package ua.hillel.Ponomarenko.lesson25;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {
    private MyLinkedList<Integer> myLinkedList;
    private MyLinkedList<Integer> myLinkedList2;

    @Before
    public void setup(){
        myLinkedList = new MyLinkedList<>();
        myLinkedList2 = new MyLinkedList<>();
        myLinkedList2.add(95);
        myLinkedList2.add(4);
        myLinkedList2.add(33);
        myLinkedList2.add(16);
    }

    @Test
    public void shouldSetSize0(){
        Assert.assertEquals(0, myLinkedList.size());
    }
    @Test
    public void shouldSetSize1IfAdded(){
        myLinkedList.add(3);
        Assert.assertEquals(1, myLinkedList.size());
    }

    @Test
    public void shouldSetSize0IfClear(){
        myLinkedList2.clear();
        Assert.assertEquals(0, myLinkedList2.size());
    }

    @Test
    public void shouldBeEmpty(){
        Assert.assertTrue(myLinkedList.isEmpty());
    }

    @Test
    public void shouldBeNotEmptyIfAdded(){
        myLinkedList.add(3);
        Assert.assertFalse(myLinkedList.isEmpty());
    }

    @Test
    public void shouldContain(){
        myLinkedList.add(65);
        myLinkedList.add(12);
        myLinkedList.add(6);
        myLinkedList.add(37);
        Assert.assertTrue(myLinkedList.contains(66546));
    }

    @Test
    public void shouldNotContain(){
        myLinkedList.add(65);
        myLinkedList.add(12);
        myLinkedList.add(6);
        myLinkedList.add(37);
        Assert.assertFalse(myLinkedList.contains(6666));
    }

    @Test
    public void shouldBeRemovedIfPresent(){
        Assert.assertTrue(myLinkedList2.remove((Integer) 33));
    }

    @Test
    public void iteratorHasNextShouldBeFalseIfIsEmpty(){
        Assert.assertFalse(myLinkedList.iterator().hasNext());
    }

    @Test
    public void shouldReturnArray(){
        Object[] array = new Object[]{95,4,33,16};
        Assert.assertArrayEquals(array, myLinkedList2.toArray());
    }

    @Test
    public void shouldGetValue(){
        Assert.assertEquals((Integer) 33,myLinkedList2.get(2));
    }


}
