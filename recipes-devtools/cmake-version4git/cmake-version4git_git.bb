SUMMARY = "Projects version definition with Git tags and CMake"
SECTION = "devel"
HOMEPAGE = "https://github.com/Oleh-Kravchenko/cmake-version4git"
BUGTRACKER = "https://github.com/Oleh-Kravchenko/cmake-version4git/issues"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f967ca707a6df9d1e6b584c85f4d8779"

PV = "git${SRCPV}"
SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/Oleh-Kravchenko/cmake-version4git.git;branch=master;protocol=https"
S = "${WORKDIR}/git"

inherit allarch cmake

PACKAGES = "${PN}-dev"
DEV_PKG_DEPENDENCY = ""

DEPENDS = "git-native"
RDEPENDS:${PN}-dev = "git"

FILES:${PN}-dev = "${libdir}/cmake"
