package org.apache.avro.mapred;

import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters

import org.junit.Test;


@RunWith(Parameterized.class)
public class TestAvroWrapper {
	private String datumString;
	private int datumInt.

	
	
	@Parameters 
    public static Collection<Object[]> configure() throws Exception{
        return Arrays.asList(new Object[][]{
            {"mirko", 8}, {"guglielmo" , 99999}
        });
    }
    
    public TestAvroWrapper(datumInt, datumString) {
    	this.datumInt = datumInt;
    	this.datumString = datumString;
    }
    
    @Test
    public void testWrap() {
    	//creiamo 3 istanze diverse del wrapper che prendono 3 attributi diversi
    	AvroWrapper aWN = new AvroWrapper();
    	AvroWrapper <String> aWS = new AvroWrapper(datumString);
    	AvroWrapper <int> aWI = new AvroWrapper(datumInt);
    	assertEquals(null, aWN.datum());
    	assertEquals(datumString, aWS.datum());
    	assertEquals(datumInt, aWI.datum());
    	aWN.datum(datumString);
    	assertEquals(datumString, aWN.datum());

    }

	//Ora cerchiamo di andare a testare il metodo che restituisce un JSON
    @Test
    public void testToString() {
    	AvroWrapper<String> wrapper = new AvroWrapper<>(datumString);
    	assertEquals(datumString, wrapper.toString());
    }
}
