DESCRIPTION = "Heart Rate Monitor module"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit module

COMPATIBLE_MACHINE = "qemuarm"

SRC_URI = "file://Makefile \
	   file://data.h   \
	   file://heartbeatmodule.c \
	  "

S = "${WORKDIR}"
