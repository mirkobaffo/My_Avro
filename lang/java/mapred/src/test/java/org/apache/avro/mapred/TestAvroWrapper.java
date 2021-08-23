/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.avro.mapred;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import jdk.jfr.Timestamp;
import org.junit.Test;
import java.util.Collection;
import javax.management.ConstructorParameters;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.File;


@RunWith(Parameterized.class)
public class TestAvroWrapper {
	
	String datumString;
	Integer datumInt;

	@Parameters 
    public static Collection<Object[]> configure() throws Exception{
        return Arrays.asList(new Object[][]{
            {"mirko", 8}, {"guglielmo", 99999}
        });
    } 
    
   
    
    public TestAvroWrapper(String datumString, Integer datumInt) {
    	this.datumInt = datumInt;
    	this.datumString = datumString; 
    } 
    
    @Test
    public void testWrap() throws Exception {
    	//creiamo 3 istanze diverse del wrapper che prendono 3 attributi diversi
    	AvroWrapper <String> aWN = new AvroWrapper();
    	AvroWrapper <String> aWS = new AvroWrapper(datumString);
    	AvroWrapper <Integer> aWI = new AvroWrapper(datumInt);
    	assertEquals(null, aWN.datum());
    	assertEquals(datumString, aWS.datum());
    	assertEquals(datumInt, aWI.datum());
    	aWN.datum(datumString);
    	assertEquals(datumString, aWN.datum()); 

    }

	//Ora cerchiamo di andare a testare il metodo che restituisce un JSON
    @Test
    public void testForJSON() throws Exception {
    	AvroWrapper<String> wrapperString = new AvroWrapper (datumString);
    	assertEquals(datumString, wrapperString.toString());
    }
}
