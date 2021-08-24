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

import org.apache.avro.mapred.AvroWrapper;
import org.apache.avro.mapred.FsInput;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import java.util.ArrayList;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class FsInputTest {
    long len; //lunghezza del file
    long pos; //posizione nel file

    @Rule
    public TemporaryFolder DIR = new TemporaryFolder();



    @Parameters
    public static Collection<Object[]> configure() throws Exception{
        return Arrays.asList(new Object[][]{
                {1024, 0}, {4096, 16}
        });
    }


    public FsInputTest(long len, long pos) {
        this.len = len;
        this.pos = pos;
    }

    //testiamo i metodi seek e tell
    @Test
    public void testSeekTell() throws Exception {
        File file;
        Configuration conf = new Configuration();
        String FILE_CONTENTS = "Stringa per test dei metodi seed e tell";

        conf.set("fs.default.FS", "file:///");
        file = new File(DIR.getRoot(), "test.txt");
        try (
                PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8))) {
            out.print(FILE_CONTENTS);
        }
        FsInput fs = new FsInput(new Path(file.getPath()), conf);
        fs.seek(pos);
        assertEquals(pos, fs.tell());

    }

    @Test
    public void testLenght() throws Exception {
        File file;
        Configuration conf = new Configuration();
        String FILE_CONTENTS = "";
        //il ciclo imposta la dimensione del file a quella del parametro len
        for(int i = 0; i < len; i++) {
            FILE_CONTENTS = FILE_CONTENTS.concat("a");
        }
        conf.set("fs.default.FS", "file:///");
        file = new File(DIR.getRoot(), "test.txt");
        try (
                PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8))) {
            out.print(FILE_CONTENTS);
        }
        FsInput fs = new FsInput(new Path(file.getPath()), conf);
        assertEquals(len, fs.length());

    }




}
