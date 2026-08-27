SUMMARY = "Adds uninstall target to CMake projects"
SECTION = "devel"
HOMEPAGE = "https://github.com/Oleh-Kravchenko/cmake-uninstall"
BUGTRACKER = "https://github.com/Oleh-Kravchenko/cmake-uninstall/issues"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=683dfc2de4133373b3e1c74810a83701"

PV = "git${SRCPV}"
SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/Oleh-Kravchenko/cmake-uninstall.git;branch=master;protocol=https"
S = "${WORKDIR}/git"

inherit allarch cmake

PACKAGES = "${PN}-dev"
DEV_PKG_DEPENDENCY = ""

DEPENDS = "cmake-version4git"

FILES:${PN}-dev = "${libdir}/cmake"
