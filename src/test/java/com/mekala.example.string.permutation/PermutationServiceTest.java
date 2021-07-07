package com.mekala.example.string.permutation

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PermutationServiceTest {

    @InjectMocks
    private PermutationService permutationService;

    @Mock
    private Permutation permutation;

    @Test
    public void testPermutationServiceForSameCharString() {
        Set<String> result = permutationService.getPermutationsForString("aaaaa");

        Assert.assertEquals("1",result.size());
    }

    @Test
    public void testPermutationServiceForStringWithDupeChar(){

        Set<String> result = permutationService.getPermutationsForString("mekala");

        Assert.assertEquals("360",result.size());

    }

    @Test
    public void testPermutationServiceForStringWODupeChar(){

        Set<String> result = permutationService.getPermutationsForString("mastercd");

        Assert.assertEquals("40320",result.size());

    }

}