SUMMARY = "C implementation of the logging library"
SECTION = "devel"
HOMEPAGE = "https://www.kaa.org.ua/liblog/"
BUGTRACKER = "https://github.com/Oleh-Kravchenko/liblog/issues"

LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

PV = "git${SRCPV}"
SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/Oleh-Kravchenko/liblog.git;branch=master;protocol=https"
S = "${WORKDIR}/git"

DEPENDS = " \
	doxygen-native \
	libtools \
"

inherit cmake
