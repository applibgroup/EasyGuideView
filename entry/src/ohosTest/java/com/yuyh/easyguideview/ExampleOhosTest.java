/*
 * Copyright (C) 2020-21 Application Library Engineering Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yuyh.easyguideview;

import com.yuyh.library.EasyGuide;
import ohos.aafwk.ability.delegation.AbilityDelegatorRegistry;

import ohos.agp.utils.Color;
import org.junit.Before;
import org.junit.Test;

import ohos.app.Context;

import static org.junit.Assert.*;

public class ExampleOhosTest {

    private Context context;

    @Test
    public void testBundleName() {
        final String actualBundleName = AbilityDelegatorRegistry.getArguments().getTestBundleName();
        assertEquals("com.yuyh.easyguideview", actualBundleName);
    }

    @Before
    public void setUp() {
        context = AbilityDelegatorRegistry.getAbilityDelegator().getAppContext();
    }

    @Test
    public void testChangeParamToColor() {
        Color hmosColor =EasyGuide.changeParamToColor(Color.RED.getValue());
        assertEquals(Color.RED,hmosColor);
    }

    @Test
    public void testChangeParamToColor1() {
        Color hmosColor = EasyGuide.changeParamToColor(Color.RED.getValue());
        assertNotEquals(Color.BLUE,hmosColor);
    }

    @Test
    public void testdip2px() {
        int px = EasyGuide.dip2px(context, 10);
        assertTrue(px != 0);
    }
}