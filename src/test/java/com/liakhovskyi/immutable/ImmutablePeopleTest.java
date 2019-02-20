package com.liakhovskyi.immutable;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ImmutablePeopleTest {
    DateOfBirth dateOfBirth = new DateOfBirth();
    ImmutablePeople people;

    @Before
    public void init() {
        dateOfBirth.setDay(10);
        dateOfBirth.setMonth(10);
        dateOfBirth.setYear(1999);

        people = new ImmutablePeople("Liakhovskyi"
                , "Vasilios"
                , 75
                , 182
                , dateOfBirth);
    }

    @Test
    public void testImmutableClassForBeingImmutableAfterDateSetYear() {
        int expectedResult = people.getDateOfBirth().getYear();
        dateOfBirth.setYear(2019);
        int actualResult = people.getDateOfBirth().getYear();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testImmutableClassForBeingImmutableAfterPeopleSetYear() {
        int expectedResult = people.getDateOfBirth().getYear();
        people.getDateOfBirth().setYear(2019);
        int actualResult = people.getDateOfBirth().getYear();
        assertEquals(expectedResult, actualResult);
    }
}