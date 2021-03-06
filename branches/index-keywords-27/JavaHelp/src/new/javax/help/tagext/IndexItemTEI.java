/*
 * @(#)IndexItemTEI.java	1.2 06/10/30
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

package javax.help.tagext;

import javax.servlet.jsp.tagext.*;

/**
 * The JSP tag extra info class for an IndexItem
 *
 * @author Roger D. Brinkley
 * @version	1.2	10/30/06
 * @see javax.help.IndexItem
 */

public class IndexItemTEI extends TagExtraInfo {
  
   public IndexItemTEI() {
      super();
   }

   public VariableInfo[] getVariableInfo(TagData data) {
       return new VariableInfo[] {
	   new VariableInfo("name", "java.lang.String", true, 
			    VariableInfo.NESTED),
	   new VariableInfo("helpID", "java.lang.String", true, 
			    VariableInfo.NESTED),
	   new VariableInfo("parent", "java.lang.String", true, 
			    VariableInfo.NESTED),
	   new VariableInfo("parentID", "java.lang.String", true, 
			    VariableInfo.NESTED),
	   new VariableInfo("node", "java.lang.String", true, 
			    VariableInfo.NESTED),
	   new VariableInfo("nodeID", "java.lang.String", true, 
			    VariableInfo.NESTED),
	   new VariableInfo("contentURL", "java.lang.String", true, 
			    VariableInfo.NESTED),
	   new VariableInfo("expansionType", "java.lang.String", true, 
			    VariableInfo.NESTED)
       };
   }
}
