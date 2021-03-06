#
# @(#)GNUmakefile	1.3 06/10/30
# 
# Copyright (c) 2006 Sun Microsystems, Inc.  All Rights Reserved.
# 
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions
# are met:
# 
# - Redistribution of source code must retain the above copyright
#   notice, this list of conditions and the following disclaimer.
# 
# - Redistribution in binary form must reproduce the above copyright
#   notice, this list of conditions and the following disclaimer in
#   the documentation and/or other materials provided with the
#   distribution.
# 
# Neither the name of Sun Microsystems, Inc. or the names of
# contributors may be used to endorse or promote products derived
# from this software without specific prior written permission.
# 
# This software is provided "AS IS," without a warranty of any
# kind. ALL EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND
# WARRANTIES, INCLUDING ANY IMPLIED WARRANTY OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE OR NON-INFRINGEMENT, ARE HEREBY
# EXCLUDED. SUN MICROSYSTEMS, INC. ("SUN") AND ITS LICENSORS SHALL
# NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF
# USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS
# DERIVATIVES. IN NO EVENT WILL SUN OR ITS LICENSORS BE LIABLE FOR
# ANY LOST REVENUE, PROFIT OR DATA, OR FOR DIRECT, INDIRECT, SPECIAL,
# CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER CAUSED AND
# REGARDLESS OF THE THEORY OF LIABILITY, ARISING OUT OF THE USE OF OR
# INABILITY TO USE THIS SOFTWARE, EVEN IF SUN HAS BEEN ADVISED OF THE
# POSSIBILITY OF SUCH DAMAGES.
# 
# You acknowledge that this software is not designed, licensed or
# intended for use in the design, construction, operation or
# maintenance of any nuclear facility. 
#

# @(#)GNUmakefile 1.4 09/27/98
#
# Makefile for use on Solaris using gnumake.

# pictures.jar is the JAR that contains all the help information
HELP_JAR=../../hsjar/vertebrates.jar

JHHOME = ../../../javahelp
INDEXER=$(JHHOME)/bin/jhindexer
JAR=jar

HELP_META_FILES = \
	VertebratesMap.jhm \
	VertebratesTOC.xml \
	VertebratesIndex.xml

HELP_CONTENT_FILES := $(shell find Pages -name 'SCCS*' -prune -o -name '*.html' -print)

HELP_OTHER_FILES := $(shell find Pages -name 'SCCS*' -prune -o -name '*.jpg' -print)

HELP_SEARCH_FILES = \
	JavaHelpSearch/DOCS \
	JavaHelpSearch/DOCS.TAB \
	JavaHelpSearch/OFFSETS \
	JavaHelpSearch/POSITIONS \
	JavaHelpSearch/SCHEMA \
	JavaHelpSearch/TMAP

HELP_SOURCE_FILES = \
	Vertebrates.hs \
	jhexamples.css \
	$(HELP_META_FILES) \
	$(HELP_CONTENT_FILES) \
	$(HELP_OTHER_FILES)

all: ../../hsjar $(HELP_JAR)

searchfiles: $(HELP_SEARCH_FILES)

clean:
	rm -rf JavaHelpSearch $(HELP_JAR)

$(HELP_JAR): $(HELP_SOURCE_FILES) $(HELP_SEARCH_FILES)
	@rm -f $(HELP_JAR)
	$(JAR) cf $@ $(HELP_SOURCE_FILES) $(HELP_SEARCH_FILES)

$(HELP_SEARCH_FILES): $(HELP_CONTENT_FILES)
	@rm -f $(HELP_SEARCH_FILES)
	@mkdir -p JavaHelpSearch
	$(INDEXER) -db JavaHelpSearch -verbose $(HELP_CONTENT_FILES)

../../hsjar:
	mkdir -p ../../hsjar
