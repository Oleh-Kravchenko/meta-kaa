SUMMARY = "Library with a lot of useful C routines"
SECTION = "devel"
HOMEPAGE = "https://www.kaa.org.ua/libtools/"
BUGTRACKER = "https://github.com/Oleh-Kravchenko/libtools/issues"

LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

PV = "git${SRCPV}"
SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/Oleh-Kravchenko/libtools.git;branch=master;protocol=https"
S = "${WORKDIR}/git"

DEPENDS = " \
	cmake-doxygen \
	cmake-version4git \
	doxygen-native \
"

inherit cmake

PACKAGECONFIG ??= "doc uriparser"
PACKAGECONFIG[doc] = "-DWITH_DOC=ON,-DWITH_DOC=OFF"
PACKAGECONFIG[mysql] = "-DWITH_MYSQL=ON,-DWITH_MYSQL=OFF,mysql"
PACKAGECONFIG[uriparser]="-DWITH_URIPARSER=ON,-DWITH_URIPARSER=OFF,uriparser pkgconfig-native"
