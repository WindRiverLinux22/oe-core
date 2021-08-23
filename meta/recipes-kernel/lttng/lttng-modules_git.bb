require lttng-modules_2.13.3.bb

LIC_FILES_CHKSUM = "file://LICENSE;md5=0464cff101a009c403cd2ed65d01d4c4"
DEFAULT_PREFERENCE = "-1"
SRC_URI = "git://git.lttng.org/lttng-modules;branch=stable-2.13 \
           "

SRCREV = "fbba0d790598b76ae39d1c1944ea0c0d04ecb5ee"
PV = "2.13.0+git${SRCPV}"
S = "${WORKDIR}/git"
