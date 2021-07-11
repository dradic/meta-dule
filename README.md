This README file contains information on the contents of the meta-dule layer.

The meta-dule layer contains the recipes that are generating a raspberrypi4 based 
Network Firewall OS.

Please see the corresponding sections below for details.

DISCLAIMER
==========

Please note: all tools/ scripts in this repo are released for use "AS IS" 
without any warranties of any kind, including, but not limited to their 
installation, use, or performance. We disclaim any and all warranties, either 
express or implied, including but not limited to any warranty of nonin-
fringement, merchantability, and/ or fitness for a particular purpose. We do 
not warrant that the technology will meet your requirements, that the operation
thereof will be uninterrupted or error-free, or that any errors will be 
corrected.

Any use of these scripts and tools is at your own risk. There is no guarantee 
that they have been through thorough testing in a comparable environment and we
are not responsible for any damage or data loss incurred with their use.

You are responsible for reviewing and testing any scripts you run thoroughly 
before use in any non-testing environment.

Dependencies
============

  URI: https://github.com/agherzan/meta-raspberrypi.git
  branch: hardknott

  URI: https://github.com/openembedded/meta-openembedded.git 
  branch: hardknott

  URI: git://git.yoctoproject.org/poky
  branch: hardknott

Patches
=======

Please submit any patches against the meta-dule layer to the xxxx mailing list (xxxx@zzzz.org)
and cc: the maintainer:

Maintainer: XXX YYYYYY <xxx.yyyyyy@zzzzz.com>

Table of Contents
=================

   I. Adding the meta-dule layer to your build
  II. Misc
 III. Building the image


I. Adding the meta-dule layer to your build
=================================================

Run 'bitbake-layers add-layer meta-dule'

II. Misc
========

Enter your user and root passwords in recipes-core/images/core-image-base.bbappend

III. Building the image
=======================

Source your environment and build an image witch

bitbake core-image-base

