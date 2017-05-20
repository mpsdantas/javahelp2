/*
 * @(#)ViewAwareComponent.java	1.5 06/10/30
 * 
 * Copyright (c) 2006 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * 
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 * 
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 * 
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

package com.sun.java.help.impl;

import javax.swing.text.*;

/**
 * Interface that a Component should support if it wants to play in the View
 * hierachy.
 *
 * WARNING!! This is an experimental feature of the JavaHelp reference
 * implemenation and may change in future versions of the implementation.
 *
 * @author Eduardo Pelegri-Llopart
 * @version 1.5 10/30/06 */


public interface ViewAwareComponent {
    /**
     * Set the View that corresponds to this object
     * This gives access to a wealth of information.
     */
    public void setViewData(View v);

    /**
    * May need something to react to changes (in my view?)
    */
}